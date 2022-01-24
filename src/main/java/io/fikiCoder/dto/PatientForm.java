package io.fikiCoder.dto;

public class PatientForm {

	
	
	private int Age;
	private String Gender;
	private String  Trouble_Breathing;
	private String Dry_Coughing;
	private String fever;
	private int zipCode;
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
		return Gender;
	}
	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		Gender = gender;
	}
	/**
	 * @return the trouble_Breathing
	 */
	public String getTrouble_Breathing() {
		return Trouble_Breathing;
	}
	/**
	 * @param trouble_Breathing the trouble_Breathing to set
	 */
	public void setTrouble_Breathing(String trouble_Breathing) {
		Trouble_Breathing = trouble_Breathing;
	}
	/**
	 * @return the dry_Coughing
	 */
	public String getDry_Coughing() {
		return Dry_Coughing;
	}
	/**
	 * @param dry_Coughing the dry_Coughing to set
	 */
	public void setDry_Coughing(String dry_Coughing) {
		Dry_Coughing = dry_Coughing;
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
	public int getZipCode() {
		return zipCode;
	}
	/**
	 * @param zipCode the zipCode to set
	 */
	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}
	
	
	
}