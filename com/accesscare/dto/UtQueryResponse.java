
package com.accesscare.dto;


import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "utQueryResponse")
public class UtQueryResponse {

  
    private KeyInfo keyInfo;  
    private ResponseStatus responseStatus;    
    private Ticket ticket;
    
    @XmlElement (name="keyInfo")
	public KeyInfo getKeyInfo() {
		return keyInfo;
	}
	public void setKeyInfo(KeyInfo keyInfo) {
		this.keyInfo = keyInfo;
	}
	@XmlElement (name="responseStatus")
	public ResponseStatus getResponseStatus() {
		return responseStatus;
	}
	public void setResponseStatus(ResponseStatus responseStatus) {
		this.responseStatus = responseStatus;
	}
	
	@XmlElement (name="ticket")
	public Ticket getTicket() {
		return ticket;
	}
	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}
    
}
