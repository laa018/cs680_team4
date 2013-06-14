package effortmetrics;

import org.hibernate.Session;

import seminer.Action;
import seminer.Communication;
import seminer.File;
import seminer.Issues;
import seminer.People;
import seminer.Project;
import seminer.ReleaseOverview;
import seminer.Writer;

public class EffortmetricsWriter implements Writer {

	static final int BATCH_SIZE = 500;
	
	private Session s;
	private int c = 0;
	private int currentMaxActionId;
	
	public EffortmetricsWriter(Session s) {
		this.s = s;
		if(!s.getTransaction().isActive()) {
			s.beginTransaction();
		}
		this.currentMaxActionId = (Integer)s.createQuery("SELECT MAX(action_id) FROM Action").uniqueResult();
	}
	
	@Override
	public void writeAction(Action a) {
		a.setAction_id(++currentMaxActionId);
		write(a);
	}

	@Override
	public void writeCommunication(Communication c) {
		write(c);
	}

	@Override
	public void writeFile(File f) {
		write(f);
	}

	@Override
	public void writeIssues(Issues i) {
		System.out.println(i.getIssue_id() + " " + i.getIssue_update_timestamp());
		write(i);
	}

	@Override
	public void writePeople(People p) {
		write(p);
	}

	@Override
	public void writeProject(Project p) {
		write(p);
	}

	@Override
	public void writeReleaseOverview(ReleaseOverview r) {
		write(r);
	}
	
	private void write(Object o) {
		s.save(o);
		if(++c == BATCH_SIZE) {
			s.flush();
			s.clear();
			c = 0;
		}
	}

}
