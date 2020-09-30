package com.accesscare.dto;

public class QlogTicket {
	
	private String component;
	private String dept_id;
	private String fromQueue;
	private String fromStatus;
	private String fromTime;
	private String outageInd;
	private String routeComment;
	private int seizeDurMin;
	private String timestamp;
	private String toQueue;
	private String toStatus;
	private String toTime;
	private String toUserid;
	private String userId;
	private String groupId;
	
	
	public String getToUserid() {
		return toUserid;
	}
	public void setToUserid(String toUserid) {
		this.toUserid = toUserid;
	}
	public int getSeizeDurMin() {
		return seizeDurMin;
	}
	public void setSeizeDurMin(int seizeDurMin) {
		this.seizeDurMin = seizeDurMin;
	}
	public String getGroupId() {
		return groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}
	public String getComponent() {
		return component;
	}
	public void setComponent(String component) {
		this.component = component;
	}
	public String getDept_id() {
		return dept_id;
	}
	public void setDept_id(String dept_id) {
		this.dept_id = dept_id;
	}
	
	public String getFromQueue() {
		return fromQueue;
	}
	public void setFromQueue(String fromQueue) {
		this.fromQueue = fromQueue;
	}
	public String getFromStatus() {
		return fromStatus;
	}
	public void setFromStatus(String fromStatus) {
		this.fromStatus = fromStatus;
	}
	public String getFromTime() {
		return fromTime;
	}
	public void setFromTime(String fromTime) {
		this.fromTime = fromTime;
	}
	public String getOutageInd() {
		return outageInd;
	}
	public void setOutageInd(String outageInd) {
		this.outageInd = outageInd;
	}
	public String getRouteComment() {
		return routeComment;
	}
	public void setRouteComment(String routeComment) {
		this.routeComment = routeComment;
	}
	
	public String getToQueue() {
		return toQueue;
	}
	public void setToQueue(String toQueue) {
		this.toQueue = toQueue;
	}
	public String getToStatus() {
		return toStatus;
	}
	public void setToStatus(String toStatus) {
		this.toStatus = toStatus;
	}
	public String getToTime() {
		return toTime;
	}
	public void setToTime(String toTime) {
		this.toTime = toTime;
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
