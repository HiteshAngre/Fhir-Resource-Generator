package com.triarq.fhirresourcegenerator.mapper;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.hl7.fhir.r4.model.Address;
import org.hl7.fhir.r4.model.Address.AddressUse;
import org.hl7.fhir.r4.model.CodeableConcept;
import org.hl7.fhir.r4.model.Coding;
import org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem;
import org.hl7.fhir.r4.model.DateType;
import org.hl7.fhir.r4.model.Patient;
import org.hl7.fhir.r4.model.Patient.ContactComponent;
import org.hl7.fhir.r4.model.codesystems.ExpressionLanguage;
import org.hl7.fhir.r4.model.codesystems.LanguagePreferenceType;
import org.hl7.fhir.r4.model.codesystems.LanguagePreferenceTypeEnumFactory;
import org.hl7.fhir.r4.model.codesystems.RelatedClaimRelationship;
import org.hl7.fhir.r4.model.codesystems.RelatedClaimRelationshipEnumFactory;
import org.hl7.fhir.r4.model.codesystems.V3AmericanIndianAlaskaNativeLanguages;
import org.springframework.stereotype.Component;
import org.hl7.fhir.r4.model.Enumerations;
import org.hl7.fhir.r4.model.HumanName;
import org.hl7.fhir.r4.model.IdType;
import org.hl7.fhir.r4.model.Identifier.IdentifierUse;

import com.google.gson.JsonObject;
import com.triarq.fhirresourcegenerator.model.Patientmodel;
import com.triarq.fhirresourcegenerator.model.relatedperson;

import ca.uhn.fhir.context.FhirContext;
import ca.uhn.fhir.model.dstu2.composite.AddressDt;
import ca.uhn.fhir.model.dstu2.composite.HumanNameDt;
import ca.uhn.fhir.model.dstu2.resource.Patient.Contact;
import ca.uhn.fhir.model.dstu2.valueset.AddressUseEnum;
import ca.uhn.fhir.model.dstu2.valueset.AdministrativeGenderEnum;
import ca.uhn.fhir.model.dstu2.valueset.ContactPointSystemEnum;
import ca.uhn.fhir.model.dstu2.valueset.MaritalStatusCodesEnum;
import ca.uhn.fhir.parser.IParser;

