package com.kaanerol.carfactory.exception;

public class TypeNotFoundException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public TypeNotFoundException(String message) {
		super(message);
	}
}
