package com.accesscare.dto;


public class TaskTicket {
	
	private long masterKey;	
	private String taskType;	
	private String ticketType; 
	private long ticketKey;	
	private long recKey;
	private long accountMasterKey;
	private long parentKey;
	private String sourceSystem;
	private String accountId;
	private String queue;
	private String status;
	private String userId;
	private String recordId;
	private String ticketNumber;
	private String extTicketNumber; 
	private String customerId;
	private String activityId;
	private String potentialId;
	private String patternId;
	private String reportTitle;
	private String category;
	private String reportType;
	private String skill;
	private String servPlan;
	private String severity;
	private String servClass;
	private String priority;
	private String reportDetails;
	private String vfyMsg;
	private String oos;
	private String ir;
	private String intrusiveTesting;
	private String wasWorkingInd;
	private String dogInd;
	private String mirInd;
	private String prvInd;
	private String gateInd;
	private String alarmInd;
	private String chargesInd;
	private String waterAccessInd;
	private String metallicInd;
	private String apptFrom;	
	private String apptTo;
	private String apptWin;
	private String apptReason;
	private String apptComment;
	private String oaApptFrom;
	private String oaApptTo;
	private String oaApptWin;
	private String oaApptReason;
	private String oaApptComment;
	private String reportedBy;
	private String reportedByEmail;
	private String reportedByPhone;
	private String reportedByPhoneExt;
	private String reportedByCell;
	private String reportedByFax;
	private String reportedByPager;
	private String contName;
	private String contEmail;
	private String contPhone;
	private String contPhoneExt;
	private String customerReportId;
	private String altContName;
	private String altContPhone;
	private String altContPhoneExt;
	private String altContEmail;
	private String accessInformation;
	private String specialInstruction;
	private String site;
	private String gb;
	private String rsb;
	private String district;
	private String section;
	private String routingComment;
	private String lastRoutedBy;
	private String lastRoutedTime;
	private String clearBy;
	private String clearingComment;
	private String closedBy;
	private String advised;
	private String advisedBy;
	private String workedOnType;
	private String workedOn;
	private String workedOnSubcode;
	private String found;
	private String cause;
	private String resolution;
	private String claimNumber;
	private String custName;
	private String companyName;
	private String servApptId;
	private String dueDateRefId;
	private String dispatchArea;
	private String sc1;
	private String sc2;
	private String sc3;
	private long wfasDispatchId;
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
	private String flag1Flag;
	private String flag2Flag;
	private String flag3Flag;
	private String flag4Flag;
	private String flag5Flag;
	private String flag6Flag;
	private String flag7Flag;
	private String flag8Flag;
	private String flag9Flag;
	private String flag10Flag;
	private String flag11Flag;
	private String flag12Flag;
	private String flag13Flag;
	private String flag14Flag;
	private String flag15Flag;
	private String flag16Flag;
	private String flag17Flag;
	private String flag18Flag;
	private String flag19Flag;
	private String flag20Flag;	
	private String timActivityId;
	private String timPatternId;
	private String timStatus;
	private String actPatType;
	private String contactPreference;
	private String primeOentId;
	private String orsInd;
	private String cktInd;
	private String recDiscrepancyInd;
	private String calledNumber;
	private String mailBox;
	private String internetProductName;
	private String qdnVfyMsg;
	private String lcid;
	private String ncid;
	private String bw_ind;
	private String loi_ind;
	private String loi_num;
	private String tech_pein;
	private String work_order_num;
	private String contract_area;
	private int repeatCnt;
	private int chronicCnt;
	private int subsequentCnt;
	private int ewt;
	private float outageHours;
	private String receivedTime;
	private String patternTime;
	private String ect;
	private String eod;
	private String oaEct;
	private String oaEod;
	private String clearTime;
	private String closedTime;
	private String suite;
	private String streetPrefix;
	private String streetNumber;
	private String streetName;
	private String streetType;
	private String streetSuffix;
	private String pc;
	private String city;
	private String prov;
	private String country;
	private String building;
	private String floorNumber;
	private String mailstop;
	private String pillar;
	private String room;
	private String firstIntersection;
	private String secondIntersection;
	private float longitude;
	private float latitude;
	private String outputFormat;
	private String requested_win;
	private String requested_date;
	private String notifyLanguage;
	private String activityTime;
	private String potentialTime;
	private String activityRemarks;
	private String patternRemarks;
	private String potentialRemarks;
	private String activityComments;
	private String patternComments;
	private String potentialComments;
	private String certificate;
	
