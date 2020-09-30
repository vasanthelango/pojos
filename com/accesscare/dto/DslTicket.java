package com.accesscare.dto;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;

public class DslTicket {
	
	private long master_key;
	private long ticket_key;
	private String record_id;
	private String account_id;
	private String tn;
	private String al;
	private long hunt_group_seq;
	private String serv_status;
	private String swd;
	private String priority;
	private String privacy;
	private String serv_class;
	private String serv_plan;
	private String serv_type;
	private String user1;
	private String user2;
	private String user3;
	private String user4;
	private String user5;
	private String user6;
	private String flag1;
	private String flag2;
	private String flag3;
	private String flag4;
	private String flag5;
	private String flag6;
	private String flag7;
	private String flag8;
	private String flag9;
	private String flag10;
	private String flag11;
	private String flag12;
	private String flag13;
	private String flag14;
	private String flag15;
	private String flag16;
	private String flag17;
	private String flag18;
	private String flag19;
	private String flag20;
	private String flag1flag;
	private String flag2flag;
	private String flag3flag;
	private String flag4flag;
	private String flag5flag;
	private String flag6flag;
	private String flag7flag;
	private String flag8flag;
	private String flag9flag;
	private String flag10flag;
	private String flag11flag;
	private String flag12flag;
	private String flag13flag;
	private String flag14flag;
	private String flag15flag;
	private String flag16flag;
	private String flag17flag;
	private String flag18flag;
	private String flag19flag;
	private String flag20flag;
	private String contract_num;
	private String sla_ref_num;
	private String contract_detail;
	private String hyperlink;
	private String contr_expiry_date;
	private String bw_ind;
	private String loi_ind;
	private String loi_num;
	private String tech_pein;
	private String work_order_num;
	private String contract_area;
	private String created_time;
	private String last_modified;
	private String last_modified_by;
	private String record_source;
	private String record_owner;
	private String usoc;
	private String lrn;
	private String party;
	private String demarcation;
	private String termination;
	private String servicable;
	private String long_drop;
	private String premise_type;
	private String drop_type;
	private String service;
	private String firm_order_date;
	private String cont_name;
	private String cont_phone;
	private String cont_phone_ext;
	private String cont_email;
	private String test_tn;
	private String url1;
	private String url2;
	private String url3;
	private String url4;
	private String url5;
	private String url6;
	private String url7;
	private String url8;
	private String url9;
	private String url10;
	private String rsb;
	private String district;
	private String section;
	private String gb;
	private String serv_notes;
	private String name_display;
	private String speed_band;
	private String escalation_ind;
	private String employee_number;
	private String cpe_ind;
	private String group_id;
	private String eom_prod_id;
	private String prime_oent_id;
	private String ors_ind;
	private String ckt_ind;
	private long vmlr_master_key;
	private String cust_oent_id;
	private Long seq_num;
	private List<UtCarrier> carrierList;
	private List<AliasTicket> aliasList;
	private List<CommentsTicket> commentsList;
	private AddressTicket addressTicket;
	private List<OrderTicket> orderList;
	private List<FeatureTicket> featureList;
	private List<FacilityTicket> facilityList;
	private List<CpeTicket> cpeList;
	private List<EmailTicket> emailTicketList;
	private List<RelatedTicket> relatedTicketList;
	private String internetUserId;
	
	public DslTicket(){
		
	}
	
	@XmlElement (name="UtRelated")
	public List<RelatedTicket> getRelatedTicketList() {
		return relatedTicketList;
	}

	public void setRelatedTicketList(List<RelatedTicket> relatedTicketList) {
		this.relatedTicketList = relatedTicketList;
	}

	@XmlElement (name="UtEmail")
	public List<EmailTicket> getEmailTicketList() {
		return emailTicketList;
	}

	public void setEmailTicketList(List<EmailTicket> emailTicketList) {
		this.emailTicketList = emailTicketList;
	}
	
		
	@XmlElement (name="UtComment")
    public List<CommentsTicket> getCommentsList() {
		return commentsList;
	}

	public void setCommentsList(List<CommentsTicket> commentsList) {
		this.commentsList = commentsList;
	}

	@XmlElement (name="UtAddress")
	public AddressTicket getAddressTicket() {
		return addressTicket;
	}

	public void setAddressTicket(AddressTicket addressTicket) {
		this.addressTicket = addressTicket;
	}

	@XmlElement (name="UtOrder")
	public List<OrderTicket> getOrderList() {
		return orderList;
	}

	public void setOrderList(List<OrderTicket> orderList) {
		this.orderList = orderList;
	}

