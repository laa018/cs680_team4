package seminer;

public class ConsoleWriter implements Writer {

	@Override
	public void writeAction(Action a) {
		System.out.println("Action " + a.getAction_id() + " by " + a.getAlias() + " on " + a.getProject_name());
	}

	@Override
	public void writeCommunication(Communication c) {
		System.out.println("Communication " + c.getMessage_id() + " by " + c.getAlias() + " on " + c.getProject_name());
	}

	@Override
	public void writeFile(File f) {
		System.out.println("File " + f.getFile_id() + " " + f.getRelative_path() + " on " + f.getProject_name());
	}

	@Override
	public void writeIssues(Issues i) {
		System.out.println("Issue " + i.getIssue_id() + " " + i.getIssue_summary() + " on " + i.getProject_name());
	}

	@Override
	public void writePeople(People p) {
		System.out.println("Person " + p.getPersonId() + " " + p.getAuthorName() + " on " + p.getProjectName());
	}

	@Override
	public void writeProject(Project p) {
		System.out.println("Project " + p.getProjectName() + " " + p.getRepository());
	}

	@Override
	public void writeReleaseOverview(ReleaseOverview r) {
		System.out.println("Release " + r.getRelease_number() + " on " + r.getProject_name());
	}

}
