package com.accesscare.dto;

public class AlertTicket {

	private String ackBy;
	private String ackInd;
	private String ackOn;
	private String alertMsg;
	private String alertType;
	private int delayTotalMins;
	private String dueTime;
	private String repeatInd;
	
	public AlertTicket(){
		
	}

	public String getAckBy() {
		return ackBy;
	}

	public void setAckBy(String ackBy) {
		this.ackBy = ackBy;
	}

	public String getAckInd() {
		return ackInd;
	}

	public void setAckInd(String ackInd) {
		this.ackInd = ackInd;
	}

	public String getAckOn() {
		return ackOn;
	}

	public void setAckOn(String ackOn) {
		this.ackOn = ackOn;
	}

	public String getAlertMsg() {
		return alertMsg;
	}

	public void setAlertMsg(String alertMsg) {
		this.alertMsg = alertMsg;
	}

	public String getAlertType() {
		return alertType;
	}

	public void setAlertType(String alertType) {
		this.alertType = alertType;
	}

	public int getDelayTotalMins() {
		return delayTotalMins;
	}

	public void setDelayTotalMins(int delayTotalMins) {
		this.delayTotalMins = delayTotalMins;
	}

	public String getDueTime() {
		return dueTime;
	}

	public void setDueTime(String dueTime) {
		this.dueTime = dueTime;
	}

	public String getRepeatInd() {
		return repeatInd;
	}

	public void setRepeatInd(String repeatInd) {
		this.repeatInd = repeatInd;
	}
	
	
	
}
