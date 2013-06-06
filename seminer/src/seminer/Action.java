package seminer;

import java.util.Date;

public class Action {

	int action_id;
	String project_name; 
	String action_type; 
	Integer lines_added; 
	Integer lines_removed; 
	Integer lines_modified; 
	Date action_timestamp; 
	Integer revision; 
	String patch_name; 
	String commit_message; 
	String release_number; 
	Integer file_id; 
	String relative_path; 
	String branch_name; 
	Integer issue_id; 
	String person_id; 
	String alias;
	public int getAction_id() {
		return action_id;
	}
	public void setAction_id(int action_id) {
		this.action_id = action_id;
	}
	public String getProject_name() {
		return project_name;
	}
	public void setProject_name(String project_name) {
		this.project_name = project_name;
	}
	public String getAction_type() {
		return action_type;
	}
	public void setAction_type(String action_type) {
		this.action_type = action_type;
	}
	public Integer getLines_added() {
		return lines_added;
	}
	public void setLines_added(Integer lines_added) {
		this.lines_added = lines_added;
	}
	public Integer getLines_removed() {
		return lines_removed;
	}
	public void setLines_removed(Integer lines_removed) {
		this.lines_removed = lines_removed;
	}
	public Integer getLines_modified() {
		return lines_modified;
	}
	public void setLines_modified(Integer lines_modified) {
		this.lines_modified = lines_modified;
	}
	public Date getAction_timestamp() {
		return action_timestamp;
	}
	public void setAction_timestamp(Date action_timestamp) {
		this.action_timestamp = action_timestamp;
	}
	public Integer getRevision() {
		return revision;
	}
	public void setRevision(Integer revision) {
		this.revision = revision;
	}
	public String getPatch_name() {
		return patch_name;
	}
	public void setPatch_name(String patch_name) {
		this.patch_name = patch_name;
	}
	public String getCommit_message() {
		return commit_message;
	}
	public void setCommit_message(String commit_message) {
		this.commit_message = commit_message;
	}
	public String getRelease_number() {
		return release_number;
	}
	public void setRelease_number(String release_number) {
		this.release_number = release_number;
	}
	public Integer getFile_id() {
		return file_id;
	}
	public void setFile_id(Integer file_id) {
		this.file_id = file_id;
	}
	public String getRelative_path() {
		return relative_path;
	}
	public void setRelative_path(String relative_path) {
		this.relative_path = relative_path;
	}
	public String getBranch_name() {
		return branch_name;
	}
	public void setBranch_name(String branch_name) {
		this.branch_name = branch_name;
	}
	public Integer getIssue_id() {
		return issue_id;
	}
	public void setIssue_id(Integer issue_id) {
		this.issue_id = issue_id;
	}
	public String getPerson_id() {
		return person_id;
	}
	public void setPerson_id(String person_id) {
		this.person_id = person_id;
	}
	public String getAlias() {
		return alias;
	}
	public void setAlias(String alias) {
		this.alias = alias;
	}

	
		
	
}
