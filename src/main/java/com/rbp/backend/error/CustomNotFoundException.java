package com.rbp.backend.error;


public class CustomNotFoundException extends RuntimeException {
	public CustomNotFoundException(String message) {
		super(message);
	}
}