	@XmlElement (name="UtFeature")
	public List<FeatureTicket> getFeatureList() {
		return featureList;
	}

	public void setFeatureList(List<FeatureTicket> featureList) {
		this.featureList = featureList;
	}

	@XmlElement (name="UtFacility")
	public List<FacilityTicket> getFacilityList() {
		return facilityList;
	}

	public void setFacilityList(List<FacilityTicket> facilityList) {
		this.facilityList = facilityList;
	}

	@XmlElement (name="UtCpe")
	public List<CpeTicket> getCpeList() {
		return cpeList;
	}

	public void setCpeList(List<CpeTicket> cpeList) {
		this.cpeList = cpeList;
	}
	
	@XmlElement (name="UtAlias")
	public List<AliasTicket> getAliasList() {
		return aliasList;
	}

	public void setAliasList(List<AliasTicket> aliasList) {
		this.aliasList = aliasList;
	}

	@XmlElement (name="UtCarrier")
	public List<UtCarrier> getCarrierList() {
		return carrierList;
	}

	public void setCarrierList(List<UtCarrier> carrierList) {
		this.carrierList = carrierList;
	}

	
	public long getMaster_key() {
		return master_key;
	}
	public void setMaster_key(long master_key) {
		this.master_key = master_key;
	}
	public long getTicket_key() {
		return ticket_key;
	}
	public void setTicket_key(long ticket_key) {
		this.ticket_key = ticket_key;
	}
	public String getRecord_id() {
		return record_id;
	}
	public void setRecord_id(String record_id) {
		this.record_id = record_id;
	}
	public String getAccount_id() {
		return account_id;
	}
	public void setAccount_id(String account_id) {
		this.account_id = account_id;
	}
	public String getTn() {
		return tn;
	}
	public void setTn(String tn) {
		this.tn = tn;
	}
	public String getAl() {
		return al;
	}
	public void setAl(String al) {
		this.al = al;
	}
	public long getHunt_group_seq() {
		return hunt_group_seq;
	}
	public void setHunt_group_seq(long hunt_group_seq) {
		this.hunt_group_seq = hunt_group_seq;
	}
	public String getServ_status() {
		return serv_status;
	}
	public void setServ_status(String serv_status) {
		this.serv_status = serv_status;
	}
	public String getSwd() {
		return swd;
	}
	public void setSwd(String swd) {
		this.swd = swd;
	}
	public String getPriority() {
		return priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}
	public String getPrivacy() {
		return privacy;
	}
	public void setPrivacy(String privacy) {
		this.privacy = privacy;
	}
	public String getServ_class() {
		return serv_class;
	}
	public void setServ_class(String serv_class) {
		this.serv_class = serv_class;
	}
	public String getServ_plan() {
		return serv_plan;
	}
	public void setServ_plan(String serv_plan) {
		this.serv_plan = serv_plan;
	}
	public String getServ_type() {
		return serv_type;
	}
	public void setServ_type(String serv_type) {
		this.serv_type = serv_type;
	}
	public String getUser1() {
		return user1;
	}
	public void setUser1(String user1) {
		this.user1 = user1;
	}
	public String getUser2() {
		return user2;
	}
	public void setUser2(String user2) {
		this.user2 = user2;
	}
	public String getUser3() {
		return user3;
	}
	public void setUser3(String user3) {
		this.user3 = user3;
	}
	public String getUser4() {
		return user4;
	}
	public void setUser4(String user4) {
		this.user4 = user4;
	}
	public String getUser5() {
		return user5;
	}
	public void setUser5(String user5) {
		this.user5 = user5;
	}
	public String getUser6() {
		return user6;
	}
	public void setUser6(String user6) {
		this.user6 = user6;
	}
	public String getFlag1() {
		return flag1;
	}
	public void setFlag1(String flag1) {
		this.flag1 = flag1;
	}
	public String getFlag2() {
		return flag2;
	}
	public void setFlag2(String flag2) {
		this.flag2 = flag2;
	}
	public String getFlag3() {
		return flag3;
	}
	public void setFlag3(String flag3) {
		this.flag3 = flag3;
	}
	public String getFlag4() {
		return flag4;
	}
	public void setFlag4(String flag4) {
		this.flag4 = flag4;
	}
	public String getFlag5() {
		return flag5;
	}
	public void setFlag5(String flag5) {
		this.flag5 = flag5;
	}
	public String getFlag6() {
		return flag6;
	}
	public void setFlag6(String flag6) {
		this.flag6 = flag6;
	}
	public String getFlag7() {
		return flag7;
	}
	public void setFlag7(String flag7) {
		this.flag7 = flag7;
	}
	public String getFlag8() {
		return flag8;
	}
	public void setFlag8(String flag8) {
		this.flag8 = flag8;
	}
	public String getFlag9() {
		return flag9;
	}
	public void setFlag9(String flag9) {
		this.flag9 = flag9;
	}
	public String getFlag10() {
		return flag10;
	}
	public void setFlag10(String flag10) {
		this.flag10 = flag10;
	}
	public String getFlag11() {
		return flag11;
	}
	public void setFlag11(String flag11) {
		this.flag11 = flag11;
	}
	public String getFlag12() {
		return flag12;
	}
	public void setFlag12(String flag12) {
		this.flag12 = flag12;
	}
	public String getFlag13() {
		return flag13;
	}
	public void setFlag13(String flag13) {
		this.flag13 = flag13;
	}
	public String getFlag14() {
		return flag14;
	}
	public void setFlag14(String flag14) {
		this.flag14 = flag14;
	}
	public String getFlag15() {
		return flag15;
	}
	public void setFlag15(String flag15) {
		this.flag15 = flag15;
	}
	
