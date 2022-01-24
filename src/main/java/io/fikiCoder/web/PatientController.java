package io.fikiCoder.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.fikiCoder.dto.PatientForm;
import io.fikiCoder.entity.Hospital;
import io.fikiCoder.exceptions.IncorrectArgumentException;
import io.fikiCoder.exceptions.PatientException;
import io.fikiCoder.service.PatientService;

@RestController
@RequestMapping("/Patient")
@CrossOrigin(origins = {"http://localhost:4200"})
public class PatientController {

	@Autowired
	PatientService patientService;
	
	@GetMapping("Check Hospital Near Me/{zipcode}")
	public List<Hospital> check_Hospital_Near_Me(long zipcode) throws IncorrectArgumentException {
		return patientService.check_Hospital_Near_Me(zipcode);
	}
	
	@PostMapping("Check Health")
	public String checkHealth(@RequestBody PatientForm patientForm) throws PatientException {
		String message = patientService.checkHealth(patientForm);
		return message;
	}

}
