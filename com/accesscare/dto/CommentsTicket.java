package com.accesscare.dto;

public class CommentsTicket {

	private String cmt_type;
	private String cmt_desc;
	private String master_key;
	private String primary_key;
	private String timestamp;
	private String userid;
				
	public String getCmt_desc() {
		return cmt_desc;
	}
	public void setCmt_desc(String cmt_desc) {
		this.cmt_desc = cmt_desc;
	}
	public String getCmt_type() {
		return cmt_type;
	}
	public void setCmt_type(String cmt_type) {
		this.cmt_type = cmt_type;
	}
	
	public String getMaster_key() {
		return master_key;
	}
	public String getPrimary_key() {
		return primary_key;
	}
	public void setMaster_key(String master_key) {
		this.master_key = master_key;
	}
	public void setPrimary_key(String primary_key) {
		this.primary_key = primary_key;
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

}
