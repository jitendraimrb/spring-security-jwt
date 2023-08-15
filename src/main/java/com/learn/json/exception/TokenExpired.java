package com.learn.json.exception;

public class TokenExpired extends RuntimeException{
	private static final long serialVersionUID = 1L;

	private String message;
	public TokenExpired(String message) {
		
		super(message);
		this.message = message;
	}

}
