package com.triarq.fhirresourcegenerator.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.triarq.fhirresourcegenerator.mapper.patientMapper;
import com.triarq.fhirresourcegenerator.model.Patientmodel;



@RestController
public class PatientController {

	@Autowired
	 patientMapper pm;
	
	@PostMapping(path = "/patientResource", consumes = "application/json")
	public String patientResource(@RequestBody Patientmodel patient) {
		return pm.patientmapper(patient);
	}
	
	
	
}
