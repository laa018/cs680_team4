package bicho;

// Generated Apr 27, 2013 2:06:40 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * IssuesExtBugzilla generated by hbm2java
 */
public class IssuesExtBugzilla implements java.io.Serializable {

	private Integer id;
	private String version;
	private String alias;
	private Date deltaTs;
	private String reporterAccessible;
	private String cclistAccessible;
	private String classificationId;
	private String classification;
	private String product;
	private String component;
	private String repPlatform;
	private String opSys;
	private Integer dupId;
	private String bugFileLoc;
	private String statusWhiteboard;
	private String targetMilestone;
	private Integer votes;
	private String everconfirmed;
	private String qaContact;
	private String estimatedTime;
	private String remainingTime;
	private String actualTime;
	private Date deadline;
	private String keywords;
	private String flag;
	private String cc;
	private String groupBugzilla;
	private int issueId;

	public IssuesExtBugzilla() {
	}

	public IssuesExtBugzilla(Date deltaTs, int issueId) {
		this.deltaTs = deltaTs;
		this.issueId = issueId;
	}

	public IssuesExtBugzilla(String alias, Date deltaTs,
			String reporterAccessible, String cclistAccessible,
			String classificationId, String classification, String product,
			String component, String repPlatform, String opSys, Integer dupId,
			String bugFileLoc, String statusWhiteboard, String targetMilestone,
			Integer votes, String everconfirmed, String qaContact,
			String estimatedTime, String remainingTime, String actualTime,
			Date deadline, String keywords, String flag, String cc,
			String groupBugzilla, int issueId) {
		this.alias = alias;
		this.deltaTs = deltaTs;
		this.reporterAccessible = reporterAccessible;
		this.cclistAccessible = cclistAccessible;
		this.classificationId = classificationId;
		this.classification = classification;
		this.product = product;
		this.component = component;
		this.repPlatform = repPlatform;
		this.opSys = opSys;
		this.dupId = dupId;
		this.bugFileLoc = bugFileLoc;
		this.statusWhiteboard = statusWhiteboard;
		this.targetMilestone = targetMilestone;
		this.votes = votes;
		this.everconfirmed = everconfirmed;
		this.qaContact = qaContact;
		this.estimatedTime = estimatedTime;
		this.remainingTime = remainingTime;
		this.actualTime = actualTime;
		this.deadline = deadline;
		this.keywords = keywords;
		this.flag = flag;
		this.cc = cc;
		this.groupBugzilla = groupBugzilla;
		this.issueId = issueId;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getVersion() {
		return this.version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getAlias() {
		return this.alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public Date getDeltaTs() {
		return this.deltaTs;
	}

	public void setDeltaTs(Date deltaTs) {
		this.deltaTs = deltaTs;
	}

	public String getReporterAccessible() {
		return this.reporterAccessible;
	}

	public void setReporterAccessible(String reporterAccessible) {
		this.reporterAccessible = reporterAccessible;
	}

	public String getCclistAccessible() {
		return this.cclistAccessible;
	}

	public void setCclistAccessible(String cclistAccessible) {
		this.cclistAccessible = cclistAccessible;
	}

	public String getClassificationId() {
		return this.classificationId;
	}

	public void setClassificationId(String classificationId) {
		this.classificationId = classificationId;
	}

	public String getClassification() {
		return this.classification;
	}

	public void setClassification(String classification) {
		this.classification = classification;
	}

	public String getProduct() {
		return this.product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public String getComponent() {
		return this.component;
	}

	public void setComponent(String component) {
		this.component = component;
	}

	public String getRepPlatform() {
		return this.repPlatform;
	}

	public void setRepPlatform(String repPlatform) {
		this.repPlatform = repPlatform;
	}

	public String getOpSys() {
		return this.opSys;
	}

	public void setOpSys(String opSys) {
		this.opSys = opSys;
	}

	public Integer getDupId() {
		return this.dupId;
	}

	public void setDupId(Integer dupId) {
		this.dupId = dupId;
	}

	public String getBugFileLoc() {
		return this.bugFileLoc;
	}

	public void setBugFileLoc(String bugFileLoc) {
		this.bugFileLoc = bugFileLoc;
	}

	public String getStatusWhiteboard() {
		return this.statusWhiteboard;
	}

	public void setStatusWhiteboard(String statusWhiteboard) {
		this.statusWhiteboard = statusWhiteboard;
	}

	public String getTargetMilestone() {
		return this.targetMilestone;
	}

	public void setTargetMilestone(String targetMilestone) {
		this.targetMilestone = targetMilestone;
	}

	public Integer getVotes() {
		return this.votes;
	}

	public void setVotes(Integer votes) {
		this.votes = votes;
	}

	public String getEverconfirmed() {
		return this.everconfirmed;
	}

	public void setEverconfirmed(String everconfirmed) {
		this.everconfirmed = everconfirmed;
	}

	public String getQaContact() {
		return this.qaContact;
	}

	public void setQaContact(String qaContact) {
		this.qaContact = qaContact;
	}

	public String getEstimatedTime() {
		return this.estimatedTime;
	}

	public void setEstimatedTime(String estimatedTime) {
		this.estimatedTime = estimatedTime;
	}

	public String getRemainingTime() {
		return this.remainingTime;
	}

	public void setRemainingTime(String remainingTime) {
		this.remainingTime = remainingTime;
	}

	public String getActualTime() {
		return this.actualTime;
	}

	public void setActualTime(String actualTime) {
		this.actualTime = actualTime;
	}

	public Date getDeadline() {
		return this.deadline;
	}

	public void setDeadline(Date deadline) {
		this.deadline = deadline;
	}

	public String getKeywords() {
		return this.keywords;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

	public String getFlag() {
		return this.flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public String getCc() {
		return this.cc;
	}

	public void setCc(String cc) {
		this.cc = cc;
	}

	public String getGroupBugzilla() {
		return this.groupBugzilla;
	}

	public void setGroupBugzilla(String groupBugzilla) {
		this.groupBugzilla = groupBugzilla;
	}

	public int getIssueId() {
		return this.issueId;
	}

	public void setIssueId(int issueId) {
		this.issueId = issueId;
	}

}