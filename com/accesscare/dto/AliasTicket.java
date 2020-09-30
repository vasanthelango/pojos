package com.accesscare.dto;

public class AliasTicket {
	
	private long primary_key;
	private long master_key;
	private String rec_type;
	private String alias;
		
	
	public long getPrimary_key() {
		return primary_key;
	}
	public long getMaster_key() {
		return master_key;
	}
	public void setPrimary_key(long primary_key) {
		this.primary_key = primary_key;
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
	public String getAlias() {
		return alias;
	}
	public void setAlias(String alias) {
		this.alias = alias;
	}	

}