@Component
public class patientMapper {

	
	public String patientmapper(Patientmodel patientmodel)
	{
		FhirContext ctx = FhirContext.forR4();
		System.out.println("enter");
		Patient fhirPatient = new Patient();
		HumanName patientname=new HumanName();
		patientname	
			.setFamily(patientmodel.getSlastname())
			.addGiven(patientmodel.getSfirstname());
			
		if(patientmodel.getSmiddlename()!=null && patientmodel.getSmiddlename()!="")
		{
			patientname
				.addGiven(patientmodel.getSmiddlename());
		}
		if(patientmodel.getSsuffix()!=null && patientmodel.getSsuffix()!="")
		{
			patientname
				.addSuffix(patientmodel.getSsuffix());
		}
		if(patientmodel.getSprefix()!=null && patientmodel.getSprefix()!="")
		{
			patientname
				.addPrefix(patientmodel.getSprefix());
		}
		fhirPatient.addName(patientname);
		
		fhirPatient
			.addIdentifier()
				.setUse(IdentifierUse.OFFICIAL);
		fhirPatient
			.setActive(true);
		
		switch(patientmodel.getSgender())
		{
		case "Male":fhirPatient.setGender(Enumerations.AdministrativeGender.MALE);	break;
		case "Female":fhirPatient.setGender(Enumerations.AdministrativeGender.FEMALE); break;
		}
		if(patientmodel.getDtdob()!=null)
		{
			
			fhirPatient.setBirthDateElement(new DateType(patientmodel.getDtdob()));
		}
		if(patientmodel.getUrl()!=null && patientmodel.getUrl()!="")
		{
			fhirPatient.addPhoto()
				.setUrl(patientmodel.getUrl());
		}
		if(patientmodel.getSphone()!=null && patientmodel.getSphone()!="")
		{
			fhirPatient.addTelecom()
			.setSystem(ContactPointSystem.PHONE)
			.setValue(patientmodel.getSphone());	
		}
		if(patientmodel.getSemail()!="" && patientmodel.getSemail()!=null)
		{
			fhirPatient.addTelecom()
			.setSystem(ContactPointSystem.EMAIL)
			.setValue(patientmodel.getSemail());	
		}
		if(patientmodel.getSfax()!="" && patientmodel.getSfax()!=null)
		{
			fhirPatient.addTelecom()
			.setSystem(ContactPointSystem.FAX)
			.setValue(patientmodel.getSfax());	
		}
		fhirPatient.addAddress()
			.setUse(AddressUse.HOME)
			.addLine(patientmodel.getSaddressline1())
			.addLine(patientmodel.getSaddressline2())
			.setCity(patientmodel.getScity())
			.setState(patientmodel.getScity())
			.setPostalCode(patientmodel.getSzip())
			.setCountry(patientmodel.getScounty());
		// Give the patient a temporary UUID so that other resources in
		// the transaction can refer to it
		
		if(patientmodel.getSmaritialstatus()!="" && patientmodel.getSmaritialstatus()!=null)
		{
			CodeableConcept cc=new CodeableConcept();
			cc.addCoding()
				.setSystem(MaritalStatusCodesEnum.M.getSystem())
				.setCode(MaritalStatusCodesEnum.M.getCode())	;
			fhirPatient.setMaritalStatus(cc);
		}
		if(patientmodel.getRelatedperson().size()>0)
		{
			for(int i=0;i<patientmodel.getRelatedperson().size();i++)
			{
				ContactComponent RelativeContact=new ContactComponent();
				relatedperson r=patientmodel.getRelatedperson().get(i);
				HumanName relativename=new HumanName();
				if(r.getLastname()!="" && r.getLastname()!=null)
				{
					relativename
					.setFamily(r.getLastname());	
				}
				if(r.getFirstname()!="" && r.getFirstname()!=null)
				{
					relativename	
					.addGiven(r.getFirstname());	
				}
				if(r.getMiddlename()!="" && r.getMiddlename()!=null)
				{
					relativename
					.addGiven(r.getMiddlename());	
				}			
				if(relativename!=null)
				{
					RelativeContact
					.setName(relativename);
				}
				if(r.getDob()!=null)
				{
					
					fhirPatient.setBirthDateElement(new DateType(r.getDob()));
				}
				Address address=new Address();
				address
				.setUse(AddressUse.HOME)
				.addLine(r.getAddressline1())
				.addLine(r.getAddressline2())
				.setCity(r.getCity())
				.setState(r.getCity())
				.setPostalCode(r.getZip())
				.setCountry(r.getCounty());
				
				RelativeContact.setAddress(address);
				if(r.getGender()!="" && r.getGender()!=null)
				{
					switch(r.getGender())
					{
					case "Male":RelativeContact.setGender(Enumerations.AdministrativeGender.MALE);	break;
					case "Female":RelativeContact.setGender(Enumerations.AdministrativeGender.FEMALE); break;
					}
				}
				if(r.getPhone()!=null && r.getPhone()!="")
				{
					RelativeContact.addTelecom()
					.setSystem(ContactPointSystem.PHONE)
					.setValue(r.getPhone());	
				}
				if(r.getEmail()!="" && r.getEmail()!=null)
				{
					RelativeContact.addTelecom()
					.setSystem(ContactPointSystem.EMAIL)
					.setValue(r.getEmail());	
				}
				if(r.getFax()!="" && r.getFax()!=null)
				{
					RelativeContact.addTelecom()
					.setSystem(ContactPointSystem.FAX)
					.setValue(r.getFax());	
				}	
				fhirPatient.addContact(RelativeContact);	
			}
		}
// 		fhirPatient.setId(IdType.newRandomUuid());		
		IParser parser = ctx.newJsonParser();
		parser.setPrettyPrint(true);
		String serialized = parser.encodeResourceToString(fhirPatient);
		System.out.println(serialized);
		return serialized;
	}
	
	
	
}
