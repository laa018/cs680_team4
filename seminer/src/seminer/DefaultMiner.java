package seminer;

import org.hibernate.Session;

public class DefaultMiner implements Miner {
	ActionReader actionReader;

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
		// TODO Auto-generated method stub

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
		// TODO Auto-generated method stub

	}

	@Override
	public void mine(String project) {
		boolean write = false;
		boolean linkOnly = false;
		
		Project gedit = new Project();
		gedit.setProjectName("gedit");
		gedit.setBugTrackingSystem("bugzilla");
		gedit.setRepository("git");
		gedit.setMailingList("https://mail.gnome.org/archives/gedit-list/");
		
		Project wireshark = new Project();
		wireshark.setProjectName("wireshark");
		wireshark.setBugTrackingSystem("bugzilla");
		wireshark.setRepository("svn");
		wireshark.setMailingList("http://www.wireshark.org/lists/wireshark-dev/");

		int repositoryIdStart = 1;
		Project[] projects = { null, gedit, wireshark };

		DeMiner deMiner = new DeMiner();
		deMiner.setWrite(write);
		for(int i = repositoryIdStart; i < projects.length; i++) {
			System.out.println("Removing " + projects[i].getProjectName());
			deMiner.mine(i, projects[i].getProjectName());
		}
		
		Session effortMetricsSession = MinerUtils.openSession("effortmetrics/effortmetrics_hibernate.cfg.xml");
		effortMetricsSession.beginTransaction();
		try {
			if(write) {
				for(int i = repositoryIdStart; i < projects.length; i++) {
					effortMetricsSession.saveOrUpdate(projects[i]);
				}
			}	
		} finally {
			MinerUtils.commitAndCloseSession(effortMetricsSession);
		}
		
		ReleaseMiner releaseMiner = new ReleaseMiner();
		releaseMiner.setWrite(write);
		for(int i = repositoryIdStart; i < projects.length; i++) {
			System.out.println("Mining releases for " + projects[i].getProjectName());
			releaseMiner.mine(i, projects[i].getProjectName());
		}
		
//		ActionMiner actionMiner = new ActionMiner();
//		actionMiner.setWrite(write);
//		for(int i = repositoryIdStart; i < projects.length; i++) {
//			System.out.println("Mining actions for " + projects[i].getProjectName());
//			actionMiner.mine(i, projects[i].getProjectName());
//		}

		//new ActionReader call
		actionReader.setWrite(write);
		for(int i = repositoryIdStart; i < projects.length; i++) {
			System.out.println("Mining actions for " + projects[i].getProjectName());
			actionReader.parseFile(i, projects[i].getProjectName());
		}
		
		FileMiner fileMiner = new FileMiner();
		fileMiner.setWrite(write);
		fileMiner.setLinkOnly(linkOnly);
		for(int i = repositoryIdStart; i < projects.length; i++) {
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
		for(int i = repositoryIdStart; i < projects.length; i++) {
			System.out.println("Mining people for " + projects[i].getProjectName());
			try {
				peopleMiner.mine(i, projects[i].getProjectName());
			} catch (Exception e) {
				e.printStackTrace(System.out);
			}
		}
		
	}

}
