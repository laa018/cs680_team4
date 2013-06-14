package bicho;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;

import seminer.IssueReader;
import seminer.Issues;

public class BichoReader implements IssueReader {

	private Session s;
	
	public BichoReader(Session s) {
		this.s = s;
	}
	
	public List<Issues> parseFile(String projectName) {
		Set<Issues.IssuePk> pkSet = new HashSet<Issues.IssuePk>();
		List<Object[]> resultList = s.createSQLQuery("SELECT {issues.*}, {changes.*} FROM issues LEFT OUTER JOIN changes ON changes.issue_id = issues.id LEFT OUTER JOIN trackers ON trackers.id = issues.tracker_id  WHERE trackers.url LIKE '%" + projectName + "%'").addEntity("issues", bicho.Issues.class).addEntity("changes", Changes.class).list();
		List<Issues> issueList = new ArrayList<Issues>();
		for (Object[] result : resultList) {
			bicho.Issues bichoIssue = (bicho.Issues)result[0];
			Changes bichoChanges = (Changes)result[1];
			
			Issues effortMetricsIssue = new Issues();
			effortMetricsIssue.setProject_name(projectName);
			effortMetricsIssue.setIssue_id(bichoIssue.getId().toString());
			effortMetricsIssue.setIssue_update_timestamp((bichoChanges != null) ? bichoChanges.getChangedOn() : bichoIssue.getSubmittedOn());
			effortMetricsIssue.setIssue_summary(bichoIssue.getSummary());
			effortMetricsIssue.setIssue_description(bichoIssue.getDescription());
			effortMetricsIssue.setIssue_submit_timestamp(bichoIssue.getSubmittedOn());		
			effortMetricsIssue.setIssue_resolution(bichoIssue.getResolution());	
			effortMetricsIssue.setIssue_priority(bichoIssue.getPriority());	
			effortMetricsIssue.setIssue_type(bichoIssue.getType());
			effortMetricsIssue.setIssue_status(bichoIssue.getStatus());
			
			//getting people's names
			bicho.People assignedPerson = (bicho.People)s.createSQLQuery("SELECT * from people where people.id = " + bichoIssue.getAssignedTo()).addEntity("people", bicho.People.class).uniqueResult();
			effortMetricsIssue.setIssue_assigned_to(assignedPerson.getName());
			bicho.People submittedPerson = (bicho.People)s.createSQLQuery("SELECT * from people where people.id = " + bichoIssue.getSubmittedBy()).addEntity("people", bicho.People.class).uniqueResult();
			effortMetricsIssue.setIssue_submitted_by(submittedPerson.getName());
			
			if(!pkSet.contains(effortMetricsIssue.getPk())) {
				pkSet.add(effortMetricsIssue.getPk());
				issueList.add(effortMetricsIssue);
			}
		}
		
		return issueList;
	}

}
