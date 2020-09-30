package com.accesscare.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "utCreateResponse")
public class UtCreateResponse {

    private KeyInfo keyInfo;
    private ResponseStatus responseStatus;
    private GenInfo genInfo;
    private Report report;
    private Dispatch dispatch;

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

    /**
     * Gets the value of the responseStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseStatus }
     *     
     */
    public ResponseStatus getResponseStatus() {
        return responseStatus;
    }

    /**
     * Sets the value of the responseStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseStatus }
     *     
     */
    public void setResponseStatus(ResponseStatus value) {
        this.responseStatus = value;
    }

    /**
     * Gets the value of the genInfo property.
     * 
     * @return
     *     possible object is
     *     {@link GenInfo }
     *     
     */
    public GenInfo getGenInfo() {
        return genInfo;
    }

    /**
     * Sets the value of the genInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenInfo }
     *     
     */
    public void setGenInfo(GenInfo value) {
        this.genInfo = value;
    }

    /**
     * Gets the value of the report property.
     * 
     * @return
     *     possible object is
     *     {@link Report }
     *     
     */
    public Report getReport() {
        return report;
    }

    /**
     * Sets the value of the report property.
     * 
     * @param value
     *     allowed object is
     *     {@link Report }
     *     
     */
    public void setReport(Report value) {
        this.report = value;
    }

    /**
     * Gets the value of the dispatch property.
     * 
     * @return
     *     possible object is
     *     {@link Dispatch }
     *     
     */
    public Dispatch getDispatch() {
        return dispatch;
    }

    /**
     * Sets the value of the dispatch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Dispatch }
     *     
     */
    public void setDispatch(Dispatch value) {
        this.dispatch = value;
    }

}
