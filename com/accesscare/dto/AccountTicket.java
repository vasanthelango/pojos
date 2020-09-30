package com.accesscare.dto;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;

public class AccountTicket {
	
	private long master_key;
	private String record_id;
	private String account_name;
	private String serv_type;
	private String serv_class;
	private String cust_name;
	private String company_name;
	private String billing_account;
	private String cid;
	private String lcid;
	private String ncid;
	private String cont_name;
	private String cont_phone;
	private String cont_email;
    private String cont_preference;
	private String priority;
	private String privacy;
	private String serv_plan;
	private String created_time;
	private String serv_status;
	private String swd;
	private String last_modified;
	private String last_modified_by;
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
	private String record_source;
	private String record_owner;
	private String language_preference;
	private String challenge;
	private String challenge1;
	private String challenge2;
	private String challenge3;
	private String challenge4;
	private String response1;
	private String response2;
	private String response3;
	private String response4;
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
	private String contract_num;
	private String contract_detail;
	private String hyperlink;
	private String sla_ref_num;
	private long report_cnt;
	private long history_cnt;
	private String genesys_ts;
	private String contr_expiry_date;
    private String account_notes;
    private String outputFormat;
    private String cont_phone_ext;
    
    private AddressTicket addressTicket;    
    private List<AliasTicket> aliasList;
    private List<EmailTicket> emailTicketList;
    private List<CommentsTicket> commentsList;
    
    public AccountTicket(){
    	
    }
    
   	
    @XmlElement (name="UtComment")
    public List<CommentsTicket> getCommentsList() {
		return commentsList;
	}

	public void setCommentsList(List<CommentsTicket> commentsList) {
		this.commentsList = commentsList;
	}
    
    @XmlElement (name="UtEmail")
	public List<EmailTicket> getEmailTicketList() {
		return emailTicketList;
	}

	public void setEmailTicketList(List<EmailTicket> emailTicketList) {
		this.emailTicketList = emailTicketList;
	}
    
    @XmlElement (name="UtAlias")
	public List<AliasTicket> getAliasList() {
		return aliasList;
	}

