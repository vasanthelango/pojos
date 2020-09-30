package com.accesscare.dto;


import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "utClearResponse")
public class UtClearResponse {

    private KeyInfo keyInfo;
    private ResponseStatus responseStatus;
    
	public KeyInfo getKeyInfo() {
		return keyInfo;
	}
	public void setKeyInfo(KeyInfo keyInfo) {
		this.keyInfo = keyInfo;
	}
	public ResponseStatus getResponseStatus() {
		return responseStatus;
	}
	public void setResponseStatus(ResponseStatus responseStatus) {
		this.responseStatus = responseStatus;
	}

    
}
