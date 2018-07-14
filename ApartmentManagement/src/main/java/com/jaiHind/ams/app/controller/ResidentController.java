/**
 * 
 */
package com.jaiHind.ams.app.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jaiHind.ams.app.model.Resident;
import com.jaiHind.ams.app.service.ResidentService;




/**
 * @author dell
 *
 */
@RestController
public class ResidentController {
	
	@Autowired
	ResidentService residentService;

	
	@GetMapping(value="/sayHello")
	public String sayHello() {
		return "Welcome In Apartment Management Application...";
	}
	
	@PostMapping(value="/resident/save")
	public Resident saveNewResident(@RequestBody Resident resident) {
		
		residentService.saveResident(resident);
		return resident;
	}
	
	@GetMapping(value="/resident/getResident{roomNo}")
	public Optional<Resident> showResidentInfo(@PathVariable("roomNo") Integer residentId) {

		return residentService.showResidentInfo(residentId);
	}
	
	@GetMapping(value="/resident/getAllResident")
	public Iterable<Resident> showAllResidentInfo() {

		return residentService.showAllResidentInfo();
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
