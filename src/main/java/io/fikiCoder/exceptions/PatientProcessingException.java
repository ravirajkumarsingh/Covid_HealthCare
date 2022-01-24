package io.fikiCoder.exceptions;

public class PatientProcessingException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3663470507647739827L;

	public PatientProcessingException() {
		super();
	}
	
	public PatientProcessingException(String message) {
		super(message);
	}
}
