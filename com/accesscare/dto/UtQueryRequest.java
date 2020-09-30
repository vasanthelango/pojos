
package com.accesscare.dto;


import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "utQueryRequest")
public class UtQueryRequest {

    
    private KeyInfo keyInfo;

    /**
     * Gets the value of the keyInfo property.
     * 
     * @return
     *     possible object is
     *     {@link KeyInfo }
     *     
     */
    public KeyInfo getKeyInfo() {
        return keyInfo;
    }

    /**
     * Sets the value of the keyInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyInfo }
     *     
     */
    public void setKeyInfo(KeyInfo value) {
        this.keyInfo = value;
    }

}
