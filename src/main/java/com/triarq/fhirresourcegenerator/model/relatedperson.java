package com.triarq.fhirresourcegenerator.model;

public class relatedperson {
	 private float relatedpersonid;
	 private String firstname;
	 private String middlename;
	 private String lastname;
	 private String dob = null;
	 private String gender = null;
	 private String addressline1;
	 private String addressline2;
	 private String city;
	 private String state;
	 private String zip;
	 private String county;
	 private String phone;
	 private String mobile;
	 private String email;
	 private String fax;
	 private String relation;
	 private String patientid;
	 private String scountry;
	 private String smaidenfname = null;
	 private String smaidenmname = null;
	 private String smaidenlname = null;
	 private String tenantid;
	 private String sguardian_relationship = null;
	 
	 
	public relatedperson() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public relatedperson(float relatedpersonid, String firstname, String middlename, String lastname, String dob,
			String gender, String addressline1, String addressline2, String city, String state, String zip,
			String county, String phone, String mobile, String email, String fax, String relation, String patientid,
			String scountry, String smaidenfname, String smaidenmname, String smaidenlname, String tenantid,
			String sguardian_relationship) {
		super();
		this.relatedpersonid = relatedpersonid;
		this.firstname = firstname;
		this.middlename = middlename;
		this.lastname = lastname;
		this.dob = dob;
		this.gender = gender;
		this.addressline1 = addressline1;
		this.addressline2 = addressline2;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.county = county;
		this.phone = phone;
		this.mobile = mobile;
		this.email = email;
		this.fax = fax;
		this.relation = relation;
		this.patientid = patientid;
		this.scountry = scountry;
		this.smaidenfname = smaidenfname;
		this.smaidenmname = smaidenmname;
		this.smaidenlname = smaidenlname;
		this.tenantid = tenantid;
		this.sguardian_relationship = sguardian_relationship;
	}

	public float getRelatedpersonid() {
		return relatedpersonid;
	}
	public void setRelatedpersonid(float relatedpersonid) {
		this.relatedpersonid = relatedpersonid;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getMiddlename() {
		return middlename;
	}
	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddressline1() {
		return addressline1;
	}
	public void setAddressline1(String addressline1) {
		this.addressline1 = addressline1;
	}
	public String getAddressline2() {
		return addressline2;
	}
	public void setAddressline2(String addressline2) {
		this.addressline2 = addressline2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getCounty() {
		return county;
	}
	public void setCounty(String county) {
		this.county = county;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	public String getRelation() {
		return relation;
	}
	public void setRelation(String relation) {
		this.relation = relation;
	}
	public String getPatientid() {
		return patientid;
	}
	public void setPatientid(String patientid) {
		this.patientid = patientid;
	}
	public String getScountry() {
		return scountry;
	}
	public void setScountry(String scountry) {
		this.scountry = scountry;
	}
	public String getSmaidenfname() {
		return smaidenfname;
	}
	public void setSmaidenfname(String smaidenfname) {
		this.smaidenfname = smaidenfname;
	}
	public String getSmaidenmname() {
		return smaidenmname;
	}
	public void setSmaidenmname(String smaidenmname) {
		this.smaidenmname = smaidenmname;
	}
	public String getSmaidenlname() {
		return smaidenlname;
	}
	public void setSmaidenlname(String smaidenlname) {
		this.smaidenlname = smaidenlname;
	}
	public String getTenantid() {
		return tenantid;
	}
	public void setTenantid(String tenantid) {
		this.tenantid = tenantid;
	}
	public String getSguardian_relationship() {
		return sguardian_relationship;
	}
	public void setSguardian_relationship(String sguardian_relationship) {
		this.sguardian_relationship = sguardian_relationship;
	}

}
