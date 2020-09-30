package com.accesscare.dto;

public class RelatedServieTicket {
	
	private long primary_key;
	private long master_key;
	private String record_id;
	private String record_key;
	private String taskType;
	private String serv_status;
	private int oosInd;
	
	public RelatedServieTicket(){
		
	}
	
	public int getOosInd() {
		return oosInd;
	}

	public void setOosInd(int oosInd) {
		this.oosInd = oosInd;
	}
	
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
	
	public String getRecord_id() {
		return record_id;
	}
	public void setRecord_id(String record_id) {
		this.record_id = record_id;
	}
	public String getRecord_key() {
		return record_key;
	}
	public void setRecord_key(String record_key) {
		this.record_key = record_key;
	}
	public String getTaskType() {
		return taskType;
	}
	public void setTaskType(String taskType) {
		this.taskType = taskType;
	}
	public String getServ_status() {
		return serv_status;
	}
	public void setServ_status(String serv_status) {
		this.serv_status = serv_status;
	}
		


}
