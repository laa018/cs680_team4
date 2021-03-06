package cvsanaly;

// Generated Apr 27, 2013 2:07:58 PM by Hibernate Tools 4.0.0

/**
 * Actions generated by hbm2java
 */
public class Actions implements java.io.Serializable {

	private int id;
	private String type;
	private Integer fileId;
	private Integer commitId;
	private Integer branchId;

	public Actions() {
	}

	public Actions(int id) {
		this.id = id;
	}

	public Actions(int id, String type, Integer fileId, Integer commitId,
			Integer branchId) {
		this.id = id;
		this.type = type;
		this.fileId = fileId;
		this.commitId = commitId;
		this.branchId = branchId;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getFileId() {
		return this.fileId;
	}

	public void setFileId(Integer fileId) {
		this.fileId = fileId;
	}

	public Integer getCommitId() {
		return this.commitId;
	}

	public void setCommitId(Integer commitId) {
		this.commitId = commitId;
	}

	public Integer getBranchId() {
		return this.branchId;
	}

	public void setBranchId(Integer branchId) {
		this.branchId = branchId;
	}

}
