package com.accesscare.dto;

public class OrderTicket {
	
	private long primary_key;
	private long master_key;
	private String timestamp;
	private String userid;
	private String order_number;
	private String description;
	private String originator;
	private String completed_by;
	private String completed_date;
	
	public long getPrimary_key() {
		return primary_key;
	}
	public void setPrimary_key(long primary_key) {
		this.primary_key = primary_key;
	}
	public long getMaster_key() {
		return master_key;
	}
	public void setMaster_key(long master_key) {
		this.master_key = master_key;
	}
	public String getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getOrder_number() {
		return order_number;
	}
	public void setOrder_number(String order_number) {
		this.order_number = order_number;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getOriginator() {
		return originator;
	}
	public void setOriginator(String originator) {
		this.originator = originator;
	}
	public String getCompleted_by() {
		return completed_by;
	}
	public void setCompleted_by(String completed_by) {
		this.completed_by = completed_by;
	}
	public String getCompleted_date() {
		return completed_date;
	}
	public void setCompleted_date(String completed_date) {
		this.completed_date = completed_date;
	}

	

}
