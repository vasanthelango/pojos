package com.accesscare.dto;

import java.util.List;


import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement (name="ticket")
public class Ticket {
	
	private PhoneTicket phoneTicket;
	private DslTicket dslTicket;
	private IptvTicket iptvTicket;
	private AccountTicket accountTicket;
	private List<DispatchTicket> dispatchList;
	private GenInfo genInfo;
	private Report report;
	private Misc misc;
	private Route route;
	private List<RelatedServieTicket> relatedServieList;
	private List<AliasTicket> aliasList;
	private List<CommentsTicket> commentsList;
	private UserFlagFields userFlagFields;
	private ClearingInfo clearingInfo;
	private List<AppointmentHistory> appointmentList;
	private List<QlogTicket> qlogTicketList;
	private List<AuditLog> auditLogList;
	private List<AlertTicket> alertTicketList;
	private List<EmailTicket> emailTicketList;
	private List<AttributeTicket> attributeList;
	private AddressTicket addressTicket;	
	private List<DefectiveEquipTicket> defectiveList;
	private Dispatch dispatch;
	
	public Ticket(){
		
	}
	
	
	@XmlElement (name="dispatch")
	public Dispatch getDispatch() {
		return dispatch;
	}

	public void setDispatch(Dispatch dispatch) {
		this.dispatch = dispatch;
	}

	@XmlElement (name="address")
	public AddressTicket getAddressTicket() {
		return addressTicket;
	}

	public void setAddressTicket(AddressTicket addressTicket) {
		this.addressTicket = addressTicket;
	}
	
	@XmlElement (name="UtDefectiveEq")
	public List<DefectiveEquipTicket> getDefectiveList() {
		return defectiveList;
	}

	public void setDefectiveList(List<DefectiveEquipTicket> defectiveList) {
		this.defectiveList = defectiveList;
	}


	@XmlElement (name="UtAttribute")
	public List<AttributeTicket> getAttributeList() {
		return attributeList;
	}

	public void setAttributeList(List<AttributeTicket> attributeList) {
		this.attributeList = attributeList;
	}

	@XmlElement (name="UtEmail")
	public List<EmailTicket> getEmailTicketList() {
		return emailTicketList;
	}

	public void setEmailTicketList(List<EmailTicket> emailTicketList) {
		this.emailTicketList = emailTicketList;
	}

	
	@XmlElement (name="UtAlert")
	public List<AlertTicket> getAlertTicketList() {
		return alertTicketList;
	}

	public void setAlertTicketList(List<AlertTicket> alertTicketList) {
		this.alertTicketList = alertTicketList;
	}

	@XmlElement (name="DSLTicket")
	public DslTicket getDslTicket() {
		return dslTicket;
	}
	public void setDslTicket(DslTicket dslTicket) {
		this.dslTicket = dslTicket;
	}
	@XmlElement (name="IPTVTicket")
	public IptvTicket getIptvTicket() {
		return iptvTicket;
	}
	public void setIptvTicket(IptvTicket iptvTicket) {
		this.iptvTicket = iptvTicket;
	}
	
	@XmlElement (name="PhoneTicket")
	public PhoneTicket getPhoneTicket() {
		return phoneTicket;
	}
	public void setPhoneTicket(PhoneTicket phoneTicket) {
		this.phoneTicket = phoneTicket;
	}
	
	
	@XmlElement (name="auditLog")
	public List<AuditLog> getAuditLogList() {
		return auditLogList;
	}


	public void setAuditLogList(List<AuditLog> auditLogList) {
		this.auditLogList = auditLogList;
	}

	@XmlElement (name="ticketFlow")
	public List<QlogTicket> getQlogTicketList() {
		return qlogTicketList;
	}

	public void setQlogTicketList(List<QlogTicket> qlogTicketList) {
		this.qlogTicketList = qlogTicketList;
	}

	@XmlElement (name="UtRelatedService")
	public List<RelatedServieTicket> getRelatedServieList() {
		return relatedServieList;
	}

	public void setRelatedServieList(List<RelatedServieTicket> relatedServieList) {
		this.relatedServieList = relatedServieList;
	}

	@XmlElement (name="apptHistory")
	public List<AppointmentHistory> getAppointmentList() {
		return appointmentList;
	}

	public void setAppointmentList(List<AppointmentHistory> appointmentList) {
		this.appointmentList = appointmentList;
	}

	@XmlElement (name="clearing")
	public ClearingInfo getClearingInfo() {
		return clearingInfo;
	}

	public void setClearingInfo(ClearingInfo clearingInfo) {
		this.clearingInfo = clearingInfo;
	}

	@XmlElement (name="userFlgFld")
	public UserFlagFields getUserFlagFields() {
		return userFlagFields;
	}

	public void setUserFlagFields(UserFlagFields userFlagFields) {
		this.userFlagFields = userFlagFields;
	}

	@XmlElement (name="UtComment")
	public List<CommentsTicket> getCommentsList() {
		return commentsList;
	}

	public void setCommentsList(List<CommentsTicket> commentsList) {
		this.commentsList = commentsList;
	}

	@XmlElement (name="UtAlias")
	public List<AliasTicket> getAliasList() {
		return aliasList;
	}

	public void setAliasList(List<AliasTicket> aliasList) {
		this.aliasList = aliasList;
	}
	

	@XmlElement (name="route")
	public Route getRoute() {
		return route;
	}

	public void setRoute(Route route) {
		this.route = route;
	}

	@XmlElement (name="misc")
	public Misc getMisc() {
		return misc;
	}

	public void setMisc(Misc misc) {
		this.misc = misc;
	}

	@XmlElement (name="report")
	public Report getReport() {
		return report;
	}

	public void setReport(Report report) {
		this.report = report;
	}

	@XmlElement (name="genInfo")
	public GenInfo getGenInfo() {
		return genInfo;
	}

	public void setGenInfo(GenInfo genInfo) {
		this.genInfo = genInfo;
	}
	
	@XmlElement (name="AccountTicket")
	public AccountTicket getAccountTicket() {
		return accountTicket;
	}


	public void setAccountTicket(AccountTicket accountTicket) {
		this.accountTicket = accountTicket;
	}


	@XmlElement (name="dispatchTicket")
	public List<DispatchTicket> getDispatchList() {
		return dispatchList;
	}

	public void setDispatchList(List<DispatchTicket> dispatchList) {
		this.dispatchList = dispatchList;
	}
		

}
