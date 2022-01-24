package io.fikiCoder.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.fikiCoder.entity.Patient;

@Repository
public interface PatientDao extends JpaRepository<Patient,String>{
}
