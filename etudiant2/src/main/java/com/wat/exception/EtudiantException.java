package com.wat.exception;

public class EtudiantException extends RuntimeException{

	private String message;
	public EtudiantException(String message) {
		super(message);
		this.message = message;
	}

	
}
