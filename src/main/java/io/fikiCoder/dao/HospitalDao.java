package io.fikiCoder.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.fikiCoder.entity.Hospital;

@Repository
public interface HospitalDao extends JpaRepository<Hospital, Long>{

	List<Hospital> findByZipCode(long zipcode);
}
