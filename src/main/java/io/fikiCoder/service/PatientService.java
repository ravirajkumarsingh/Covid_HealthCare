package io.fikiCoder.service;

import java.util.List;

import io.fikiCoder.dto.PatientForm;
import io.fikiCoder.entity.Hospital;
import io.fikiCoder.exceptions.IncorrectArgumentException;
import io.fikiCoder.exceptions.PatientException;

public interface PatientService {

	public List<Hospital> check_Hospital_Near_Me(long zipcode) throws IncorrectArgumentException;
	public String checkHealth(PatientForm patientForm) throws PatientException;
}
