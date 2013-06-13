package seminer;

import java.util.Date;

public class Communication {
	
	int message_id; 
	int thread_id;  
	String project_name;
	String subject;    
	Date creation_timestamp; 
	String media;
	Date arrive_timestamp;   
	String sub_subject;
	String message_body;
	String is_reply_to;
	String recipient_type;
	int person_id;  
	String alias;
	
	public int getMessage_id() {
		return message_id;
	}
	public void setMessage_id(int message_id) {
		this.message_id = message_id;
	}
	public int getThread_id() {
		return thread_id;
	}
	public void setThread_id(int thread_id) {
		this.thread_id = thread_id;
	}
	public String getProject_name() {
		return project_name;
	}
	public void setProject_name(String project_name) {
		this.project_name = project_name;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public Date getCreation_timestamp() {
		return creation_timestamp;
	}
	public void setCreation_timestamp(Date creation_timestamp) {
		this.creation_timestamp = creation_timestamp;
	}
	public String getMedia() {
		return media;
	}
	public void setMedia(String media) {
		this.media = media;
	}
	public Date getArrive_timestamp() {
		return arrive_timestamp;
	}
	public void setArrive_timestamp(Date arrive_timestamp) {
		this.arrive_timestamp = arrive_timestamp;
	}
	public String getSub_subject() {
		return sub_subject;
	}
	public void setSub_subject(String sub_subject) {
		this.sub_subject = sub_subject;
	}
	public String getMessage_body() {
		return message_body;
	}
	public void setMessage_body(String message_body) {
		this.message_body = message_body;
	}
	public String getIs_reply_to() {
		return is_reply_to;
	}
	public void setIs_reply_to(String is_reply_to) {
		this.is_reply_to = is_reply_to;
	}
	public String getRecipient_type() {
		return recipient_type;
	}
	public void setRecipient_type(String recipient_type) {
		this.recipient_type = recipient_type;
	}
	public int getPerson_id() {
		return person_id;
	}
	public void setPerson_id(int person_id) {
		this.person_id = person_id;
	}
	public String getAlias() {
		return alias;
	}
	public void setAlias(String alias) {
		this.alias = alias;
	}

	
	
}
