package com.htc.hospitalaggregate.externalservices;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.htc.hospitalaggregate.entity.Appointment;

@Component
@FeignClient(url = "http://localhost:8087",name="Appointement")
public interface AppointementService {

	@GetMapping("api/appointement/{id}")
	Appointment getappointementById(@PathVariable("id") Long id);
}
