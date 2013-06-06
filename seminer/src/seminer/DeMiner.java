package seminer;

import org.hibernate.Session;

public class DeMiner {

	private boolean write;
	
	public boolean isWrite() {
		return write;
	}
	
	public void setWrite(boolean write) {
		this.write = write;
	}
	
	public void mine(int repositoryId, String projectName) {
		if(write) {
			Session s = MinerUtils.openSession("effortmetrics/effortmetrics_hibernate.cfg.xml");
			s.beginTransaction();
			s.createQuery("DELETE FROM Project WHERE project_name = '" + projectName + "'");
			s.createQuery("DELETE FROM Action WHERE project_name = '" + projectName + "'");
			s.createQuery("DELETE FROM File WHERE project_name = '" + projectName + "'");
			s.createQuery("DELETE FROM People WHERE project_name = '" + projectName + "'");
			s.getTransaction().commit();
			s.close();
		}
	}
	
}
