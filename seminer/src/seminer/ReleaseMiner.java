package seminer;

import java.util.List;

import org.hibernate.Session;

import cvsanaly.Scmlog;
import cvsanaly.Tags;

public class ReleaseMiner {

	boolean write;
	
	public boolean isWrite() {
		return write;
	}
	
	public void setWrite(boolean write) {
		this.write = write;
	}
	
	public void mine(int repositoryId, String projectName) {
		Session cvsanalySession = MinerUtils.openSession("cvsanaly/cvsanaly_hibernate.cfg.xml");
		cvsanalySession.beginTransaction();
				
		Session effortMetricsSession = MinerUtils.openSession("effortmetrics/effortmetrics_hibernate.cfg.xml");
		effortMetricsSession.beginTransaction();

		List<Object[]> results = cvsanalySession.createSQLQuery("SELECT {tags.*}, {scmlog.*} FROM tags LEFT OUTER JOIN tag_revisions ON tags.id = tag_revisions.tag_id LEFT OUTER JOIN scmlog ON scmlog.id = tag_revisions.commit_id WHERE scmlog.repository_id = " + repositoryId).addEntity("tags", Tags.class).addEntity("scmlog", Scmlog.class).list();
		for (Object[] result : results) {
			Tags tag = (Tags)result[0];
			Scmlog scmlog = (Scmlog)result[1];
			System.out.println(tag.getName() + " created on " + scmlog.getDate());
			
			ReleaseOverview releaseOverview = new ReleaseOverview();
			releaseOverview.setRelease_number(tag.getName());
			releaseOverview.setProject_name(projectName);
			releaseOverview.setRelease_timestamp(scmlog.getDate());

			if(write) {
				effortMetricsSession.saveOrUpdate(releaseOverview);
			}
		}
	}
}
