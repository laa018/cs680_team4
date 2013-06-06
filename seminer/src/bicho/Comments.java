package bicho;

// Generated Apr 27, 2013 2:06:40 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * Comments generated by hbm2java
 */
public class Comments implements java.io.Serializable {

	private Integer id;
	private int issueId;
	private Integer commentId;
	private String text;
	private int submittedBy;
	private Date submittedOn;

	public Comments() {
	}

	public Comments(int issueId, String text, int submittedBy, Date submittedOn) {
		this.issueId = issueId;
		this.text = text;
		this.submittedBy = submittedBy;
		this.submittedOn = submittedOn;
	}

	public Comments(int issueId, Integer commentId, String text,
			int submittedBy, Date submittedOn) {
		this.issueId = issueId;
		this.commentId = commentId;
		this.text = text;
		this.submittedBy = submittedBy;
		this.submittedOn = submittedOn;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getIssueId() {
		return this.issueId;
	}

	public void setIssueId(int issueId) {
		this.issueId = issueId;
	}

	public Integer getCommentId() {
		return this.commentId;
	}

	public void setCommentId(Integer commentId) {
		this.commentId = commentId;
	}

	public String getText() {
		return this.text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public int getSubmittedBy() {
		return this.submittedBy;
	}

	public void setSubmittedBy(int submittedBy) {
		this.submittedBy = submittedBy;
	}

	public Date getSubmittedOn() {
		return this.submittedOn;
	}

	public void setSubmittedOn(Date submittedOn) {
		this.submittedOn = submittedOn;
	}

}
