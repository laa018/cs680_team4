package bicho;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

import seminer.IssueReader;
import seminer.Issues;
import seminer.MinerUtils;

public class BichoReader implements IssueReader {

	public List<Issues> parseFile(String projectName) {
		Session effortMetricsSession = MinerUtils.openSession("effortmetrics/effortmetrics_hibernate.cfg.xml");
		
		Session bichoSession = MinerUtils.openSession("bicho/bicho_hibernate.cfg.xml");	
		List<Object[]> resultList = bichoSession.createSQLQuery("SELECT * FROM issues LEFT OUTER JOIN changes ON issues.tracker_id = changes.id LEFT OUTER JOIN trackers ON trackers.id = issues.tracker_id  WHERE trackers.url LIKE '%" + projectName + "%'").addEntity("issues", bicho.Issues.class).addEntity("changes", Changes.class).addEntity("trackers", Trackers.class).list();
		List<Issues> issueList = new ArrayList<Issues>();
		for (Object[] result : resultList) {
			bicho.Issues bichoIssue = (bicho.Issues)result[0];
			Changes bichoChanges = (Changes)result[1];
			
			Issues effortMetricsIssue = new Issues();
			effortMetricsIssue.setProject_name(projectName);
			effortMetricsIssue.setIssue_id(bichoIssue.getTrackerId() + "");
			effortMetricsIssue.setIssue_update_timestamp(bichoChanges.getChangedOn());
			effortMetricsIssue.setIssue_summary(bichoIssue.getSummary());
			effortMetricsIssue.setIssue_description(bichoIssue.getDescription());
			effortMetricsIssue.setIssue_submit_timestamp(bichoIssue.getSubmittedOn());		
			effortMetricsIssue.setIssue_resolution(bichoIssue.getResolution());	
			effortMetricsIssue.setIssue_priority(bichoIssue.getPriority());	
			effortMetricsIssue.setIssue_type(bichoIssue.getType());
			effortMetricsIssue.setIssue_status(bichoIssue.getStatus());
			
			//getting people's names
			bicho.People assignedPerson = (bicho.People)bichoSession.createSQLQuery("SELECT * from people where people.id = " + bichoIssue.getAssignedTo()).addEntity("people", bicho.People.class).uniqueResult();
			effortMetricsIssue.setIssue_assigned_to(assignedPerson.getName());
			bicho.People submittedPerson = (bicho.People)bichoSession.createSQLQuery("SELECT * from people where people.id = " + bichoIssue.getSubmittedBy()).addEntity("people", bicho.People.class).uniqueResult();
			effortMetricsIssue.setIssue_submitted_by(submittedPerson.getName());
			
			issueList.add(effortMetricsIssue);
		}
		
		MinerUtils.commitAndCloseSession(effortMetricsSession);
		MinerUtils.commitAndCloseSession(bichoSession);
		return issueList;
	}

}
