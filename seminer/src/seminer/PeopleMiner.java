package seminer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;

import cvsanaly.Repositories;

public class PeopleMiner {

	boolean write;
	boolean linkOnly;
	
	public boolean isLinkOnly() {
		return linkOnly;
	}
	
	public void setLinkOnly(boolean linkOnly) {
		this.linkOnly = linkOnly;
	}
	
	public boolean isWrite() {
		return write;
	}
	
	public void setWrite(boolean write) {
		this.write = write;
	}
	
	public List<People> parseFile(String projectName) {
	   List<People> peopleList = new ArrayList<People>();
	   
		Session cvsanalySession = MinerUtils.openSession("cvsanaly/cvsanaly_hibernate.cfg.xml");
		cvsanalySession.beginTransaction();
		
		Session bichoSession = MinerUtils.openSession("bicho/bicho_hibernate.cfg.xml");
		bichoSession.beginTransaction();
		
		Session effortMetricsSession = MinerUtils.openSession("effortmetrics/effortmetrics_hibernate.cfg.xml");
		effortMetricsSession.beginTransaction();

		int repositoryId = 0;

         Repositories repository = (Repositories) cvsanalySession.createQuery(
               "FROM Repositories WHERE name  LIKE '%" + projectName + "%';");
         repositoryId = repository.getId();
         
		int i = 0;
		List<cvsanaly.People> cvsanalyPeople = cvsanalySession.createSQLQuery("select distinct people.* from people LEFT OUTER JOIN scmlog ON scmlog.author_id = people.id WHERE scmlog.repository_id = " + repositoryId).addEntity("people", cvsanaly.People.class).list();
		List<bicho.People> bichoPeople = bichoSession.createSQLQuery("select distinct people.* from people where tracker_id = " + repositoryId).addEntity("people", bicho.People.class).list();
		for (bicho.People bichoPerson : bichoPeople) {
			System.out.print(bichoPerson.getName() + " with aliases " + bichoPerson.getUserId());
			
			seminer.People effortMetricsPeople = new seminer.People();
			effortMetricsPeople.setProjectName(projectName);
			effortMetricsPeople.setPersonId(i);
			effortMetricsPeople.setAliases(bichoPerson.getUserId());
			effortMetricsPeople.setAuthorName(bichoPerson.getName());
			effortMetricsPeople.setEmail(bichoPerson.getEmail());
			if(write) {
				effortMetricsSession.saveOrUpdate(effortMetricsPeople);
			}

			for (Iterator iterator = cvsanalyPeople.iterator(); iterator.hasNext();) {
				cvsanaly.People cvsanalyPerson = (cvsanaly.People) iterator.next();				
				boolean match = false;
				if(bichoPerson.getName() != null && bichoPerson.getName().equalsIgnoreCase(cvsanalyPerson.getName())) {
					match = true;
				} else if(bichoPerson.getEmail() != null && bichoPerson.getEmail().equalsIgnoreCase(cvsanalyPerson.getEmail())) {
					match = true;
				} else if(bichoPerson.getEmail() != null && bichoPerson.getUserId().equalsIgnoreCase(cvsanalyPerson.getName())) {
					match = true;
				}
				boolean noAlias = false;
				if(match && cvsanalyPerson.getEmail() != null && cvsanalyPerson.getEmail().startsWith(bichoPerson.getUserId())) {
					noAlias = true;
				}
				
				if(match && ! noAlias) {
					System.out.print(", " + cvsanalyPerson.getEmail());
					seminer.People effortMetricsPeopleAlias = new seminer.People();
					effortMetricsPeopleAlias.setProjectName(projectName);
					effortMetricsPeopleAlias.setPersonId(i);
					effortMetricsPeopleAlias.setAliases(cvsanalyPerson.getEmail());
					effortMetricsPeopleAlias.setAuthorName(bichoPerson.getName());
					effortMetricsPeopleAlias.setEmail(bichoPerson.getEmail());
					if(write) {
						if(!linkOnly) {
							effortMetricsSession.saveOrUpdate(effortMetricsPeopleAlias);
						}
						ActionMiner.update(effortMetricsSession, projectName, cvsanalyPerson.getId(), effortMetricsPeopleAlias);
					}
				}
				
				if(match && noAlias) {
					ActionMiner.update(effortMetricsSession, projectName, cvsanalyPerson.getId(), effortMetricsPeople);						
				}
				
				if(match) {
					iterator.remove();
				}
			}
			System.out.println();
			i++;
		}
		for (cvsanaly.People cvsanalyPerson : cvsanalyPeople) {
			seminer.People effortMetricsPeople = new seminer.People();
			effortMetricsPeople.setProjectName(projectName);
			effortMetricsPeople.setPersonId(i);
			effortMetricsPeople.setAliases(cvsanalyPerson.getEmail());
			effortMetricsPeople.setAuthorName(cvsanalyPerson.getName());
			effortMetricsPeople.setEmail(cvsanalyPerson.getEmail());
//			if(write) {
//				if(!linkOnly) {
//					effortMetricsSession.saveOrUpdate(effortMetricsPeople);
//				}
//				ActionMiner.update(effortMetricsSession, projectName, cvsanalyPerson.getId(), effortMetricsPeople);
//			}
			peopleList.add(effortMetricsPeople);
			i++;
		}
		
		effortMetricsSession.getTransaction().commit();
		effortMetricsSession.close();
		if(bichoSession.getTransaction().isActive()) {
			bichoSession.getTransaction().commit();
		}
		if(bichoSession.isOpen()) {
			bichoSession.close();
		}
		if(cvsanalySession.getTransaction().isActive()) {
			cvsanalySession.getTransaction().commit();
		}
		if(cvsanalySession.isOpen()) {
			cvsanalySession.close();
		}
		return peopleList;
	}
	
}
