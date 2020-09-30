package com.accesscare.dto;

public class CpeTicket {
	
	private long primary_key;
	private long master_key;
	private String eq_type;
	private String transport;
	private String vendor;
	private String model;
	private String software;
	private String location;
	private String serial;
	private String ip_address;
	private String mac_id;
	private String connect_seq;
	private String remarks;
	private String ins_date;
	private String oow_date;
	private String warranty_id;
	private String receiver_id;
	private String smartcard_id;
	private String static_ip;
	private String subnet_mask;
	private String default_gateway;
	private String primary_dns;
	private String secondary_dns;
	private String single_static;
	private String multi_static;
	private String line_splitter;
	private String ern;
	private String contract_number;
	private String system_def;
	private String contract_status;
	private String suite;
	private String street_number;
	private String street_name;
	private String street_suffix;
	private String city;
	private String prov;
	private String country;
	private String gb;
	private String pc;
	private String sap_acct_num;
	
	public CpeTicket(){
		
	}
	
	public void setPrimary_key(long primary_key) {
		this.primary_key = primary_key;
	}
	public void setMaster_key(long master_key) {
		this.master_key = master_key;
	}
	
	public long getPrimary_key() {
		return primary_key;
	}
	public long getMaster_key() {
		return master_key;
	}
	public String getEq_type() {
		return eq_type;
	}
	public void setEq_type(String eq_type) {
		this.eq_type = eq_type;
	}
	public String getTransport() {
		return transport;
	}
	public void setTransport(String transport) {
		this.transport = transport;
	}
	public String getVendor() {
		return vendor;
	}
	public void setVendor(String vendor) {
		this.vendor = vendor;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getSoftware() {
		return software;
	}
	public void setSoftware(String software) {
		this.software = software;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getSerial() {
		return serial;
	}
	public void setSerial(String serial) {
		this.serial = serial;
	}
	public String getIp_address() {
		return ip_address;
	}
	public void setIp_address(String ip_address) {
		this.ip_address = ip_address;
	}
	public String getMac_id() {
		return mac_id;
	}
	public void setMac_id(String mac_id) {
		this.mac_id = mac_id;
	}
	public String getConnect_seq() {
		return connect_seq;
	}
	public void setConnect_seq(String connect_seq) {
		this.connect_seq = connect_seq;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public String getIns_date() {
		return ins_date;
	}
	public void setIns_date(String ins_date) {
		this.ins_date = ins_date;
	}
	public String getOow_date() {
		return oow_date;
	}
	public void setOow_date(String oow_date) {
		this.oow_date = oow_date;
	}
	public String getWarranty_id() {
		return warranty_id;
	}
	public void setWarranty_id(String warranty_id) {
		this.warranty_id = warranty_id;
	}
	public String getReceiver_id() {
		return receiver_id;
	}
	public void setReceiver_id(String receiver_id) {
		this.receiver_id = receiver_id;
	}
	public String getSmartcard_id() {
		return smartcard_id;
	}
	public void setSmartcard_id(String smartcard_id) {
		this.smartcard_id = smartcard_id;
	}
	public String getStatic_ip() {
		return static_ip;
	}
	public void setStatic_ip(String static_ip) {
		this.static_ip = static_ip;
	}
	public String getSubnet_mask() {
		return subnet_mask;
	}
	public void setSubnet_mask(String subnet_mask) {
		this.subnet_mask = subnet_mask;
	}
	public String getDefault_gateway() {
		return default_gateway;
	}
	public void setDefault_gateway(String default_gateway) {
		this.default_gateway = default_gateway;
	}
	public String getPrimary_dns() {
		return primary_dns;
	}
	public void setPrimary_dns(String primary_dns) {
		this.primary_dns = primary_dns;
	}
	public String getSecondary_dns() {
		return secondary_dns;
	}
	public void setSecondary_dns(String secondary_dns) {
		this.secondary_dns = secondary_dns;
	}
	public String getSingle_static() {
		return single_static;
	}
	public void setSingle_static(String single_static) {
		this.single_static = single_static;
	}
	public String getMulti_static() {
		return multi_static;
	}
	public void setMulti_static(String multi_static) {
		this.multi_static = multi_static;
	}
	public String getLine_splitter() {
		return line_splitter;
	}
	public void setLine_splitter(String line_splitter) {
		this.line_splitter = line_splitter;
	}
	public String getErn() {
		return ern;
	}
	public void setErn(String ern) {
		this.ern = ern;
	}
	public String getContract_number() {
		return contract_number;
	}
	public void setContract_number(String contract_number) {
		this.contract_number = contract_number;
	}
	public String getSystem_def() {
		return system_def;
	}
	public void setSystem_def(String system_def) {
		this.system_def = system_def;
	}
	public String getContract_status() {
		return contract_status;
	}
	public void setContract_status(String contract_status) {
		this.contract_status = contract_status;
	}
	public String getSuite() {
		return suite;
	}
	public void setSuite(String suite) {
		this.suite = suite;
	}
	public String getStreet_number() {
		return street_number;
	}
	public void setStreet_number(String street_number) {
		this.street_number = street_number;
	}
	public String getStreet_name() {
		return street_name;
	}
	public void setStreet_name(String street_name) {
		this.street_name = street_name;
	}
	public String getStreet_suffix() {
		return street_suffix;
	}
	public void setStreet_suffix(String street_suffix) {
		this.street_suffix = street_suffix;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getProv() {
		return prov;
	}
	public void setProv(String prov) {
		this.prov = prov;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getGb() {
		return gb;
	}
	public void setGb(String gb) {
		this.gb = gb;
	}
	public String getPc() {
		return pc;
	}
	public void setPc(String pc) {
		this.pc = pc;
	}
	public String getSap_acct_num() {
		return sap_acct_num;
	}
	public void setSap_acct_num(String sap_acct_num) {
		this.sap_acct_num = sap_acct_num;
	}


}
