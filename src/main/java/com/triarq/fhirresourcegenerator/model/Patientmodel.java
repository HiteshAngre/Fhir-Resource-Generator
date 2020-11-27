package com.triarq.fhirresourcegenerator.model;

import java.util.ArrayList;
import java.util.Date;



public class Patientmodel {
	 private String npatientid;
	 private String spatientcode;
	 private String sfirstname;
	 private String smiddlename;
	 private String slastname;
	 private String sssn;
	 private String dtdob;
	 private String sgender;
	 private String smaritialstatus;
	 private String saddressline1;
	 private String saddressline2;
	 private String scity;
	 private String sstate;
	 private String szip;
	 private String scounty;
	 private String sphone;
	 private String smobile;
	 private String semail;
	 private String sfax;
	 private String shanddominance;
	 private String slocation;
	 private String sinsurancenotes;
	 private String sbirthtime;
	 private String insuranceid1 = null;
	 private String insuranceid2 = null;
	 private String url = null;
	 private String userid = null;
	 private String exclude = null;
	 private String ispatientexcluded = null;
	 private String publishedon = null;
	 private String updatedon = null;
	 private String createdby = null;
	 private String homephone = null;
	 private String creadtedon = null;
	 private String updatedby = null;
	 private String createdon = null;
	 private String spreviousfirstname = null;
	 private String spreviousmiddlename = null;
	 private String spreviouslastname = null;
	 private String photourl = null;
	 private String snpi = null;
	 private String stin = null;
	 private String sccn = null;
	 private String emrid = null;
	 private String tenantid;
	 private String countrycode;
	 externalref ExternalrefObject;
	 private String organizationid = null;
	 private String organizationnpi = null;
	 private String organizationtin = null;
	 private String organizationccn = null;
	 private String sprefix;
	 private String ssuffix = null;
	 private String scommunicationpreference;
	 private String semergencycontact;
	 private String semergencyphone;
	 private String semergencymobile;
	 private String semergencyrelationship;
	 private String spatientstatus;
	 private String photoblobid = null;
	 private String patientqueueid = null;
	 private String patientsource = null;
	 private String providerid;
	 ArrayList < patientLanguage > patientlanguage = new ArrayList < patientLanguage > ();
	 ArrayList < relatedperson > relatedperson = new ArrayList < relatedperson > ();
	
	 
	 
	 
	 
	 
	 
	 
	 public Patientmodel() {
		super();
		// TODO Auto-generated constructor stub
	}
	 
	 
	public Patientmodel(String npatientid, String spatientcode, String sfirstname, String smiddlename, String slastname,
			String sssn, String dtdob, String sgender, String smaritialstatus, String saddressline1,
			String saddressline2, String scity, String sstate, String szip, String scounty, String sphone,
			String smobile, String semail, String sfax, String shanddominance, String slocation, String sinsurancenotes,
			String sbirthtime, String insuranceid1, String insuranceid2, String url, String userid, String exclude,
			String ispatientexcluded, String publishedon, String updatedon, String createdby, String homephone,
			String creadtedon, String updatedby, String createdon, String spreviousfirstname,
			String spreviousmiddlename, String spreviouslastname, String photourl, String snpi, String stin,
			String sccn, String emrid, String tenantid, String countrycode, externalref externalrefObject,
			String organizationid, String organizationnpi, String organizationtin, String organizationccn,
			String sprefix, String ssuffix, String scommunicationpreference, String semergencycontact,
			String semergencyphone, String semergencymobile, String semergencyrelationship, String spatientstatus,
			String photoblobid, String patientqueueid, String patientsource, String providerid,
			ArrayList<patientLanguage> patientlanguage,
			ArrayList<com.triarq.fhirresourcegenerator.model.relatedperson> relatedperson) {
		super();
		this.npatientid = npatientid;
		this.spatientcode = spatientcode;
		this.sfirstname = sfirstname;
		this.smiddlename = smiddlename;
		this.slastname = slastname;
		this.sssn = sssn;
		this.dtdob = dtdob;
		this.sgender = sgender;
		this.smaritialstatus = smaritialstatus;
		this.saddressline1 = saddressline1;
		this.saddressline2 = saddressline2;
		this.scity = scity;
		this.sstate = sstate;
		this.szip = szip;
		this.scounty = scounty;
		this.sphone = sphone;
		this.smobile = smobile;
		this.semail = semail;
		this.sfax = sfax;
		this.shanddominance = shanddominance;
		this.slocation = slocation;
		this.sinsurancenotes = sinsurancenotes;
		this.sbirthtime = sbirthtime;
		this.insuranceid1 = insuranceid1;
		this.insuranceid2 = insuranceid2;
		this.url = url;
		this.userid = userid;
		this.exclude = exclude;
		this.ispatientexcluded = ispatientexcluded;
		this.publishedon = publishedon;
		this.updatedon = updatedon;
		this.createdby = createdby;
		this.homephone = homephone;
		this.creadtedon = creadtedon;
		this.updatedby = updatedby;
		this.createdon = createdon;
		this.spreviousfirstname = spreviousfirstname;
		this.spreviousmiddlename = spreviousmiddlename;
		this.spreviouslastname = spreviouslastname;
		this.photourl = photourl;
		this.snpi = snpi;
		this.stin = stin;
		this.sccn = sccn;
		this.emrid = emrid;
		this.tenantid = tenantid;
		this.countrycode = countrycode;
		ExternalrefObject = externalrefObject;
		this.organizationid = organizationid;
		this.organizationnpi = organizationnpi;
		this.organizationtin = organizationtin;
		this.organizationccn = organizationccn;
		this.sprefix = sprefix;
		this.ssuffix = ssuffix;
		this.scommunicationpreference = scommunicationpreference;
		this.semergencycontact = semergencycontact;
		this.semergencyphone = semergencyphone;
		this.semergencymobile = semergencymobile;
		this.semergencyrelationship = semergencyrelationship;
		this.spatientstatus = spatientstatus;
		this.photoblobid = photoblobid;
		this.patientqueueid = patientqueueid;
		this.patientsource = patientsource;
		this.providerid = providerid;
		this.patientlanguage = patientlanguage;
		this.relatedperson = relatedperson;
	}


