package io.fikiCoder.dto;

public class HospitalForm {

	private String hospital_Name;
	private int no_of_beds;
	private int no_of_covid_kit;
	private int no_of_ventilators;
	private int no_of_staff;
	private long zipcode;
	
	/**
	 * @return the hospital_Name
	 */
	public String getHospital_Name() {
		return hospital_Name;
	}
	/**
	 * @param hospital_Name the hospital_Name to set
	 */
	public void setHospital_Name(String hospital_Name) {
		this.hospital_Name = hospital_Name;
	}
	/**
	 * @return the no_of_beds
	 */
	public int getNo_of_beds() {
		return no_of_beds;
	}
	/**
	 * @param no_of_beds the no_of_beds to set
	 */
	public void setNo_of_beds(int no_of_beds) {
		this.no_of_beds = no_of_beds;
	}
	/**
	 * @return the no_of_covid_kit
	 */
	public int getNo_of_covid_kit() {
		return no_of_covid_kit;
	}
	/**
	 * @param no_of_covid_kit the no_of_covid_kit to set
	 */
	public void setNo_of_covid_kit(int no_of_covid_kit) {
		this.no_of_covid_kit = no_of_covid_kit;
	}
	/**
	 * @return the no_of_ventilators
	 */
	public int getNo_of_ventilators() {
		return no_of_ventilators;
	}
	/**
	 * @param no_of_ventilators the no_of_ventilators to set
	 */
	public void setNo_of_ventilators(int no_of_ventilators) {
		this.no_of_ventilators = no_of_ventilators;
	}
	/**
	 * @return the no_of_staff
	 */
	public int getNo_of_staff() {
		return no_of_staff;
	}
	/**
	 * @param no_of_staff the no_of_staff to set
	 */
	public void setNo_of_staff(int no_of_staff) {
		this.no_of_staff = no_of_staff;
	}
	/**
	 * @return the zipcode
	 */
	public long getZipcode() {
		return zipcode;
	}
	/**
	 * @param zipcode the zipcode to set
	 */
	public void setZipcode(long zipcode) {
		this.zipcode = zipcode;
	}

	
}