	private String alert1;
	private String alert2;
	private String alert3;
	private String alert4;
	private String alert5;
	private String alert6;
	private String alert7;
	private String alert8;
	private String alert9;
	private String alert10;
	private String appt_date;
	private String created_time;
	private String first_route_time;
	private String appt_updated_time;
	private String appt_tran_id;
	private String appt_updated_by;
	private String created_by;
	private String deptid;
	private String due_date_revision_number;
	private String fault_code;
	private String fault_msg;
	private String originating_source_system;
	private String due_date_identifier;
	private String appt_system;
		
	
	public TaskTicket(){
		
	}
	
		
	public String getApptFrom() {
		return apptFrom;
	}



	public void setApptFrom(String apptFrom) {
		this.apptFrom = apptFrom;
	}



	public String getApptTo() {
		return apptTo;
	}



	public void setApptTo(String apptTo) {
		this.apptTo = apptTo;
	}



	public String getOaApptFrom() {
		return oaApptFrom;
	}



	public void setOaApptFrom(String oaApptFrom) {
		this.oaApptFrom = oaApptFrom;
	}



	public String getOaApptTo() {
		return oaApptTo;
	}



	public void setOaApptTo(String oaApptTo) {
		this.oaApptTo = oaApptTo;
	}



	public String getLastRoutedTime() {
		return lastRoutedTime;
	}



	public void setLastRoutedTime(String lastRoutedTime) {
		this.lastRoutedTime = lastRoutedTime;
	}



	public String getRequested_date() {
		return requested_date;
	}



	public void setRequested_date(String requested_date) {
		this.requested_date = requested_date;
	}



	public String getActivityTime() {
		return activityTime;
	}



	public void setActivityTime(String activityTime) {
		this.activityTime = activityTime;
	}



	public String getPotentialTime() {
		return potentialTime;
	}



	public void setPotentialTime(String potentialTime) {
		this.potentialTime = potentialTime;
	}



	public String getAppt_date() {
		return appt_date;
	}



	public void setAppt_date(String appt_date) {
		this.appt_date = appt_date;
	}



	public String getCreated_time() {
		return created_time;
	}



	public void setCreated_time(String created_time) {
		this.created_time = created_time;
	}



	public String getFirst_route_time() {
		return first_route_time;
	}



	public void setFirst_route_time(String first_route_time) {
		this.first_route_time = first_route_time;
	}



	public String getAppt_updated_time() {
		return appt_updated_time;
	}



	public void setAppt_updated_time(String appt_updated_time) {
		this.appt_updated_time = appt_updated_time;
	}



	public void setReceivedTime(String receivedTime) {
		this.receivedTime = receivedTime;
	}



	public void setPatternTime(String patternTime) {
		this.patternTime = patternTime;
	}



	public void setEct(String ect) {
		this.ect = ect;
	}



	public void setEod(String eod) {
		this.eod = eod;
	}



	public void setOaEct(String oaEct) {
		this.oaEct = oaEct;
	}



	public void setOaEod(String oaEod) {
		this.oaEod = oaEod;
	}



	public void setClearTime(String clearTime) {
		this.clearTime = clearTime;
	}



