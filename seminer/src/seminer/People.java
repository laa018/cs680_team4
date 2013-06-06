package seminer;

import java.io.Serializable;

public class People implements Serializable {
	
	String systemInUse;
	String role;
	String email;
	String aliases;
	String authorName;
	int personId;
	String projectName;
	public String getSystemInUse() {
		return systemInUse;
	}
	public void setSystemInUse(String systemInUse) {
		this.systemInUse = systemInUse;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAliases() {
		return aliases;
	}
	public void setAliases(String aliases) {
		this.aliases = aliases;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public int getPersonId() {
		return personId;
	}
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

}
