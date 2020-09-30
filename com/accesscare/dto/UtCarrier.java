package com.accesscare.dto;

public class UtCarrier {
	
	private long primary_key;
	private long master_key;
	private String carrier;
	
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
	public String getCarrier() {
		return carrier;
	}
	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}

}
