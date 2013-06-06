package effortmetrics;

import java.util.Date;

public class Project {

	Date endTimestamp;
	String wiki;
	String irc;
	String mailingList;
	String repository;
	String bugTrackingSystem;
	Date startTimestamp;
	String owner;
	String projectName;
	public Date getEndTimestamp() {
		return endTimestamp;
	}
	public void setEndTimestamp(Date endTimestamp) {
		this.endTimestamp = endTimestamp;
	}
	public String getWiki() {
		return wiki;
	}
	public void setWiki(String wiki) {
		this.wiki = wiki;
	}
	public String getIrc() {
		return irc;
	}
	public void setIrc(String irc) {
		this.irc = irc;
	}
	public String getMailingList() {
		return mailingList;
	}
	public void setMailingList(String mailingList) {
		this.mailingList = mailingList;
	}
	public String getRepository() {
		return repository;
	}
	public void setRepository(String repository) {
		this.repository = repository;
	}
	public String getBugTrackingSystem() {
		return bugTrackingSystem;
	}
	public void setBugTrackingSystem(String bugTrackingSystem) {
		this.bugTrackingSystem = bugTrackingSystem;
	}
	public Date getStartTimestamp() {
		return startTimestamp;
	}
	public void setStartTimestamp(Date startTimestamp) {
		this.startTimestamp = startTimestamp;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	
	
	
}
