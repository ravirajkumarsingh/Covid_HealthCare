package io.fikiCoder.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.fikiCoder.dao.HospitalDao;
import io.fikiCoder.dto.HospitalForm;
import io.fikiCoder.entity.Hospital;
import io.fikiCoder.exceptions.HospitalException;
import io.fikiCoder.exceptions.IncorrectArgumentException;
import io.fikiCoder.util.CodeConstant;

@Service
@Transactional
public class HospitalServiceImpl implements HospitalService{

	@Autowired
	HospitalDao hospitalDao;
	
	public String addHospitalDetails(HospitalForm hospitalForm) throws HospitalException, IncorrectArgumentException {
		Hospital hospital = new Hospital();
		hospital.setHospital_name(hospitalForm.getHospital_Name());
		hospital.setNo_of_beds(hospitalForm.getNo_of_beds());
		hospital.setNo_of_Covid_Kit(hospitalForm.getNo_of_covid_kit());
		hospital.setNo_Of_Staff(hospitalForm.getNo_of_staff());
		hospital.setNo_Of_Ventilators(hospitalForm.getNo_of_ventilators());
		hospital.setZipCode(hospitalForm.getZipcode());
		hospitalDao.save(hospital);
		return CodeConstant.HOSPITAL_ADDED;
	}

	public List<Hospital> viewAllHospital()  {
		List<Hospital> hospitalList = hospitalDao.findAll();
		if(hospitalList.isEmpty()) {
			try {
				throw new HospitalException(CodeConstant.NO_HOSPITAL_FOUND);
			} catch (HospitalException e) {
				// TODO Auto-generated catch block
				e.getMessage();
			}
		}
		return hospitalList;
	}

	public List<Hospital> viewHospitalByZipcode(long zipcode) {
			
			List<Hospital> hospitalsList = hospitalDao.findByZipCode(zipcode);
			if(hospitalsList.isEmpty()) {
				try {
					throw new IncorrectArgumentException(CodeConstant.INVALID_ZIPCODE);
				} catch (IncorrectArgumentException e) {
					// TODO Auto-generated catch block
					e.getMessage();
				}
			}
			return hospitalsList;
		}

	public void deleteHosptialByID(long id) throws HospitalException {
		// TODO Auto-generated method stub
		hospitalDao.deleteById(id);
		
	}

	public String updateHosptial(HospitalForm hospitalForm, long id)
			throws HospitalException, IncorrectArgumentException {
		// TODO Auto-generated method stub
		 Hospital hospital = hospitalDao.findById(id)
			      .orElseThrow(() -> new IncorrectArgumentException("Invalid hospital Id:" + id));
			   hospitalDao.delete(hospital);
		return CodeConstant.UPDATED;
	}

}
