package com.accesscare.dto;

public class RelatedTicket {
	
	private String primary_key;
	private String master_key;
	private String related;
	
	public String getPrimary_key() {
		return primary_key;
	}
	public void setPrimary_key(String primary_key) {
		this.primary_key = primary_key;
	}
	public String getMaster_key() {
		return master_key;
	}
	public void setMaster_key(String master_key) {
		this.master_key = master_key;
	}
	public String getRelated() {
		return related;
	}
	public void setRelated(String related) {
		this.related = related;
	}


}
