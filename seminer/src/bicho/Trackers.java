package bicho;

// Generated Apr 27, 2013 2:06:40 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * Trackers generated by hbm2java
 */
public class Trackers implements java.io.Serializable {

	private Integer id;
	private String url;
	private int type;
	private Date retrievedOn;

	public Trackers() {
	}

	public Trackers(String url, int type, Date retrievedOn) {
		this.url = url;
		this.type = type;
		this.retrievedOn = retrievedOn;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public int getType() {
		return this.type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public Date getRetrievedOn() {
		return this.retrievedOn;
	}

	public void setRetrievedOn(Date retrievedOn) {
		this.retrievedOn = retrievedOn;
	}

}
