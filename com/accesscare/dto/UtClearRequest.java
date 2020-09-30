package com.accesscare.dto;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "utClearRequest")
public class UtClearRequest {

 
    private KeyInfo keyInfo;
    private Route route;
    private ClearingInfo clearing;
    private Dispatch dispatch;
    
    
	public KeyInfo getKeyInfo() {
		return keyInfo;
	}
	public void setKeyInfo(KeyInfo keyInfo) {
		this.keyInfo = keyInfo;
	}
	public Route getRoute() {
		return route;
	}
	public void setRoute(Route route) {
		this.route = route;
	}
	public ClearingInfo getClearing() {
		return clearing;
	}
	public void setClearing(ClearingInfo clearing) {
		this.clearing = clearing;
	}
	public Dispatch getDispatch() {
		return dispatch;
	}
	public void setDispatch(Dispatch dispatch) {
		this.dispatch = dispatch;
	}

    
    
}