	public void setAliasList(List<AliasTicket> aliasList) {
		this.aliasList = aliasList;
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




	public String getCreated_time() {
		return created_time;
	}



	public void setCreated_time(String created_time) {
		this.created_time = created_time;
	}



	public String getSwd() {
		return swd;
	}



	public void setSwd(String swd) {
		this.swd = swd;
	}



	public String getLast_modified() {
		return last_modified;
	}



	public void setLast_modified(String last_modified) {
		this.last_modified = last_modified;
	}



	public long getReport_cnt() {
		return report_cnt;
	}



	public void setReport_cnt(long report_cnt) {
		this.report_cnt = report_cnt;
	}



	public long getHistory_cnt() {
		return history_cnt;
	}



	public void setHistory_cnt(long history_cnt) {
		this.history_cnt = history_cnt;
	}



	public String getGenesys_ts() {
		return genesys_ts;
	}



	public void setGenesys_ts(String genesys_ts) {
		this.genesys_ts = genesys_ts;
	}



	public String getContr_expiry_date() {
		return contr_expiry_date;
	}



	public void setContr_expiry_date(String contr_expiry_date) {
		this.contr_expiry_date = contr_expiry_date;
	}



	@XmlElement (name="UtAddress")
	public AddressTicket getAddressTicket() {
		return addressTicket;
	}
	public void setAddressTicket(AddressTicket addressTicket) {
		this.addressTicket = addressTicket;
	}
	public String getOutputFormat() {
		return outputFormat;
	}
	public void setMaster_key ( long x ) { master_key = x; }
	public void setRecord_id ( String x ) { record_id = x; }
	public void setAccount_name ( String x ) { account_name = x; }
	public void setServ_type ( String x ) { serv_type = x; }
	public void setServ_class ( String x ) { serv_class = x; }
	public void setCust_name ( String x ) { cust_name = x; }
	public void setCompany_name ( String x ) { company_name = x; }
	public void setBilling_account ( String x ) { billing_account = x; }
	public void setCid ( String x ) { cid = x; }
	public void setLcid ( String x ) { lcid = x; }
	public void setNcid ( String x ) { ncid = x; }
	public void setCont_name ( String x ) { cont_name = x; }
	public void setCont_phone ( String x ) { cont_phone = x; }
	public void setCont_email ( String x ) { cont_email = x; }
        public void setCont_preference ( String x ) { cont_preference = x; }
	public void setPriority ( String x ) { priority = x; }
	public void setPrivacy ( String x ) { privacy = x; }
	public void setServ_plan ( String x ) { serv_plan = x; }
	public void setServ_status ( String x ) { serv_status = x; }
	public void setLast_modified_by ( String x ) { last_modified_by = x; }
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
	public void setRecord_source ( String x ) { record_source = x; }
	public void setRecord_owner ( String x ) { record_owner = x; }
	public void setChallenge ( String x ) { challenge = x; }
	public void setChallenge1 ( String x ) { challenge1 = x; }
	public void setChallenge2 ( String x ) { challenge2 = x; }
	public void setChallenge3 ( String x ) { challenge3 = x; }
	public void setChallenge4 ( String x ) { challenge4 = x; }
	public void setResponse1 ( String x ) { response1 = x; }
	public void setResponse2 ( String x ) { response2 = x; }
	public void setResponse3 ( String x ) { response3 = x; }
	public void setResponse4 ( String x ) { response4 = x; }
	public void setLanguage_preference ( String x ) { language_preference = x; }
	public void setUrl1 ( String x ) { url1 = x; }
	public void setUrl2 ( String x ) { url2 = x; }
	public void setUrl3 ( String x ) { url3 = x; }
	public void setUrl4 ( String x ) { url4 = x; }
	public void setUrl5 ( String x ) { url5 = x; }
	public void setUrl6 ( String x ) { url6 = x; }
	public void setUrl7 ( String x ) { url7 = x; }
	public void setUrl8 ( String x ) { url8 = x; }
	public void setUrl9 ( String x ) { url9 = x; }
	public void setUrl10 ( String x ) { url10 = x; }
	public void setContract_num ( String x ) { contract_num = x; }
	public void setSla_ref_num ( String x ) { sla_ref_num = x; }
	public void setContract_detail ( String x ) { contract_detail = x; }
	public void setHyperlink ( String x ) { hyperlink = x; }
	
	public void setRsb ( String x ) { rsb = x; }
	public void setDistrict ( String x ) { district = x; }
	public void setSection ( String x ) { section = x; }
	public void setGb ( String x ) { gb = x; }
	public void setAccount_notes ( String x ) { account_notes = x; }
	public void setOutputFormat ( String x ) { outputFormat = x; }


		public long getMaster_key () { return(master_key); }
		public String getRecord_id () { return(record_id); }
		public String getAccount_name () { return(account_name); }
		public String getServ_type () { return(serv_type); }
		public String getServ_class () { return(serv_class); }
		public String getCust_name () { return(cust_name); }
		public String getCompany_name () { return(company_name); }
		public String getBilling_account () { return(billing_account); }
		public String getCid () { return(cid); }
		public String getLcid () { return(lcid); }
		public String getNcid () { return(ncid); }
		public String getCont_name () { return(cont_name); }
		public String getCont_phone () { return(cont_phone); }
		public String getCont_email () { return(cont_email); }
                public String getCont_preference () { return(cont_preference); }
		public String getPriority () { return(priority); }
		public String getPrivacy () { return(privacy); }
		public String getServ_plan () { return(serv_plan); }
		
		public String getServ_status () { return(serv_status); }
		
		public String getLast_modified_by () { return(last_modified_by); }
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
		public String getRecord_source () { return(record_source); }
		public String getRecord_owner () { return(record_owner); }
		public String getChallenge () { return(challenge); }
		public String getChallenge1 () { return(challenge1); }
		public String getChallenge2 () { return(challenge2); }
		public String getChallenge3 () { return(challenge3); }
		public String getChallenge4 () { return(challenge4); }
		public String getResponse1 () { return(response1); }
		public String getResponse2 () { return(response2); }
		public String getResponse3 () { return(response3); }
		public String getResponse4 () { return(response4); }
		public String getLanguage_preference () { return(language_preference); }
		public String getUrl1 () { return(url1); }
		public String getUrl2 () { return(url2); }
		public String getUrl3 () { return(url3); }
		public String getUrl4 () { return(url4); }
		public String getUrl5 () { return(url5); }
		public String getUrl6 () { return(url6); }
		public String getUrl7 () { return(url7); }
		public String getUrl8 () { return(url8); }
		public String getUrl9 () { return(url9); }
		public String getUrl10 () { return(url10); }
		public String getContract_num () { return(contract_num); }
		public String getContract_detail () { return(contract_detail); }
		public String getSla_ref_num () { return(sla_ref_num); }
		public String getHyperlink () { return(hyperlink); }		
		public String getRsb () { return(rsb); }
		public String getDistrict () { return(district); }
		public String getSection () { return(section); }
		public String getGb () { return(gb); }		
        public String getAccount_notes () { return account_notes; }

		/**
		 * @return the cont_phone_ext
		 */
		public String getCont_phone_ext() {
			return cont_phone_ext;
		}

		/**
		 * @param cont_phone_ext the cont_phone_ext to set
		 */
		public void setCont_phone_ext(String cont_phone_ext) {
			this.cont_phone_ext = cont_phone_ext;
		}

		

}
