package io.fikiCoder.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.fikiCoder.dao.HospitalDao;
import io.fikiCoder.dao.PatientDao;
import io.fikiCoder.dto.PatientForm;
import io.fikiCoder.entity.Hospital;
import io.fikiCoder.entity.Patient;
import io.fikiCoder.exceptions.IncorrectArgumentException;
import io.fikiCoder.exceptions.PatientException;
import io.fikiCoder.util.CodeConstant;

@Service
@Transactional
public class PatientServiceImpl implements PatientService{

	
	@Autowired
	HospitalDao hospitalDao;
	
	@Autowired
	PatientDao patientDao;
	
	
	public List<Hospital> check_Hospital_Near_Me(long zipcode) throws IncorrectArgumentException {
		
		List<Hospital> hosptialList = hospitalDao.findByZipCode(zipcode);
		if(hosptialList.isEmpty())
			throw new IncorrectArgumentException(CodeConstant.INVALID_ZIPCODE);
		return hosptialList;
	}


	public String checkHealth(PatientForm patientForm) throws PatientException { 
		Patient patientRequest=new Patient();
		patientRequest.setAge(patientForm.getAge());
		patientRequest.setDry_cough(patientForm.getDry_Coughing());
		patientRequest.setFever(patientForm.getFever());
		patientRequest.setGender(patientForm.getGender());
		patientRequest.setTrouble_breathing(patientForm.getTrouble_Breathing());
		patientRequest.setZipCode(patientForm.getZipCode());
		if((patientRequest.getTrouble_breathing().contentEquals("YES")) && (patientRequest.getDry_cough().contentEquals("YES")) && (patientRequest.getFever().contentEquals("YES"))) {
			return CodeConstant.TRAIAGE;
		}
		else if ((patientRequest.getTrouble_breathing().contentEquals("YES")) && (patientRequest.getDry_cough().contentEquals("YES")) && (patientRequest.getFever().contentEquals("NO"))) {
			return CodeConstant.TEST;
		}
		else if ((patientRequest.getTrouble_breathing().contentEquals("YES")) && (patientRequest.getDry_cough().contentEquals("NO")) && (patientRequest.getFever().contentEquals("YES"))) {
			return CodeConstant.TEST;
		}
		else if ((patientRequest.getTrouble_breathing().contentEquals("YES")) && (patientRequest.getDry_cough().contentEquals("NO")) && (patientRequest.getFever().contentEquals("NO"))) {
			return CodeConstant.CHECK_LATER;
		}
		else if ((patientRequest.getTrouble_breathing().contentEquals("NO")) && (patientRequest.getDry_cough().contentEquals("YES")) && (patientRequest.getFever().contentEquals("YES"))) {
			return CodeConstant.TEST;
		}
		else if ((patientRequest.getTrouble_breathing().contentEquals("NO")) && (patientRequest.getDry_cough().contentEquals("YES")) && (patientRequest.getFever().contentEquals("NO"))) {
			return CodeConstant.STAY_HOME;
		}
		else if ((patientRequest.getTrouble_breathing().contentEquals("NO")) && (patientRequest.getDry_cough().contentEquals("NO")) && (patientRequest.getFever().contentEquals("YES"))) {
			return CodeConstant.STAY_HOME;
		}
		else {
			return CodeConstant.STAY_HOME;
		}
	}
}
