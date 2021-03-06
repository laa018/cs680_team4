package cvsanaly;

// Generated Apr 27, 2013 2:07:58 PM by Hibernate Tools 4.0.0

/**
 * CommitsLines generated by hbm2java
 */
public class CommitsLines implements java.io.Serializable {

	private int id;
	private Integer commitId;
	private Integer added;
	private Integer removed;

	public CommitsLines() {
	}

	public CommitsLines(int id) {
		this.id = id;
	}

	public CommitsLines(int id, Integer commitId, Integer added, Integer removed) {
		this.id = id;
		this.commitId = commitId;
		this.added = added;
		this.removed = removed;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Integer getCommitId() {
		return this.commitId;
	}

	public void setCommitId(Integer commitId) {
		this.commitId = commitId;
	}

	public Integer getAdded() {
		return this.added;
	}

	public void setAdded(Integer added) {
		this.added = added;
	}

	public Integer getRemoved() {
		return this.removed;
	}

	public void setRemoved(Integer removed) {
		this.removed = removed;
	}

}