	public String getNpatientid() {
		return npatientid;
	}
	public void setNpatientid(String npatientid) {
		this.npatientid = npatientid;
	}
	public String getSpatientcode() {
		return spatientcode;
	}
	public void setSpatientcode(String spatientcode) {
		this.spatientcode = spatientcode;
	}
	public String getSfirstname() {
		return sfirstname;
	}
	public void setSfirstname(String sfirstname) {
		this.sfirstname = sfirstname;
	}
	public String getSmiddlename() {
		return smiddlename;
	}
	public void setSmiddlename(String smiddlename) {
		this.smiddlename = smiddlename;
	}
	public String getSlastname() {
		return slastname;
	}
	public void setSlastname(String slastname) {
		this.slastname = slastname;
	}
	public String getSssn() {
		return sssn;
	}
	public void setSssn(String sssn) {
		this.sssn = sssn;
	}
	public String getDtdob() {
		return dtdob;
	}
	public void setDtdob(String dtdob) {
		this.dtdob = dtdob;
	}
	public String getSgender() {
		return sgender;
	}
	public void setSgender(String sgender) {
		this.sgender = sgender;
	}
	public String getSmaritialstatus() {
		return smaritialstatus;
	}
	public void setSmaritialstatus(String smaritialstatus) {
		this.smaritialstatus = smaritialstatus;
	}
	public String getSaddressline1() {
		return saddressline1;
	}
	public void setSaddressline1(String saddressline1) {
		this.saddressline1 = saddressline1;
	}
	public String getSaddressline2() {
		return saddressline2;
	}
	public void setSaddressline2(String saddressline2) {
		this.saddressline2 = saddressline2;
	}
	public String getScity() {
		return scity;
	}
	public void setScity(String scity) {
		this.scity = scity;
	}
	public String getSstate() {
		return sstate;
	}
	public void setSstate(String sstate) {
		this.sstate = sstate;
	}
	public String getSzip() {
		return szip;
	}
	public void setSzip(String szip) {
		this.szip = szip;
	}
	public String getScounty() {
		return scounty;
	}
	public void setScounty(String scounty) {
		this.scounty = scounty;
	}
	public String getSphone() {
		return sphone;
	}
	public void setSphone(String sphone) {
		this.sphone = sphone;
	}
	public String getSmobile() {
		return smobile;
	}
	public void setSmobile(String smobile) {
		this.smobile = smobile;
	}
	public String getSemail() {
		return semail;
	}
	public void setSemail(String semail) {
		this.semail = semail;
	}
	public String getSfax() {
		return sfax;
	}
	public void setSfax(String sfax) {
		this.sfax = sfax;
	}
	public String getShanddominance() {
		return shanddominance;
	}
	public void setShanddominance(String shanddominance) {
		this.shanddominance = shanddominance;
	}
	public String getSlocation() {
		return slocation;
	}
	public void setSlocation(String slocation) {
		this.slocation = slocation;
	}
	public String getSinsurancenotes() {
		return sinsurancenotes;
	}
	public void setSinsurancenotes(String sinsurancenotes) {
		this.sinsurancenotes = sinsurancenotes;
	}
	public String getSbirthtime() {
		return sbirthtime;
	}
	public void setSbirthtime(String sbirthtime) {
		this.sbirthtime = sbirthtime;
	}
	public String getInsuranceid1() {
		return insuranceid1;
	}
	public void setInsuranceid1(String insuranceid1) {
		this.insuranceid1 = insuranceid1;
	}
	public String getInsuranceid2() {
		return insuranceid2;
	}
	public void setInsuranceid2(String insuranceid2) {
		this.insuranceid2 = insuranceid2;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getExclude() {
		return exclude;
	}
	public void setExclude(String exclude) {
		this.exclude = exclude;
	}
	public String getIspatientexcluded() {
		return ispatientexcluded;
	}
	public void setIspatientexcluded(String ispatientexcluded) {
		this.ispatientexcluded = ispatientexcluded;
	}
	public String getPublishedon() {
		return publishedon;
	}
	public void setPublishedon(String publishedon) {
		this.publishedon = publishedon;
	}
	public String getUpdatedon() {
		return updatedon;
	}
	public void setUpdatedon(String updatedon) {
		this.updatedon = updatedon;
	}
	public String getCreatedby() {
		return createdby;
	}
	public void setCreatedby(String createdby) {
		this.createdby = createdby;
	}
	public String getHomephone() {
		return homephone;
	}
	public void setHomephone(String homephone) {
		this.homephone = homephone;
	}
	public String getCreadtedon() {
		return creadtedon;
	}
	public void setCreadtedon(String creadtedon) {
		this.creadtedon = creadtedon;
	}
	public String getUpdatedby() {
		return updatedby;
	}
	public void setUpdatedby(String updatedby) {
		this.updatedby = updatedby;
	}
	public String getCreatedon() {
		return createdon;
	}
	public void setCreatedon(String createdon) {
		this.createdon = createdon;
	}
	public String getSpreviousfirstname() {
		return spreviousfirstname;
	}
	public void setSpreviousfirstname(String spreviousfirstname) {
		this.spreviousfirstname = spreviousfirstname;
	}
	public String getSpreviousmiddlename() {
		return spreviousmiddlename;
	}
	public void setSpreviousmiddlename(String spreviousmiddlename) {
		this.spreviousmiddlename = spreviousmiddlename;
	}
	public String getSpreviouslastname() {
		return spreviouslastname;
	}
	public void setSpreviouslastname(String spreviouslastname) {
		this.spreviouslastname = spreviouslastname;
	}
	public String getPhotourl() {
		return photourl;
	}
	public void setPhotourl(String photourl) {
		this.photourl = photourl;
	}
	public String getSnpi() {
		return snpi;
	}
	public void setSnpi(String snpi) {
		this.snpi = snpi;
	}
	public String getStin() {
		return stin;
	}
	public void setStin(String stin) {
		this.stin = stin;
	}
	public String getSccn() {
		return sccn;
	}
	public void setSccn(String sccn) {
		this.sccn = sccn;
	}
	public String getEmrid() {
		return emrid;
	}
	public void setEmrid(String emrid) {
		this.emrid = emrid;
	}
	public String getTenantid() {
		return tenantid;
	}
	public void setTenantid(String tenantid) {
		this.tenantid = tenantid;
	}
	public String getCountrycode() {
		return countrycode;
	}
	public void setCountrycode(String countrycode) {
		this.countrycode = countrycode;
	}
	public externalref getExternalrefObject() {
		return ExternalrefObject;
	}
	public void setExternalrefObject(externalref externalrefObject) {
		ExternalrefObject = externalrefObject;
	}
	public String getOrganizationid() {
		return organizationid;
	}
	public void setOrganizationid(String organizationid) {
		this.organizationid = organizationid;
	}
	public String getOrganizationnpi() {
		return organizationnpi;
	}
	public void setOrganizationnpi(String organizationnpi) {
		this.organizationnpi = organizationnpi;
	}
	public String getOrganizationtin() {
		return organizationtin;
	}
	public void setOrganizationtin(String organizationtin) {
		this.organizationtin = organizationtin;
	}
	public String getOrganizationccn() {
		return organizationccn;
	}
	public void setOrganizationccn(String organizationccn) {
		this.organizationccn = organizationccn;
	}
	public String getSprefix() {
		return sprefix;
	}
	public void setSprefix(String sprefix) {
		this.sprefix = sprefix;
	}
	public String getSsuffix() {
		return ssuffix;
	}
	public void setSsuffix(String ssuffix) {
		this.ssuffix = ssuffix;
	}
	public String getScommunicationpreference() {
		return scommunicationpreference;
	}
	public void setScommunicationpreference(String scommunicationpreference) {
		this.scommunicationpreference = scommunicationpreference;
	}
	public String getSemergencycontact() {
		return semergencycontact;
	}
	public void setSemergencycontact(String semergencycontact) {
		this.semergencycontact = semergencycontact;
	}
	public String getSemergencyphone() {
		return semergencyphone;
	}
	public void setSemergencyphone(String semergencyphone) {
		this.semergencyphone = semergencyphone;
	}
	public String getSemergencymobile() {
		return semergencymobile;
	}
	public void setSemergencymobile(String semergencymobile) {
		this.semergencymobile = semergencymobile;
	}
	public String getSemergencyrelationship() {
		return semergencyrelationship;
	}
	public void setSemergencyrelationship(String semergencyrelationship) {
		this.semergencyrelationship = semergencyrelationship;
	}
	public String getSpatientstatus() {
		return spatientstatus;
	}
	public void setSpatientstatus(String spatientstatus) {
		this.spatientstatus = spatientstatus;
	}
	public String getPhotoblobid() {
		return photoblobid;
	}
	public void setPhotoblobid(String photoblobid) {
		this.photoblobid = photoblobid;
	}
	public String getPatientqueueid() {
		return patientqueueid;
	}
	public void setPatientqueueid(String patientqueueid) {
		this.patientqueueid = patientqueueid;
	}
	public String getPatientsource() {
		return patientsource;
	}
	public void setPatientsource(String patientsource) {
		this.patientsource = patientsource;
	}
	public String getProviderid() {
		return providerid;
	}
	public void setProviderid(String providerid) {
		this.providerid = providerid;
	}
	public ArrayList<patientLanguage> getPatientlanguage() {
		return patientlanguage;
	}
	public void setPatientlanguage(ArrayList<patientLanguage> patientlanguage) {
		this.patientlanguage = patientlanguage;
	}
	public ArrayList<relatedperson> getRelatedperson() {
		return relatedperson;
	}
	public void setRelatedperson(ArrayList<relatedperson> relatedperson) {
		this.relatedperson = relatedperson;
	}
	
	
	
	
}