	public void setClosedTime(String closedTime) {
		this.closedTime = closedTime;
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

	public String getFlag16Flag() {
		return flag16Flag;
	}

	public void setFlag16Flag(String flag16Flag) {
		this.flag16Flag = flag16Flag;
	}

	public String getFlag17Flag() {
		return flag17Flag;
	}

	public void setFlag17Flag(String flag17Flag) {
		this.flag17Flag = flag17Flag;
	}

	public String getFlag18Flag() {
		return flag18Flag;
	}

	public void setFlag18Flag(String flag18Flag) {
		this.flag18Flag = flag18Flag;
	}

	public String getFlag19Flag() {
		return flag19Flag;
	}

	public void setFlag19Flag(String flag19Flag) {
		this.flag19Flag = flag19Flag;
	}

	public String getFlag20Flag() {
		return flag20Flag;
	}

	public void setFlag20Flag(String flag20Flag) {
		this.flag20Flag = flag20Flag;
	}

	public String getAlert1() {
		return alert1;
	}

	public void setAlert1(String alert1) {
		this.alert1 = alert1;
	}

	public String getAlert2() {
		return alert2;
	}

	public void setAlert2(String alert2) {
		this.alert2 = alert2;
	}

	public String getAlert3() {
		return alert3;
	}

	public void setAlert3(String alert3) {
		this.alert3 = alert3;
	}

	public String getAlert4() {
		return alert4;
	}

	public void setAlert4(String alert4) {
		this.alert4 = alert4;
	}

	public String getAlert5() {
		return alert5;
	}

	public void setAlert5(String alert5) {
		this.alert5 = alert5;
	}

	public String getAlert6() {
		return alert6;
	}

	public void setAlert6(String alert6) {
		this.alert6 = alert6;
	}

	public String getAlert7() {
		return alert7;
	}

	public void setAlert7(String alert7) {
		this.alert7 = alert7;
	}

	public String getAlert8() {
		return alert8;
	}

	public void setAlert8(String alert8) {
		this.alert8 = alert8;
	}

	public String getAlert9() {
		return alert9;
	}

	public void setAlert9(String alert9) {
		this.alert9 = alert9;
	}

	public String getAlert10() {
		return alert10;
	}

	public void setAlert10(String alert10) {
		this.alert10 = alert10;
	}

	
	public String getAppt_tran_id() {
		return appt_tran_id;
	}

	public void setAppt_tran_id(String appt_tran_id) {
		this.appt_tran_id = appt_tran_id;
	}

	public String getAppt_updated_by() {
		return appt_updated_by;
	}

	public void setAppt_updated_by(String appt_updated_by) {
		this.appt_updated_by = appt_updated_by;
	}

	public String getCreated_by() {
		return created_by;
	}

	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}

	public String getDeptid() {
		return deptid;
	}

	public void setDeptid(String deptid) {
		this.deptid = deptid;
	}

	public String getDue_date_revision_number() {
		return due_date_revision_number;
	}

	public void setDue_date_revision_number(String due_date_revision_number) {
		this.due_date_revision_number = due_date_revision_number;
	}

	public String getFault_code() {
		return fault_code;
	}

	public void setFault_code(String fault_code) {
		this.fault_code = fault_code;
	}

	public String getFault_msg() {
		return fault_msg;
	}

	public void setFault_msg(String fault_msg) {
		this.fault_msg = fault_msg;
	}

	public String getOriginating_source_system() {
		return originating_source_system;
	}

	public void setOriginating_source_system(String originating_source_system) {
		this.originating_source_system = originating_source_system;
	}

	public String getDue_date_identifier() {
		return due_date_identifier;
	}

	public void setDue_date_identifier(String due_date_identifier) {
		this.due_date_identifier = due_date_identifier;
	}

	public String getAppt_system() {
		return appt_system;
	}

	public void setAppt_system(String appt_system) {
		this.appt_system = appt_system;
	}
			
