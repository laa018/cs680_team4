package effortmetrics;

import java.util.Date;

public class ReleaseOverview {
	
	String release_number;
	String project_name;
	int num_of_files;
	int loc;
	Date release_timestamp;
	String release_location;
	int num_of_committers;
	int num_of_developers;
	int num_of_changerequest;
	String branch_name;
	public String getRelease_number() {
		return release_number;
	}
	public void setRelease_number(String release_number) {
		this.release_number = release_number;
	}
	public String getProject_name() {
		return project_name;
	}
	public void setProject_name(String project_name) {
		this.project_name = project_name;
	}
	public int getNum_of_files() {
		return num_of_files;
	}
	public void setNum_of_files(int num_of_files) {
		this.num_of_files = num_of_files;
	}
	public int getLoc() {
		return loc;
	}
	public void setLoc(int loc) {
		this.loc = loc;
	}
	public Date getRelease_timestamp() {
		return release_timestamp;
	}
	public void setRelease_timestamp(Date release_timestamp) {
		this.release_timestamp = release_timestamp;
	}
	public String getRelease_location() {
		return release_location;
	}
	public void setRelease_location(String release_location) {
		this.release_location = release_location;
	}
	public int getNum_of_committers() {
		return num_of_committers;
	}
	public void setNum_of_committers(int num_of_committers) {
		this.num_of_committers = num_of_committers;
	}
	public int getNum_of_developers() {
		return num_of_developers;
	}
	public void setNum_of_developers(int num_of_developers) {
		this.num_of_developers = num_of_developers;
	}
	public int getNum_of_changerequest() {
		return num_of_changerequest;
	}
	public void setNum_of_changerequest(int num_of_changerequest) {
		this.num_of_changerequest = num_of_changerequest;
	}
	public String getBranch_name() {
		return branch_name;
	}
	public void setBranch_name(String branch_name) {
		this.branch_name = branch_name;
	}

	
}
