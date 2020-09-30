package com.accesscare.dto;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "utCancelRequest")
public class UtCancelRequest {

   
    protected KeyInfo keyInfo;
   
    public KeyInfo getKeyInfo() {
        return keyInfo;
    }

    public void setKeyInfo(KeyInfo value) {
        this.keyInfo = value;
    }

}
