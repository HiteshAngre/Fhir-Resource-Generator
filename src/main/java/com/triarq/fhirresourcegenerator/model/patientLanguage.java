package com.triarq.fhirresourcegenerator.model;

public class patientLanguage {

	 private float npatientlanguageid;
	 private String npatientid;
	 private float nlanguageid;
	 private String slanguagedescription;
	 private String slanguagecode;
	 
	 
	 
	public patientLanguage() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public patientLanguage(float npatientlanguageid, String npatientid, float nlanguageid, String slanguagedescription,
			String slanguagecode) {
		super();
		this.npatientlanguageid = npatientlanguageid;
		this.npatientid = npatientid;
		this.nlanguageid = nlanguageid;
		this.slanguagedescription = slanguagedescription;
		this.slanguagecode = slanguagecode;
	}

	public float getNpatientlanguageid() {
		return npatientlanguageid;
	}
	public void setNpatientlanguageid(float npatientlanguageid) {
		this.npatientlanguageid = npatientlanguageid;
	}
	public String getNpatientid() {
		return npatientid;
	}
	public void setNpatientid(String npatientid) {
		this.npatientid = npatientid;
	}
	public float getNlanguageid() {
		return nlanguageid;
	}
	public void setNlanguageid(float nlanguageid) {
		this.nlanguageid = nlanguageid;
	}
	public String getSlanguagedescription() {
		return slanguagedescription;
	}
	public void setSlanguagedescription(String slanguagedescription) {
		this.slanguagedescription = slanguagedescription;
	}
	public String getSlanguagecode() {
		return slanguagecode;
	}
	public void setSlanguagecode(String slanguagecode) {
		this.slanguagecode = slanguagecode;
	}
	 
}
