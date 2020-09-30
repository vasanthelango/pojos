package com.accesscare.dto;

public class AppointmentHistory {
	
	private String apptDate;
	private String apptFrom;
	private String apptTo;
	private String apptWin;
	private String ect;
	private String apptReason;
	private String apptComment;
	private String timestamp;
	private String userId;
	private int ewt;
	private String apptSystem;
	
	public AppointmentHistory(){
		
	}
		
	public String getApptSystem() {
		return apptSystem;
	}


	public void setApptSystem(String apptSystem) {
		this.apptSystem = apptSystem;
	}


	public int getEwt() {
		return ewt;
	}


	public void setEwt(int ewt) {
		this.ewt = ewt;
	}



	public String getApptDate() {
		return apptDate;
	}


	public void setApptDate(String apptDate) {
		this.apptDate = apptDate;
	}


	public String getApptFrom() {
		return apptFrom;
	}


	public void setApptFrom(String apptFrom) {
		this.apptFrom = apptFrom;
	}


	public String getApptTo() {
		return apptTo;
	}


	public void setApptTo(String apptTo) {
		this.apptTo = apptTo;
	}


	public String getApptWin() {
		return apptWin;
	}


	public void setApptWin(String apptWin) {
		this.apptWin = apptWin;
	}


	public String getEct() {
		return ect;
	}


	public void setEct(String ect) {
		this.ect = ect;
	}


	public String getApptReason() {
		return apptReason;
	}


	public void setApptReason(String apptReason) {
		this.apptReason = apptReason;
	}


	public String getApptComment() {
		return apptComment;
	}


	public void setApptComment(String apptComment) {
		this.apptComment = apptComment;
	}


	public String getTimestamp() {
		return timestamp;
	}


	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}


	public String getUserId() {
		return userId;
	}


	public void setUserId(String userId) {
		this.userId = userId;
	}

	

}
