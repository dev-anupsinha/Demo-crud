package com.example.democrud.exceptions;

public class StudentNotFoundException extends RuntimeException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 100L;
	String message;
	
	public StudentNotFoundException(String message) {
		super(message);
	}
	
}
