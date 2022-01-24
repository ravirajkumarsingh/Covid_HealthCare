package io.fikiCoder.exceptions;

public class NoRequestsFoundException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5494915845017745375L;

	public NoRequestsFoundException() {
		super();
	}
	
	public NoRequestsFoundException(String message) {
		super(message);
	}
}
