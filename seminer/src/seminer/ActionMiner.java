package seminer;

import java.util.List;

import org.hibernate.Session;

import cvsanaly.Actions;
import cvsanaly.CommitsLines;
import cvsanaly.Scmlog;

public class ActionMiner {
	
	private final static String tagquery = "SELECT DISTINCT tags.name FROM tags LEFT OUTER JOIN tag_revisions ON tag_revisions.tag_id = tags.id LEFT OUTER JOIN file_links ON file_links.commit_id = tag_revisions.commit_id";
	
	private boolean write;
	
	public boolean isWrite() {
		return write;
	}
	
	public void setWrite(boolean write) {
		this.write = write;
	}
	
	public void mine(int repositoryId, String projectName) {		
		Session effortMetricsSession = MinerUtils.openSession("effortmetrics/effortmetrics_hibernate.cfg.xml");
		if(isTableDirty(effortMetricsSession, projectName)) {
			MinerUtils.commitAndCloseSession(effortMetricsSession);
			return;
		}

		Integer maxId = (Integer)effortMetricsSession.createQuery("SELECT MAX(action_id) FROM Action").uniqueResult();
		
		Session cvsanalySession = MinerUtils.openSession("cvsanaly/cvsanaly_hibernate.cfg.xml");		
		List<Object[]> resultList = cvsanalySession.createSQLQuery("SELECT * FROM scmlog LEFT OUTER JOIN actions ON actions.commit_id = scmlog.id LEFT OUTER JOIN commits_lines ON commits_lines.commit_id = scmlog.id WHERE scmlog.repository_id = " + repositoryId).addEntity("scmlog", Scmlog.class).addEntity("actions", Actions.class).addEntity("commits_lines", CommitsLines.class).list();
		for (Object[] result : resultList) {
			Scmlog scmlog = (Scmlog)result[0];
			Actions cvsanalyAction = (Actions)result[1];
			CommitsLines commitsLines = (CommitsLines)result[2];
			
			String release_number = (String) cvsanalySession.createSQLQuery(tagquery + " WHERE commit_id = " + scmlog.getId()).uniqueResult();
			
			Action effortMetricsAction = new Action();
			effortMetricsAction.setProject_name(projectName);
			effortMetricsAction.setAction_id(++maxId);
			effortMetricsAction.setAction_timestamp(scmlog.getDate());
			effortMetricsAction.setAction_type("Version Control Commits");
			effortMetricsAction.setCommit_message(scmlog.getMessage());			
			//effortMetricsAction.setIssue_id(issue_id);
			effortMetricsAction.setLines_added(commitsLines.getAdded());
			//effortMetricsAction.setLines_modified(lines_modified);
			effortMetricsAction.setLines_removed(commitsLines.getRemoved());
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
			if(write) {
				effortMetricsSession.save(effortMetricsAction);
			}
		}
		
		MinerUtils.commitAndCloseSession(effortMetricsSession);
		MinerUtils.commitAndCloseSession(cvsanalySession);
	}

	private boolean isTableDirty(Session s, String projectName) {
		List results = s.createQuery("FROM Action WHERE project_name = '" + projectName + "'").list();
		if(results.size() > 0) {
			return false;
		} else {
			return true;
		}
	}

	public static void update(Session s, String projectName, int realId, seminer.People p2) {
		List<Action> actions = s.createQuery("FROM Action WHERE person_id = '" + realId + "' AND project_name = '" + projectName + "' AND alias IS NULL").list();
		for (Action action : actions) {
			action.setPerson_id(Integer.valueOf(p2.getPersonId()).toString());
			action.setAlias(p2.getAliases());
			s.update(action);
		}
	}
	
	public static void update(Session session, String projectName, int realId, File file) {
		List<Action> actions = session.createQuery("FROM Action WHERE file_id = " + realId + " AND project_name = '" + projectName + "' AND relative_path IS NULL AND branch_name IS NULL").list();
		for (Action action : actions) {
			action.setFile_id(file.getFile_id());
			action.setRelative_path(file.getRelative_path());
			action.setBranch_name(file.getBranch_name());
			session.update(action);
		}
	}

}
