package com.accesscare.dto;

public class Route {
	
	private String queue;
	private String status;
	private String userId;
	private String routingComment;
	private String lastRoutedTime;
	private String lastRoutedBy;
	
	public Route(){
		
	}

	public String getQueue() {
		return queue;
	}

	public void setQueue(String queue) {
		this.queue = queue;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getRoutingComment() {
		return routingComment;
	}

	public void setRoutingComment(String routingComment) {
		this.routingComment = routingComment;
	}

	public String getLastRoutedTime() {
		return lastRoutedTime;
	}

	public void setLastRoutedTime(String lastRoutedTime) {
		this.lastRoutedTime = lastRoutedTime;
	}

	public String getLastRoutedBy() {
		return lastRoutedBy;
	}

	public void setLastRoutedBy(String lastRoutedBy) {
		this.lastRoutedBy = lastRoutedBy;
	}

}