	public String getContract_num() {
		return contract_num;
	}
	public void setContract_num(String contract_num) {
		this.contract_num = contract_num;
	}
	public String getSla_ref_num() {
		return sla_ref_num;
	}
	public void setSla_ref_num(String sla_ref_num) {
		this.sla_ref_num = sla_ref_num;
	}
	public String getContract_detail() {
		return contract_detail;
	}
	public void setContract_detail(String contract_detail) {
		this.contract_detail = contract_detail;
	}
	public String getHyperlink() {
		return hyperlink;
	}
	public void setHyperlink(String hyperlink) {
		this.hyperlink = hyperlink;
	}
	public String getContr_expiry_date() {
		return contr_expiry_date;
	}
	public void setContr_expiry_date(String contr_expiry_date) {
		this.contr_expiry_date = contr_expiry_date;
	}
	public String getBw_ind() {
		return bw_ind;
	}
	public void setBw_ind(String bw_ind) {
		this.bw_ind = bw_ind;
	}
	public String getLoi_ind() {
		return loi_ind;
	}
	public void setLoi_ind(String loi_ind) {
		this.loi_ind = loi_ind;
	}
	public String getLoi_num() {
		return loi_num;
	}
	public void setLoi_num(String loi_num) {
		this.loi_num = loi_num;
	}
	public String getTech_pein() {
		return tech_pein;
	}
	public void setTech_pein(String tech_pein) {
		this.tech_pein = tech_pein;
	}
	public String getWork_order_num() {
		return work_order_num;
	}
	public void setWork_order_num(String work_order_num) {
		this.work_order_num = work_order_num;
	}
	public String getContract_area() {
		return contract_area;
	}
	public void setContract_area(String contract_area) {
		this.contract_area = contract_area;
	}
	public String getCreated_time() {
		return created_time;
	}
	public void setCreated_time(String created_time) {
		this.created_time = created_time;
	}
	public String getLast_modified() {
		return last_modified;
	}
	public void setLast_modified(String last_modified) {
		this.last_modified = last_modified;
	}
	public String getLast_modified_by() {
		return last_modified_by;
	}
	public void setLast_modified_by(String last_modified_by) {
		this.last_modified_by = last_modified_by;
	}
	public String getRecord_source() {
		return record_source;
	}
	public void setRecord_source(String record_source) {
		this.record_source = record_source;
	}
	public String getRecord_owner() {
		return record_owner;
	}
	public void setRecord_owner(String record_owner) {
		this.record_owner = record_owner;
	}
	public String getUsoc() {
		return usoc;
	}
	public void setUsoc(String usoc) {
		this.usoc = usoc;
	}
	public String getLrn() {
		return lrn;
	}
	public void setLrn(String lrn) {
		this.lrn = lrn;
	}
	public String getParty() {
		return party;
	}
	public void setParty(String party) {
		this.party = party;
	}
	public String getDemarcation() {
		return demarcation;
	}
	public void setDemarcation(String demarcation) {
		this.demarcation = demarcation;
	}
	public String getTermination() {
		return termination;
	}
	public void setTermination(String termination) {
		this.termination = termination;
	}
	public String getServicable() {
		return servicable;
	}
	public void setServicable(String servicable) {
		this.servicable = servicable;
	}
	public String getLong_drop() {
		return long_drop;
	}
	public void setLong_drop(String long_drop) {
		this.long_drop = long_drop;
	}
	public String getPremise_type() {
		return premise_type;
	}
	public void setPremise_type(String premise_type) {
		this.premise_type = premise_type;
	}
	public String getDrop_type() {
		return drop_type;
	}
	public void setDrop_type(String drop_type) {
		this.drop_type = drop_type;
	}
	public String getService() {
		return service;
	}
	public void setService(String service) {
		this.service = service;
	}
	public String getFirm_order_date() {
		return firm_order_date;
	}
	public void setFirm_order_date(String firm_order_date) {
		this.firm_order_date = firm_order_date;
	}
	public String getCont_name() {
		return cont_name;
	}
	public void setCont_name(String cont_name) {
		this.cont_name = cont_name;
	}
	public String getCont_phone() {
		return cont_phone;
	}
	public void setCont_phone(String cont_phone) {
		this.cont_phone = cont_phone;
	}
	public String getCont_phone_ext() {
		return cont_phone_ext;
	}
	public void setCont_phone_ext(String cont_phone_ext) {
		this.cont_phone_ext = cont_phone_ext;
	}
	public String getCont_email() {
		return cont_email;
	}
	public void setCont_email(String cont_email) {
		this.cont_email = cont_email;
	}
	public String getTest_tn() {
		return test_tn;
	}
	public void setTest_tn(String test_tn) {
		this.test_tn = test_tn;
	}
	public String getUrl1() {
		return url1;
	}
	public void setUrl1(String url1) {
		this.url1 = url1;
	}
	public String getUrl2() {
		return url2;
	}
	public void setUrl2(String url2) {
		this.url2 = url2;
	}
	public String getUrl3() {
		return url3;
	}
	public void setUrl3(String url3) {
		this.url3 = url3;
	}
	public String getUrl4() {
		return url4;
	}
	public void setUrl4(String url4) {
		this.url4 = url4;
	}
	public String getUrl5() {
		return url5;
	}
	public void setUrl5(String url5) {
		this.url5 = url5;
	}
	public String getUrl6() {
		return url6;
	}
	public void setUrl6(String url6) {
		this.url6 = url6;
	}
	public String getUrl7() {
		return url7;
	}
	public void setUrl7(String url7) {
		this.url7 = url7;
	}
	public String getUrl8() {
		return url8;
	}
	public void setUrl8(String url8) {
		this.url8 = url8;
	}
	public String getUrl9() {
		return url9;
	}
	public void setUrl9(String url9) {
		this.url9 = url9;
	}
	public String getUrl10() {
		return url10;
	}
	public void setUrl10(String url10) {
		this.url10 = url10;
	}
	public String getRsb() {
		return rsb;
	}
	public void setRsb(String rsb) {
		this.rsb = rsb;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	public String getGb() {
		return gb;
	}
	public void setGb(String gb) {
		this.gb = gb;
	}
	public String getServ_notes() {
		return serv_notes;
	}
	public void setServ_notes(String serv_notes) {
		this.serv_notes = serv_notes;
	}
	public String getName_display() {
		return name_display;
	}
	public void setName_display(String name_display) {
		this.name_display = name_display;
	}
	public String getSpeed_band() {
		return speed_band;
	}
	public void setSpeed_band(String speed_band) {
		this.speed_band = speed_band;
	}
	public String getEscalation_ind() {
		return escalation_ind;
	}
	public void setEscalation_ind(String escalation_ind) {
		this.escalation_ind = escalation_ind;
	}
	public String getEmployee_number() {
		return employee_number;
	}
	public void setEmployee_number(String employee_number) {
		this.employee_number = employee_number;
	}
	public String getCpe_ind() {
		return cpe_ind;
	}
	public void setCpe_ind(String cpe_ind) {
		this.cpe_ind = cpe_ind;
	}
	public String getGroup_id() {
		return group_id;
	}
	public void setGroup_id(String group_id) {
		this.group_id = group_id;
	}
	public String getEom_prod_id() {
		return eom_prod_id;
	}
	public void setEom_prod_id(String eom_prod_id) {
		this.eom_prod_id = eom_prod_id;
	}
	public String getPrime_oent_id() {
		return prime_oent_id;
	}
	public void setPrime_oent_id(String prime_oent_id) {
		this.prime_oent_id = prime_oent_id;
	}
	public String getOrs_ind() {
		return ors_ind;
	}
	public void setOrs_ind(String ors_ind) {
		this.ors_ind = ors_ind;
	}
	public String getCkt_ind() {
		return ckt_ind;
	}
	public void setCkt_ind(String ckt_ind) {
		this.ckt_ind = ckt_ind;
	}
	public long getVmlr_master_key() {
		return vmlr_master_key;
	}
	public void setVmlr_master_key(long vmlr_master_key) {
		this.vmlr_master_key = vmlr_master_key;
	}
	public String getCust_oent_id() {
		return cust_oent_id;
	}
	public void setCust_oent_id(String cust_oent_id) {
		this.cust_oent_id = cust_oent_id;
	}
	public Long getSeq_num() {
		return seq_num;
	}
	public void setSeq_num(Long seq_num) {
		this.seq_num = seq_num;
	}

	public String getFlag16() {
		return flag16;
	}

	public void setFlag16(String flag16) {
		this.flag16 = flag16;
	}

	public String getFlag17() {
		return flag17;
	}

	public void setFlag17(String flag17) {
		this.flag17 = flag17;
	}

	public String getFlag18() {
		return flag18;
	}

	public void setFlag18(String flag18) {
		this.flag18 = flag18;
	}

	public String getFlag19() {
		return flag19;
	}

	public void setFlag19(String flag19) {
		this.flag19 = flag19;
	}

	public String getFlag20() {
		return flag20;
	}

	public void setFlag20(String flag20) {
		this.flag20 = flag20;
	}

	public String getFlag1flag() {
		return flag1flag;
	}

	public void setFlag1flag(String flag1flag) {
		this.flag1flag = flag1flag;
	}

	public String getFlag2flag() {
		return flag2flag;
	}

	public void setFlag2flag(String flag2flag) {
		this.flag2flag = flag2flag;
	}

	public String getFlag3flag() {
		return flag3flag;
	}

	public void setFlag3flag(String flag3flag) {
		this.flag3flag = flag3flag;
	}

	public String getFlag4flag() {
		return flag4flag;
	}

	public void setFlag4flag(String flag4flag) {
		this.flag4flag = flag4flag;
	}

	public String getFlag5flag() {
		return flag5flag;
	}

	public void setFlag5flag(String flag5flag) {
		this.flag5flag = flag5flag;
	}

	public String getFlag6flag() {
		return flag6flag;
	}

	public void setFlag6flag(String flag6flag) {
		this.flag6flag = flag6flag;
	}

	public String getFlag7flag() {
		return flag7flag;
	}

	public void setFlag7flag(String flag7flag) {
		this.flag7flag = flag7flag;
	}

	public String getFlag8flag() {
		return flag8flag;
	}

	public void setFlag8flag(String flag8flag) {
		this.flag8flag = flag8flag;
	}

	public String getFlag9flag() {
		return flag9flag;
	}

	public void setFlag9flag(String flag9flag) {
		this.flag9flag = flag9flag;
	}

	public String getFlag10flag() {
		return flag10flag;
	}

	public void setFlag10flag(String flag10flag) {
		this.flag10flag = flag10flag;
	}

	public String getFlag11flag() {
		return flag11flag;
	}

	public void setFlag11flag(String flag11flag) {
		this.flag11flag = flag11flag;
	}

	public String getFlag12flag() {
		return flag12flag;
	}

	public void setFlag12flag(String flag12flag) {
		this.flag12flag = flag12flag;
	}

	public String getFlag13flag() {
		return flag13flag;
	}

	public void setFlag13flag(String flag13flag) {
		this.flag13flag = flag13flag;
	}

	public String getFlag14flag() {
		return flag14flag;
	}

	public void setFlag14flag(String flag14flag) {
		this.flag14flag = flag14flag;
	}

	public String getFlag15flag() {
		return flag15flag;
	}

	public void setFlag15flag(String flag15flag) {
		this.flag15flag = flag15flag;
	}

	public String getFlag16flag() {
		return flag16flag;
	}

	public void setFlag16flag(String flag16flag) {
		this.flag16flag = flag16flag;
	}

	public String getFlag17flag() {
		return flag17flag;
	}

	public void setFlag17flag(String flag17flag) {
		this.flag17flag = flag17flag;
	}

	public String getFlag18flag() {
		return flag18flag;
	}

	public void setFlag18flag(String flag18flag) {
		this.flag18flag = flag18flag;
	}

	public String getFlag19flag() {
		return flag19flag;
	}

	public void setFlag19flag(String flag19flag) {
		this.flag19flag = flag19flag;
	}

	public String getFlag20flag() {
		return flag20flag;
	}

	public void setFlag20flag(String flag20flag) {
		this.flag20flag = flag20flag;
	}

	/**
	 * @return the internetUserId
	 */
	public String getInternetUserId() {
		return internetUserId;
	}

	/**
	 * @param internetUserId the internetUserId to set
	 */
	public void setInternetUserId(String internetUserId) {
		this.internetUserId = internetUserId;
	}

	

}
