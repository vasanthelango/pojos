package com.accesscare.dto;


import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name = "utCancelResponse")
public class UtCancelResponse {

   
    protected KeyInfo keyInfo;
    protected ResponseStatus responseStatus;

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
