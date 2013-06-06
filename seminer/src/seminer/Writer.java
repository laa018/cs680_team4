package seminer;

public interface Writer {

	public void writeAction(Action a);
	
	public void writeCommunication(Communication c);
	
	public void writeFile(File f);
	
	public void writeIssues(Issues i);
	
	public void writePeople(People p);
	
	public void writeProject(Project p);
	
	public void writeReleaseOverview(ReleaseOverview r);

}
