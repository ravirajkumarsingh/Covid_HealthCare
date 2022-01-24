package io.fikiCoder.service;

import java.util.List;

import io.fikiCoder.dto.HospitalForm;
import io.fikiCoder.entity.Hospital;
import io.fikiCoder.exceptions.HospitalException;
import io.fikiCoder.exceptions.IncorrectArgumentException;

public interface HospitalService {

	public String addHospitalDetails(HospitalForm hospitalForm) throws HospitalException,IncorrectArgumentException;
	public List<Hospital> viewAllHospital() throws HospitalException;
	public List<Hospital> viewHospitalByZipcode(long zipcode) throws HospitalException,IncorrectArgumentException;
	public void deleteHosptialByID(long id) throws HospitalException;
	public String updateHosptial(HospitalForm hospitalForm, long id) throws HospitalException,IncorrectArgumentException;
}
