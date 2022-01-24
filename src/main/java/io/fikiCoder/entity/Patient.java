package io.fikiCoder.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import com.sun.istack.NotNull;

@Entity
@DynamicInsert
@DynamicUpdate
@Table(name="Patients_table")
public class Patient {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Patient_id")
	private long patient_id;
	
	@Column(name="age")
	private int Age;
	
	@Column(name="gender")
	private String gender;
	
	@Column(name="breathing_rate")
	private String Trouble_breathing;
	
	@Column(name="cough")
	private String Dry_cough;
	
	@Column(name="fever")
	private String fever;
	
	@Column(name="ZipCode")
	@NotNull
	private long zipCode;

	/**
	 * @return the patient_id
	 */
	public long getPatient_id() {
		return patient_id;
	}

	/**
	 * @param patient_id the patient_id to set
	 */
	public void setPatient_id(long patient_id) {
		this.patient_id = patient_id;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return Age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		Age = age;
	}

	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * @return the trouble_breathing
	 */
	public String getTrouble_breathing() {
		return Trouble_breathing;
	}

	/**
	 * @param trouble_breathing the trouble_breathing to set
	 */
	public void setTrouble_breathing(String trouble_breathing) {
		Trouble_breathing = trouble_breathing;
	}

	/**
	 * @return the dry_cough
	 */
	public String getDry_cough() {
		return Dry_cough;
	}

	/**
	 * @param dry_cough the dry_cough to set
	 */
	public void setDry_cough(String dry_cough) {
		Dry_cough = dry_cough;
	}

	/**
	 * @return the fever
	 */
	public String getFever() {
		return fever;
	}

	/**
	 * @param fever the fever to set
	 */
	public void setFever(String fever) {
		this.fever = fever;
	}

	/**
	 * @return the zipCode
	 */
	public long getZipCode() {
		return zipCode;
	}

	/**
	 * @param zipCode the zipCode to set
	 */
	public void setZipCode(long zipCode) {
		this.zipCode = zipCode;
	}
	
}
