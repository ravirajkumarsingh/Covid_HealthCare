package io.fikiCoder.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

@Entity
@DynamicInsert
@DynamicUpdate
@Table(name="Hospital_table")
public class Hospital {
	
	@Id
	@Column(name="Hospital_Id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long hospital_id;
	
	@Column(name="Hospital_name")
	private String hospital_name;
	
	@Column(name="No_of_Beds")
	private int No_of_beds;
	
	@Column(name="No_of_Covid_Kit")
	private int No_of_Covid_Kit;
	
	@Column(name="No_Of_Ventilators")
	private int No_Of_Ventilators;
	
	@Column(name="No_of_Staff")
	private int No_Of_Staff;
	
	@Column(name="Zipcode")
	private long zipCode;

	
	/**
	 * @return the hospital_id
	 */
	public long getHospital_id() {
		return hospital_id;
	}

	/**
	 * @param hospital_id the hospital_id to set
	 */
	public void setHospital_id(long hospital_id) {
		this.hospital_id = hospital_id;
	}

	/**
	 * @return the hospital_name
	 */
	public String getHospital_name() {
		return hospital_name;
	}

	/**
	 * @param hospital_name the hospital_name to set
	 */
	public void setHospital_name(String hospital_name) {
		this.hospital_name = hospital_name;
	}

	/**
	 * @return the no_of_beds
	 */
	public int getNo_of_beds() {
		return No_of_beds;
	}

	/**
	 * @param no_of_beds the no_of_beds to set
	 */
	public void setNo_of_beds(int no_of_beds) {
		No_of_beds = no_of_beds;
	}

	/**
	 * @return the no_of_Covid_Kit
	 */
	public int getNo_of_Covid_Kit() {
		return No_of_Covid_Kit;
	}

	/**
	 * @param no_of_Covid_Kit the no_of_Covid_Kit to set
	 */
	public void setNo_of_Covid_Kit(int no_of_Covid_Kit) {
		No_of_Covid_Kit = no_of_Covid_Kit;
	}

	/**
	 * @return the no_Of_Ventilators
	 */
	public int getNo_Of_Ventilators() {
		return No_Of_Ventilators;
	}

	/**
	 * @param no_Of_Ventilators the no_Of_Ventilators to set
	 */
	public void setNo_Of_Ventilators(int no_Of_Ventilators) {
		No_Of_Ventilators = no_Of_Ventilators;
	}

	/**
	 * @return the no_Of_Staff
	 */
	public int getNo_Of_Staff() {
		return No_Of_Staff;
	}

	/**
	 * @param no_Of_Staff the no_Of_Staff to set
	 */
	public void setNo_Of_Staff(int no_Of_Staff) {
		No_Of_Staff = no_Of_Staff;
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
