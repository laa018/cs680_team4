package cvsanaly;

// Generated Apr 27, 2013 2:07:58 PM by Hibernate Tools 4.0.0

/**
 * FileCopies generated by hbm2java
 */
public class FileCopies implements java.io.Serializable {

	private int id;
	private Integer toId;
	private Integer fromId;
	private Integer fromCommitId;
	private String newFileName;
	private Integer actionId;

	public FileCopies() {
	}

	public FileCopies(int id) {
		this.id = id;
	}

	public FileCopies(int id, Integer toId, Integer fromId,
			Integer fromCommitId, String newFileName, Integer actionId) {
		this.id = id;
		this.toId = toId;
		this.fromId = fromId;
		this.fromCommitId = fromCommitId;
		this.newFileName = newFileName;
		this.actionId = actionId;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Integer getToId() {
		return this.toId;
	}

	public void setToId(Integer toId) {
		this.toId = toId;
	}

	public Integer getFromId() {
		return this.fromId;
	}

	public void setFromId(Integer fromId) {
		this.fromId = fromId;
	}

	public Integer getFromCommitId() {
		return this.fromCommitId;
	}

	public void setFromCommitId(Integer fromCommitId) {
		this.fromCommitId = fromCommitId;
	}

	public String getNewFileName() {
		return this.newFileName;
	}

	public void setNewFileName(String newFileName) {
		this.newFileName = newFileName;
	}

	public Integer getActionId() {
		return this.actionId;
	}

	public void setActionId(Integer actionId) {
		this.actionId = actionId;
	}

}
