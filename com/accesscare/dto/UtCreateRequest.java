
package com.accesscare.dto;


import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "utCreateRequest")
public class UtCreateRequest {
	
	private KeyInfo keyInfo;
	@XmlElement(name = "PhoneTicket")
	private PhoneTicket phoneTicket;
	@XmlElement(name = "DSLTicket")
	private DslTicket dslTicket;
	@XmlElement(name = "IPTVTicket")
	private IptvTicket iptvTicket;
	@XmlElement(name = "AccountTicket")
	private AccountTicket accountTicket;
	private Report report;
	private AddressTicket address;
	@XmlElement(name = "UtDefectiveEq")
	private List<DefectiveEquipTicket> utDefectiveEq;
	private Misc misc;
	private Route route;
	@XmlElement(name = "UtAlias")
	private List<AliasTicket> utAlias;
	@XmlElement(name = "UtEmail")
	private List<EmailTicket> utEmail;
	@XmlElement(name = "UtComment")
	private List<CommentsTicket> utComment;
	@XmlElement(name = "UtAlert")
	private AlertTicket utAlert;
	private UserFlagFields userFlgFld;
	private ClearingInfo clearing;
	private Dispatch dispatch;
	private OrderTicket orderInfo;
	@XmlElement(name = "UtFacility")
	private List<FacilityTicket> utFacility;
	@XmlElement(name = "UtAttribute")
	private List<AttributeTicket> utAttribute;
		
	
	public KeyInfo getKeyInfo() {
		return keyInfo;
	}
	public void setKeyInfo(KeyInfo keyInfo) {
		this.keyInfo = keyInfo;
	}
	public PhoneTicket getPhoneTicket() {
		return phoneTicket;
	}
	public void setPhoneTicket(PhoneTicket phoneTicket) {
		this.phoneTicket = phoneTicket;
	}
	public DslTicket getDslTicket() {
		return dslTicket;
	}
	public void setDslTicket(DslTicket dslTicket) {
		this.dslTicket = dslTicket;
	}
	public IptvTicket getIptvTicket() {
		return iptvTicket;
	}
	public void setIptvTicket(IptvTicket iptvTicket) {
		this.iptvTicket = iptvTicket;
	}
	public AccountTicket getAccountTicket() {
		return accountTicket;
	}
	public void setAccountTicket(AccountTicket accountTicket) {
		this.accountTicket = accountTicket;
	}
	public Report getReport() {
		return report;
	}
	public void setReport(Report report) {
		this.report = report;
	}
	public AddressTicket getAddress() {
		return address;
	}
	public void setAddress(AddressTicket address) {
		this.address = address;
	}
	public List<DefectiveEquipTicket> getUtDefectiveEq() {
		return utDefectiveEq;
	}
	public void setUtDefectiveEq(List<DefectiveEquipTicket> utDefectiveEq) {
		this.utDefectiveEq = utDefectiveEq;
	}
	public Misc getMisc() {
		return misc;
	}
	public void setMisc(Misc misc) {
		this.misc = misc;
	}
	public Route getRoute() {
		return route;
	}
	public void setRoute(Route route) {
		this.route = route;
	}
	public List<AliasTicket> getUtAlias() {
		return utAlias;
	}
	public void setUtAlias(List<AliasTicket> utAlias) {
		this.utAlias = utAlias;
	}
	public List<EmailTicket> getUtEmail() {
		return utEmail;
	}
	public void setUtEmail(List<EmailTicket> utEmail) {
		this.utEmail = utEmail;
	}
	public List<CommentsTicket> getUtComment() {
		return utComment;
	}
	public void setUtComment(List<CommentsTicket> utComment) {
		this.utComment = utComment;
	}
	public AlertTicket getUtAlert() {
		return utAlert;
	}
	public void setUtAlert(AlertTicket utAlert) {
		this.utAlert = utAlert;
	}
	public UserFlagFields getUserFlgFld() {
		return userFlgFld;
	}
	public void setUserFlgFld(UserFlagFields userFlgFld) {
		this.userFlgFld = userFlgFld;
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
	public OrderTicket getOrderInfo() {
		return orderInfo;
	}
	public void setOrderInfo(OrderTicket orderInfo) {
		this.orderInfo = orderInfo;
	}
	public List<FacilityTicket> getUtFacility() {
		return utFacility;
	}
	public void setUtFacility(List<FacilityTicket> utFacility) {
		this.utFacility = utFacility;
	}
	public List<AttributeTicket> getUtAttribute() {
		return utAttribute;
	}
	public void setUtAttribute(List<AttributeTicket> utAttribute) {
		this.utAttribute = utAttribute;
	}

}