	public String getCertificate() {
		return certificate;
	}
	public void setCertificate(String certificate) {
		this.certificate = certificate;
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
	public String getFlag11Flag() {
		return flag11Flag;
	}
	public void setFlag11Flag(String flag11Flag) {
		this.flag11Flag = flag11Flag;
	}
	public String getFlag12Flag() {
		return flag12Flag;
	}
	public void setFlag12Flag(String flag12Flag) {
		this.flag12Flag = flag12Flag;
	}
	public String getFlag13Flag() {
		return flag13Flag;
	}
	public void setFlag13Flag(String flag13Flag) {
		this.flag13Flag = flag13Flag;
	}
	public String getFlag14Flag() {
		return flag14Flag;
	}
	public void setFlag14Flag(String flag14Flag) {
		this.flag14Flag = flag14Flag;
	}
	public String getFlag15Flag() {
		return flag15Flag;
	}
	public void setFlag15Flag(String flag15Flag) {
		this.flag15Flag = flag15Flag;
	}
	public String getActPatType() {
		return actPatType;
	}
	public void setActPatType(String actPatType) {
		this.actPatType = actPatType;
	}
	public String getContactPreference() {
		return contactPreference;
	}
	public void setContactPreference(String contactPreference) {
		this.contactPreference = contactPreference;
	}
	public String getPrimeOentId() {
		return primeOentId;
	}
	public void setPrimeOentId(String primeOentId) {
		this.primeOentId = primeOentId;
	}
	public String getOrsInd() {
		return orsInd;
	}
	public void setOrsInd(String orsInd) {
		this.orsInd = orsInd;
	}
	public String getCktInd() {
		return cktInd;
	}
	public void setCktInd(String cktInd) {
		this.cktInd = cktInd;
	}
	public String getNotifyLanguage() {
		return notifyLanguage;
	}
	public void setNotifyLanguage(String notifyLanguage) {
		this.notifyLanguage = notifyLanguage;
	}
	
	public String getActivityRemarks() {
		return activityRemarks;
	}
	public void setActivityRemarks(String activityRemarks) {
		this.activityRemarks = activityRemarks;
	}
	public String getPatternRemarks() {
		return patternRemarks;
	}
	public void setPatternRemarks(String patternRemarks) {
		this.patternRemarks = patternRemarks;
	}
	public String getPotentialRemarks() {
		return potentialRemarks;
	}
	public void setPotentialRemarks(String potentialRemarks) {
		this.potentialRemarks = potentialRemarks;
	}
	public String getActivityComments() {
		return activityComments;
	}
	public void setActivityComments(String activityComments) {
		this.activityComments = activityComments;
	}
	public String getPatternComments() {
		return patternComments;
	}
	public void setPatternComments(String patternComments) {
		this.patternComments = patternComments;
	}
	public String getPotentialComments() {
		return potentialComments;
	}
	public void setPotentialComments(String potentialComments) {
		this.potentialComments = potentialComments;
	}
	public String getGateInd() {
		return gateInd;
	}
	public String getLastRoutedBy() {
		return lastRoutedBy;
	}
	public String getTimActivityId() {
		return timActivityId;
	}
	public String getTimPatternId() {
		return timPatternId;
	}
	public String getTimStatus() {
		return timStatus;
	}
	public String getOutputFormat() {
		return outputFormat;
	}
	public String getRequested_win() {
		return requested_win;
	}
	public void setTicketType(String ticketType) {
		this.ticketType = ticketType;
	}
	
	
	public void setTaskType ( String x ) { taskType = x; }
	public void setMasterKey ( long x ) { masterKey = x; }
	public void setTicketKey ( long x ) { ticketKey = x; }
	public void setParentKey ( long x ) { parentKey = x; }
	public void setRecKey ( long x ) { recKey = x; }
	public void setAccountMasterKey ( long x ) { accountMasterKey = x; }
	public void setAccountId( String x ) { accountId = x; }
	public void setQueue ( String x ) { queue = x; }
	public void setStatus ( String x ) { 
	    if (x != null)
	        status = x.toUpperCase();
	    else
	        status = x;
	    }
	public void setUserId ( String x ) { userId = x; }
	public void setRecordId ( String x ) { recordId = x; }
	public void setTicketNumber ( String x ) { ticketNumber = x; }
	//Code added for Ticket Integration Non Functional requirements -starts
	public void setExtTicketNumber ( String x ) { extTicketNumber = x; } 
	public void setTimActivityId ( String x ) { timActivityId = x; }
	public void setTimPatternId ( String x ) { timPatternId = x; }
	public void setTimStatus ( String x ) { timStatus = x; }
	//Code added for Ticket Integration Non Functional requirements -ends
	public void setCustomerId ( String x ) { customerId = x; }
	public void setActivityId ( String x ) { activityId = x; }
	public void setPatternId ( String x ) { patternId = x; }
	public void setPotentialId ( String x ) { potentialId = x; } //Code added for FS636
	public void setReportTitle ( String x ) { reportTitle = x; }
	public void setCategory ( String x ) { category = x; }
	public void setReportType ( String x ) { reportType = x; }
	public void setSkill ( String x ) { skill = x; }
	public void setServPlan ( String x ) { servPlan = x; }
	public void setSeverity ( String x ) { severity = x; }
	public void setPriority ( String x ) { priority = x; }
	public void setServClass ( String x) { servClass = x; }
	public void setReportDetails ( String x ) { reportDetails = x; }
	public void setVfyMsg ( String x ) { vfyMsg = x; }
	public void setOos ( String x ) { oos = x; }
	public void setIr ( String x ) { ir = x; }
	public void setIntrusiveTesting ( String x ) { intrusiveTesting = x; }
	public void setWasWorkingInd ( String x ) { wasWorkingInd = x; }
	public void setDogInd ( String x ) { dogInd = x; }
	public void setMirInd ( String x ) { mirInd = x; }
	public void setPrvInd ( String x ) { prvInd = x; }
	public void setGateInd ( String x ) { gateInd = x; }
	public void setAlarmInd ( String x ) { alarmInd = x; }
	public void setChargesInd ( String x ) { chargesInd = x; }
	public void setWaterAccessInd ( String x ) { waterAccessInd = x; }
	//public void setHighValueCustInd ( String x ) { highValueCustInd = x; }
	public void setMetallicInd ( String x ) { metallicInd = x; }	
	public void setApptWin ( String x ) { apptWin = x; }
	public void setApptReason ( String x ) { apptReason = x; }
	public void setApptComment ( String x ) { apptComment = x; }
	public void setOaApptWin ( String x ) { oaApptWin = x; }
	public void setOaApptReason ( String x ) { oaApptReason = x; }
	public void setOaApptComment ( String x ) { oaApptComment = x; }
	public void setReportedBy ( String x ) { reportedBy = x; }
	public void setReportedByEmail ( String x ) { reportedByEmail = x; }
	public void setReportedByPhone ( String x ) { reportedByPhone = x; }
	public void setReportedByPhoneExt ( String x ) { reportedByPhoneExt = x; }
	public void setReportedByCell ( String x ) { reportedByCell = x; }
	public void setReportedByFax ( String x ) { reportedByFax = x; }
	public void setReportedByPager ( String x ) { reportedByPager = x; }
	public void setContName ( String x ) { contName = x; }
	public void setContEmail ( String x ) { contEmail = x; }
	public void setContPhone ( String x ) { contPhone = x; }
	public void setContPhoneExt ( String x ) { contPhoneExt = x; }
	public void setCustomerReportId ( String x ) { customerReportId = x; }
	public void setAltContName ( String x ) { altContName = x; }
	public void setAltContPhone ( String x ) { altContPhone = x; }
	public void setAltContPhoneExt ( String x ) { altContPhoneExt = x; }
	public void setAltContEmail ( String x ) { altContEmail = x; }
	public void setAccessInformation ( String x ) { accessInformation = x; }
	public void setSpecialInstruction ( String x ) { specialInstruction = x; }
	public void setSite ( String x ) { site = x; }
	public void setGb ( String x ) { gb = x; }
	public void setRsb ( String x ) { rsb = x; }
	public void setDistrict ( String x ) { district = x; }
	public void setSection ( String x ) { section = x; }
	public void setServApptId ( String x ) { servApptId = x; }
	public void setDueDateRefId ( String x ) { dueDateRefId = x; }
	public void setDispatchArea ( String x ) { dispatchArea = x; }
	public void setWfasDispatchId ( long x ) { wfasDispatchId = x; }
	public void setRoutingComment ( String x ) { 
	    if ( x != null )
	        routingComment = x.replaceAll("\0",""); 
	    else
	        routingComment = x;
	    }
	public void setLastRoutedBy ( String x ) { lastRoutedBy = x; }
	public void setClearBy ( String x ) { clearBy = x; }
	public void setClearingComment ( String x ) { clearingComment = x; }
	public void setClosedBy ( String x ) { closedBy = x; }
	public void setAdvised ( String x ) { advised = x; }
	public void setAdvisedBy ( String x ) { advisedBy = x; }
	public void setWorkedOnType ( String x ) { workedOnType = x; }
	public void setWorkedOn ( String x ) { workedOn = x; }
	public void setWorkedOnSubcode ( String x ) { workedOnSubcode = x; }
	public void setFound ( String x ) { found = x; }
	public void setCause ( String x ) { cause = x; }
	public void setResolution ( String x ) { resolution = x; }
	public void setClaimNumber ( String x ) { claimNumber = x; }
	public void setCustName ( String x ) { custName = x; }
	public void setCompanyName ( String x ) { companyName = x; }
	public void setSc1 ( String x ) { sc1 = x; }
	public void setSc2 ( String x ) { sc2 = x; }
	public void setSc3 ( String x ) { sc3 = x; }
	public void setRepeatCnt ( int x ) { repeatCnt = x; }
	public void setChronicCnt ( int x ) { chronicCnt = x; }
	public void setSubsequentCnt ( int x ) { subsequentCnt = x; }
	public void setEwt ( int x ) { ewt = x; }

	public void setOutageHours( float x ) { outageHours = x; }

	public void setSourceSystem( String x ) { sourceSystem = x; }
	public void setSuite ( String x ) { suite = x; }
	public void setStreetPrefix ( String x ) { streetPrefix = x; }
	public void setStreetNumber ( String x ) { streetNumber = x; }
	public void setStreetName ( String x ) { streetName = x; }
	public void setStreetType ( String x ) { streetType = x; }
	public void setStreetSuffix ( String x ) { streetSuffix = x; }
	public void setPc ( String x ) { pc = x; }
	public void setCity ( String x ) { city = x; }
	public void setProv ( String x ) { prov = x; }
	public void setCountry ( String x ) { country = x; }
	public void setBuilding ( String x ) { building = x; }
	public void setFloorNumber ( String x ) { floorNumber = x; }
	public void setMailstop ( String x ) { mailstop = x; }
	public void setPillar ( String x ) { pillar = x; }
	public void setRoom ( String x ) { room = x; }
	public void setFirstIntersection ( String x ) { firstIntersection = x; }
	public void setSecondIntersection ( String x ) { secondIntersection = x; }
	public void setLongitude ( float x ) { longitude = x; }
	public void setLatitude ( float x ) { latitude = x; }

	public void setOutputFormat ( String x ) { 
		if ( x == null )
			outputFormat = "";
		else
			outputFormat = x;
	}

	public void setUser1 ( String x ) { user1 = x; }
	public void setUser2 ( String x ) { user2 = x; }
	public void setUser3 ( String x ) { user3 = x; }
	public void setUser4 ( String x ) { user4 = x; }
	public void setUser5 ( String x ) { user5 = x; }
	public void setUser6 ( String x ) { user6 = x; }
	public void setFlag1 ( String x ) { flag1 = x; }
	public void setFlag2 ( String x ) { flag2 = x; }
	public void setFlag3 ( String x ) { flag3 = x; }
	public void setFlag4 ( String x ) { flag4 = x; }
	public void setFlag5 ( String x ) { flag5 = x; }
	public void setFlag6 ( String x ) { flag6 = x; }
	public void setFlag7 ( String x ) { flag7 = x; }
	public void setFlag8 ( String x ) { flag8 = x; }
	public void setFlag9 ( String x ) { flag9 = x; }
	public void setFlag10 ( String x ) { flag10 = x; }
	public void setFlag1Flag ( String x ) { flag1Flag = x; }
	public void setFlag2Flag ( String x ) { flag2Flag = x; }
	public void setFlag3Flag ( String x ) { flag3Flag = x; }
	public void setFlag4Flag ( String x ) { flag4Flag = x; }
	public void setFlag5Flag ( String x ) { flag5Flag = x; }
	public void setFlag6Flag ( String x ) { flag6Flag = x; }
	public void setFlag7Flag ( String x ) { flag7Flag = x; }
	public void setFlag8Flag ( String x ) { flag8Flag = x; }
	public void setFlag9Flag ( String x ) { flag9Flag = x; }
	public void setFlag10Flag ( String x ) { flag10Flag = x; }
    public void setRecDiscrepancyInd ( String x ) { recDiscrepancyInd = x; }
    public void setCalledNumber ( String x ) { calledNumber = x; }
    public void setMailBox ( String x ) { mailBox = x; }
    public void setInternetProductName ( String x ) { internetProductName = x; }//Code added ACUT2    
    public void setQdnVfyMsg ( String x ) { qdnVfyMsg = x; }
    public void setLcid ( String x ) { lcid = x; }
    public void setNcid ( String x ) { ncid = x; }
	public void setBw_ind ( String x ) { bw_ind = x; }
    public void setLoi_ind ( String x ) { loi_ind = x; }
    public void setLoi_num ( String x ) { loi_num = x; }
    public void setTech_pein ( String x ) { tech_pein = x; }
    public void setWork_order_num ( String x ) { work_order_num = x; }
    public void setContract_area ( String x ) { contract_area = x; }
    public void setRequested_win ( String x ) { requested_win = x; }

	public String getTaskType () { return taskType; }
	public String getTicketType () { return ticketType; }
	public long getMasterKey () { return masterKey; }
	public long getTicketKey () { return ticketKey; }
	public long getParentKey () { return parentKey; }
	public long getRecKey () { return recKey; }
	public long getAccountMasterKey () { return accountMasterKey; }
	public String getSourceSystem() { return sourceSystem; }
	public String getAccountId() { return accountId; }

	public String getQueue () { return queue; }
	public String getStatus () { return status; }
	public String getUserId () { return userId; }
	public String getRecordId () { return recordId; }
	public String getTicketNumber () { return ticketNumber; }
	public String getExtTicketNumber () { return extTicketNumber; } //Code added for BVT support FS717-4.2 Ticket Creation
	public String getCustomerId () { return customerId; }
	public String getActivityId () { return activityId; }
	public String getPatternId () { return patternId; }
	public String getPotentialId () { return potentialId; }//Code added for FS636
	public String getReportTitle () { return reportTitle; }
	public String getCategory () { return category; }
	public String getReportType () { return reportType; }
	public String getSkill () { return skill; }
	public String getServPlan () { return servPlan; }
	public String getSeverity () { return severity; }
	public String getPriority () { return priority; }
	public String getServClass () { return servClass; }
	public String getReportDetails () { return reportDetails; }
	public String getVfyMsg () { return vfyMsg; }
	public String getOos () { return oos; }
	public String getIr () { return ir; }
	public String getIntrusiveTesting () { return intrusiveTesting; }
	public String getWasWorkingInd () { return wasWorkingInd; }
	public String getDogInd () { return dogInd; }
	public String getMirInd () { return mirInd; }
	public String getPrvInd () { return prvInd; }
	public String getGateInfo () { return gateInd; }
	public String getAlarmInd () { return alarmInd; }
	//public String getHighValueCustInd () { return highValueCustInd; }
	public String getChargesInd () { return chargesInd; }
	public String getWaterAccessInd () { return waterAccessInd; }
	public String getMetallicInd () { return metallicInd; }
	public String getApptWin () { return apptWin; }
	public String getApptReason () { return apptReason; }
	public String getApptComment () { return apptComment; }
	public String getOaApptWin () { return oaApptWin; }
	public String getOaApptReason () { return oaApptReason; }
	public String getOaApptComment () { return oaApptComment; }
	    
	public String getReportedBy () { return reportedBy; }
	public String getReportedByEmail () { return reportedByEmail; }
	public String getReportedByPhone () { return reportedByPhone; }
	public String getReportedByPhoneExt () { return reportedByPhoneExt; }
	public String getReportedByCell () { return reportedByCell; }
	public String getReportedByFax () { return reportedByFax; }
	public String getReportedByPager () { return reportedByPager; }
	public String getContName () { return contName; }
	public String getContEmail () { return contEmail; }
	public String getContPhone () { return contPhone; }
	public String getContPhoneExt () { return contPhoneExt; }
	public String getCustomerReportId () { return customerReportId; }
	public String getAltContName () { return altContName; }
	public String getAltContPhone () { return altContPhone; }
	public String getAltContPhoneExt () { return altContPhoneExt; }
	public String getAltContEmail () { return altContEmail; }
	public String getAccessInformation () { return accessInformation; }
	public String getSpecialInstruction () { return specialInstruction; }
	public String getSite () { return site; }
	public String getGb () { return gb; }
	public String getRsb () { return rsb; }
	public String getDistrict () { return district; }
	public String getSection () { return section; }
	public String getServApptId () { return servApptId; }
	public String getDueDateRefId () { return dueDateRefId; }
	public String getDispatchArea () { return dispatchArea; }
	public long getWfasDispatchId () { return wfasDispatchId; }
	public String getRoutingComment () { return routingComment; }
	public String getClearBy () { return clearBy; }
	public String getClearingComment () { return clearingComment; }
	public String getClosedBy () { return closedBy; }
	public String getAdvised () { return advised; }
	public String getAdvisedBy () { return advisedBy; }
	public String getWorkedOnType () { return workedOnType; }
	public String getWorkedOn () { return workedOn; }
	public String getWorkedOnSubcode () { return workedOnSubcode; }
	public String getFound () { return found; }
	public String getCause () { return cause; }
	public String getResolution () { return resolution; }
	public String getClaimNumber () { return claimNumber; }
	public String getCustName () { return custName; }
	public String getCompanyName () { return companyName; }
	public String getSc1 () { return sc1; }
	public String getSc2 () { return sc2; }
	public String getSc3 () { return sc3; }
	public int getRepeatCnt () { return repeatCnt; }
	public int getChronicCnt () { return chronicCnt; }
	public int getSubsequentCnt () { return subsequentCnt; }
	public int getEwt () { return ewt; }

	public float getOutageHours() { return outageHours; }

	public String getReceivedTime () { return receivedTime; }
	public String getPatternTime () { return patternTime; }
	public String getEct () { return ect; }
	public String getEod () { return eod; }
	public String getOaEct () { return oaEct; }
	public String getOaEod () { return oaEod; }
	public String getClearTime () { return clearTime; }
	public String getClosedTime () { return closedTime; }

	public String getSuite () { return suite; }
	public String getStreetPrefix () { return streetPrefix; }
	public String getStreetNumber () { return streetNumber; }
	public String getStreetName () { return streetName; }
	public String getStreetType () { return streetType; }
	public String getStreetSuffix () { return streetSuffix; }
	public String getPc () { return pc; }
	public String getCity () { return city; }
	public String getProv () { return prov; }
	public String getCountry () { return country; }
	public String getBuilding () { return building; }
	public String getFloorNumber () { return floorNumber; }
	public String getMailstop () { return mailstop; }
	public String getPillar () { return pillar; }
	public String getRoom () { return room; }
	public String getFirstIntersection () { return firstIntersection; }
	public String getSecondIntersection () { return secondIntersection; }
	public float getLongitude () { return longitude; }
	public float getLatitude () { return latitude; }

	public String getUser1 () { return(user1); }
	public String getUser2 () { return(user2); }
	public String getUser3 () { return(user3); }
	public String getUser4 () { return(user4); }
	public String getUser5 () { return(user5); }
	public String getUser6 () { return(user6); }
	public String getFlag1 () { return(flag1); }
	public String getFlag2 () { return(flag2); }
	public String getFlag3 () { return(flag3); }
	public String getFlag4 () { return(flag4); }
	public String getFlag5 () { return(flag5); }
	public String getFlag6 () { return(flag6); }
	public String getFlag7 () { return(flag7); }
	public String getFlag8 () { return(flag8); }
	public String getFlag9 () { return(flag9); }
	public String getFlag10 () { return(flag10); }
	public String getFlag1Flag () { return(flag1Flag); }
	public String getFlag2Flag () { return(flag2Flag); }
	public String getFlag3Flag () { return(flag3Flag); }
	public String getFlag4Flag () { return(flag4Flag); }
	public String getFlag5Flag () { return(flag5Flag); }
	public String getFlag6Flag () { return(flag6Flag); }
	public String getFlag7Flag () { return(flag7Flag); }
	public String getFlag8Flag () { return(flag8Flag); }
	public String getFlag9Flag () { return(flag9Flag); }
	public String getFlag10Flag () { return(flag10Flag); }
	public String getRecDiscrepancyInd () { return( recDiscrepancyInd); }
	public String getCalledNumber () { return( calledNumber); }
	public String getMailBox () { return( mailBox); }
	public String getInternetProductName () { return( internetProductName); }// Code added ACUT2

	public String getQdnVfyMsg () { return( qdnVfyMsg); }
	public String getLcid () { return( lcid); }
	public String getNcid () { return( ncid); }
    public String getBw_ind () { return( bw_ind); }
    public String getLoi_ind () { return( loi_ind); }
    public String getLoi_num () { return( loi_num); }
    public String getTech_pein () { return( tech_pein); }
    public String getWork_order_num () { return( work_order_num); }
    public String getContract_area () { return( contract_area); }
    public String setRequested_win () { return( requested_win); }
    
    
    
}
