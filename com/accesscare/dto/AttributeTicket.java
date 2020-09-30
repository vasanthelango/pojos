package com.accesscare.dto;

public class AttributeTicket {
	
	private long master_key;
	private String attr_name;
	private String attr_value;
	
	public long getMaster_key() {
		return master_key;
	}
	
	public void setMaster_key(long master_key) {
		this.master_key = master_key;
	}
	
	public String getAttr_name() {
		return attr_name;
	}
	
	public void setAttr_name(String attr_name) {
		this.attr_name = attr_name;
	}
	
	public String getAttr_value() {
		return attr_value;
	}
	
	public void setAttr_value(String attr_value) {
		this.attr_value = attr_value;
	}
	
}
