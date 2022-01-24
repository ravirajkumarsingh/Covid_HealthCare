package io.fikiCoder.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.fikiCoder.dto.HospitalForm;
import io.fikiCoder.entity.Hospital;
import io.fikiCoder.exceptions.HospitalException;
import io.fikiCoder.exceptions.IncorrectArgumentException;
import io.fikiCoder.service.HospitalService;

@RestController
@RequestMapping("/Hospital")
@CrossOrigin(origins= {"http://localhost:4200"})
public class HospitalController {

	@Autowired
	HospitalService hospitalService;
	
	@PostMapping("addHospital")
	public String addHospitalDetails(@RequestBody HospitalForm hospitalForm) throws HospitalException,IncorrectArgumentException {
		
		String successMessage = hospitalService.addHospitalDetails(hospitalForm);
		return successMessage;
	}
	
	@GetMapping("View All Hospitals")
	public List<Hospital> viewAllHospital() throws HospitalException {
		return hospitalService.viewAllHospital();
	}
	
	@GetMapping("View Hosptial By ZipCode/{zipcode}")
	public List<Hospital> viewHospitalByZipcode(@PathVariable long zipcode) throws HospitalException,IncorrectArgumentException {
		return hospitalService.viewHospitalByZipcode(zipcode); 
	}
	
	@DeleteMapping("Delete Hospital By Id/{hospital_id}")
	public void deleteHosptialByID(long id) throws HospitalException {
		hospitalService.deleteHosptialByID(id);
	}


}
