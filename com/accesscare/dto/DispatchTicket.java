package com.accesscare.dto;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;

public class DispatchTicket {
	
	private GenInfo genInfo;
	private Report report;
	private AddressTicket addressTicket;
	private Route route;
	private List<CommentsTicket> commentsList;
	private ClearingInfo clearingInfo;
	private List<QlogTicket> qlogTicketList;
    private Dispatch dispatch;	
    private List<AuditLog> auditLogList;
    private List<AttributeTicket> attributeList;
    private List<AppointmentHistory> appointmentList;
    private List<DefectiveEquipTicket> defectiveList;
    
	public DispatchTicket(){
		
	}
	
	@XmlElement (name="UtAttribute")
	public List<AttributeTicket> getAttributeList() {
		return attributeList;
	}

	public void setAttributeList(List<AttributeTicket> attributeList) {
		this.attributeList = attributeList;
	}

	@XmlElement (name="apptHistory")
	public List<AppointmentHistory> getAppointmentList() {
		return appointmentList;
	}

	public void setAppointmentList(List<AppointmentHistory> appointmentList) {
		this.appointmentList = appointmentList;
	}

	@XmlElement (name="UtDefectiveEq")
	public List<DefectiveEquipTicket> getDefectiveList() {
		return defectiveList;
	}

	public void setDefectiveList(List<DefectiveEquipTicket> defectiveList) {
		this.defectiveList = defectiveList;
	}

	@XmlElement (name="auditLog")
	public List<AuditLog> getAuditLogList() {
		return auditLogList;
	}

	public void setAuditLogList(List<AuditLog> auditLogList) {
		this.auditLogList = auditLogList;
	}

	@XmlElement (name="genInfo")
	public GenInfo getGenInfo() {
		return genInfo;
	}


	public void setGenInfo(GenInfo genInfo) {
		this.genInfo = genInfo;
	}

	@XmlElement (name="report")
	public Report getReport() {
		return report;
	}


	public void setReport(Report report) {
		this.report = report;
	}

	@XmlElement (name="address")
	public AddressTicket getAddressTicket() {
		return addressTicket;
	}


	public void setAddressTicket(AddressTicket addressTicket) {
		this.addressTicket = addressTicket;
	}

	@XmlElement (name="route")
	public Route getRoute() {
		return route;
	}


	public void setRoute(Route route) {
		this.route = route;
	}

	@XmlElement (name="UtComment")
	public List<CommentsTicket> getCommentsList() {
		return commentsList;
	}


	public void setCommentsList(List<CommentsTicket> commentsList) {
		this.commentsList = commentsList;
	}

	@XmlElement (name="clearing")
	public ClearingInfo getClearingInfo() {
		return clearingInfo;
	}


	public void setClearingInfo(ClearingInfo clearingInfo) {
		this.clearingInfo = clearingInfo;
	}

	@XmlElement (name="ticketFlow")
	public List<QlogTicket> getQlogTicketList() {
		return qlogTicketList;
	}


	public void setQlogTicketList(List<QlogTicket> qlogTicketList) {
		this.qlogTicketList = qlogTicketList;
	}

	@XmlElement (name="dispatch")
	public Dispatch getDispatch() {
		return dispatch;
	}

	
	public void setDispatch(Dispatch dispatch) {
		this.dispatch = dispatch;
	}
		
}
