package com.accesscare.dto;

public class EmailTicket {

	private long primary_key;
	private long master_key;
	private String rec_type;
	private String email;
	
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
	public String getRec_type() {
		return rec_type;
	}
	public void setRec_type(String rec_type) {
		this.rec_type = rec_type;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}
