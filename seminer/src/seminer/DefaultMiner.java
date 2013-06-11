package seminer;

import java.util.List;

import org.hibernate.Session;

public class DefaultMiner implements Miner {
	ActionReader actionReader;
	IssueReader issueReader;
	Writer writer;
	
	@Override
	public void setActionReader(ActionReader r) {
		this.actionReader = r;

	}

	@Override
	public void setFileReader(FileReader r) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setIssueReader(IssueReader r) {
		this.issueReader = r;

	}

	@Override
	public void setMailingListReader(MailingListReader r) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setPeopleReader(PeopleReader r) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setWriter(Writer w) {
		this.writer = w;

	}

	@Override
	public void mine(Project[] projects) {
		boolean write = false;
		boolean linkOnly = false;

		DeMiner deMiner = new DeMiner();
		deMiner.setWrite(write);
		for(int i = 0; i < projects.length; i++) {
			System.out.println("Removing " + projects[i].getProjectName());
			deMiner.mine(i, projects[i].getProjectName());
		}
		
		//Writing for Project objects
		for(int i = 0; i < projects.length; i++) {
			writer.writeProject(projects[i]);	
		}
		
		Session effortMetricsSession = MinerUtils.openSession("effortmetrics/effortmetrics_hibernate.cfg.xml");
		effortMetricsSession.beginTransaction();
		try {
			if(write) {
				for(int i = 0; i < projects.length; i++) {
					effortMetricsSession.saveOrUpdate(projects[i]);
				}
			}	
		} finally {
			MinerUtils.commitAndCloseSession(effortMetricsSession);
		}
		
		ReleaseMiner releaseMiner = new ReleaseMiner();
		releaseMiner.setWrite(write);
		for(int i = 0; i < projects.length; i++) {
			System.out.println("Mining releases for " + projects[i].getProjectName());
			releaseMiner.mine(i, projects[i].getProjectName());
		}

		//Parsing and writing for Action objects
		for(int i = 0; i < projects.length; i++) {
			System.out.println("Mining actions for " + projects[i].getProjectName());
			List<Action> actionList = actionReader.parseFile(projects[i].getProjectName());
			
			for (int z = 0; z < actionList.size(); z++){
				writer.writeAction(actionList.get(z));
			}
			
		}

		//Parsing and writing for Issue objects
		for(int i = 0; i < projects.length; i++) {
			System.out.println("Mining issues for " + projects[i].getProjectName());
			List<Issues> issueList = issueReader.parseFile(projects[i].getProjectName());
			
			for (int z = 0; z < issueList.size(); z++){
				writer.writeIssues(issueList.get(z));
			}
			
		}
		
		FileMiner fileMiner = new FileMiner();
		fileMiner.setWrite(write);
		fileMiner.setLinkOnly(linkOnly);
		for(int i = 0; i < projects.length; i++) {
			System.out.println("Mining files for " + projects[i].getProjectName());
			try {
				fileMiner.mine(i, projects[i].getProjectName());
			} catch (Exception e) {
				e.printStackTrace(System.out);
			}
		}
		
		PeopleMiner peopleMiner = new PeopleMiner();
		peopleMiner.setWrite(write);
		peopleMiner.setLinkOnly(linkOnly);
		for(int i = 0; i < projects.length; i++) {
			System.out.println("Mining people for " + projects[i].getProjectName());
			try {
				peopleMiner.mine(i, projects[i].getProjectName());
			} catch (Exception e) {
				e.printStackTrace(System.out);
			}
		}
		
	}

}
