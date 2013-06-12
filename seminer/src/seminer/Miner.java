package seminer;

public interface Miner {

	public void setActionReader(ActionReader r);
	
	public void setFileReader(FileReader r);
	
	public void setIssueReader(IssueReader r);
	
	public void setMailingListReader(MailingListReader r);
	
	public void setPeopleReader(PeopleReader r);

	public void setReleaseOverviewReader(ReleaseOverviewReader r);
	
	public void setWriter(Writer w);
	
	public void mine(Project[] projects);
	
}
