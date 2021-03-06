package cvsanaly;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

import seminer.Action;
import seminer.ActionReader;
import seminer.MinerUtils;

public class CvsAnalyActionReader implements ActionReader {
	
	private final static String tagquery = "SELECT DISTINCT tags.name FROM tags LEFT OUTER JOIN tag_revisions ON tag_revisions.tag_id = tags.id LEFT OUTER JOIN file_links ON file_links.commit_id = tag_revisions.commit_id";
	private Session s;
	private Session e;
	
	public CvsAnalyActionReader(Session s, Session e) {
		this.s = s;
		this.e = e;
	}
	
	@Override
	public List<Action> parseFile(String projectName) {
		Integer maxId = (Integer)e.createQuery("SELECT MAX(action_id) FROM Action").uniqueResult();
		
		List<Object[]> resultList = s.createSQLQuery("SELECT * FROM scmlog LEFT OUTER JOIN actions ON actions.commit_id = scmlog.id " + /*LEFT OUTER JOIN commits_lines ON commits_lines.commit_id = scmlog.id*/ "LEFT OUTER JOIN repositories ON repositories.id = scmlog.repository_id WHERE repositories.name LIKE '%" + projectName + "%'").addEntity("scmlog", Scmlog.class).addEntity("actions", Actions.class)/*.addEntity("commits_lines", CommitsLines.class)*/.addEntity("repositories", Repositories.class).list();
		List<Action> actionList = new ArrayList<Action>();

		for (Object[] result : resultList) {
			Scmlog scmlog = (Scmlog)result[0];
			Actions cvsanalyAction = (Actions)result[1];
			/*CommitsLines commitsLines = (CommitsLines)result[2];*/
			
			String release_number = (String) s.createSQLQuery(tagquery + " WHERE tag_revisions.commit_id = " + scmlog.getId()).uniqueResult();
			
			Action effortMetricsAction = new Action();
			effortMetricsAction.setProject_name(projectName);
			effortMetricsAction.setAction_id(++maxId);
			effortMetricsAction.setAction_timestamp(scmlog.getDate());
			effortMetricsAction.setAction_type("Version Control Commits");
			effortMetricsAction.setCommit_message(scmlog.getMessage());			
			//effortMetricsAction.setIssue_id(issue_id);
			/*effortMetricsAction.setLines_added(commitsLines.getAdded());*/
			//effortMetricsAction.setLines_modified(lines_modified);
			/*effortMetricsAction.setLines_removed(commitsLines.getRemoved());*/
			//effortMetricsAction.setPatch_name(patch_name);
			effortMetricsAction.setPerson_id(scmlog.getCommitterId().toString()); // Overwrite later when importing people
			//effortMetricsAction.setAlias(alias);
			effortMetricsAction.setFile_id(cvsanalyAction.getFileId()); // Overwrite later when importing files
			//effortMetricsAction.setRelative_path(relative_path);
			//effortMetricsAction.setBranch_name(branch_name);
			effortMetricsAction.setRelease_number(release_number);
			String revisionNumber = scmlog.getRev();
			try {
				effortMetricsAction.setRevision(Integer.valueOf(revisionNumber));
			} catch (NumberFormatException e) {
				
			}
			
			actionList.add(effortMetricsAction);
		}
		
		return actionList;
	}
	
}
