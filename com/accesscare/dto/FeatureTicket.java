package com.accesscare.dto;

public class FeatureTicket {
	
	private String description;
	private String feature;
	private String ins_date;
	private String inst_date;
	private long master_key;
	private String oos_date;
	private long primary_key;
	private long quantity;
	private String timestamp;
	private String userid;
	private String feature_data;
	
	public FeatureTicket(){
		
	}
	
	public long getQuantity() {
		return quantity;
	}

	public long getMaster_key() {
		return master_key;
	}
	public long getPrimary_key() {
		return primary_key;
	}
	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}
	public String getFeature_data() {
		return feature_data;
	}
	public void setFeature_data(String feature_data) {
		this.feature_data = feature_data;
	}
	public void setMaster_key(long master_key) {
		this.master_key = master_key;
	}
	public void setPrimary_key(long primary_key) {
		this.primary_key = primary_key;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getFeature() {
		return feature;
	}
	public void setFeature(String feature) {
		this.feature = feature;
	}
	public String getIns_date() {
		return ins_date;
	}
	public void setIns_date(String ins_date) {
		this.ins_date = ins_date;
	}
	public String getInst_date() {
		return inst_date;
	}
	public void setInst_date(String inst_date) {
		this.inst_date = inst_date;
	}
	public String getOos_date() {
		return oos_date;
	}
	public void setOos_date(String oos_date) {
		this.oos_date = oos_date;
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
