package com.accesscare.dto;


import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "utUpdateResponse")
public class UtUpdateResponse {

    private KeyInfo keyInfo;
    private ResponseStatus responseStatus;

    public KeyInfo getKeyInfo() {
        return keyInfo;
    }

    public void setKeyInfo(KeyInfo value) {
        this.keyInfo = value;
    }

    public ResponseStatus getResponseStatus() {
        return responseStatus;
    }

    public void setResponseStatus(ResponseStatus value) {
        this.responseStatus = value;
    }

}
