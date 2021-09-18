package com.htc.hospitalaggregate.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.htc.hospitalaggregate.entity.Appointment;
import com.htc.hospitalaggregate.entity.Patient;
import com.htc.hospitalaggregate.externalservices.AppointementService;
import com.htc.hospitalaggregate.externalservices.HospitalServices;

@RestController
public class HospitalServiceController {

	@Autowired
	HospitalServices hospitalServices;
	
	@Autowired
	AppointementService appointementservice;

	

	private static final Logger logger=LoggerFactory.getLogger(HospitalServiceController.class);
	
	@GetMapping("/hospital_service/patients/{id}")
	Patient getProduct(@PathVariable Long id){
		logger.toString();
		return hospitalServices.getPatientById(id);
		
	}
	
	@GetMapping("/appointement_service/appointement/{id}")
	Appointment getProduct2(@PathVariable Long id){
		logger.toString();
		return appointementservice.getappointementById(id);
		
	}

	
}
