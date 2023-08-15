package com.learn.json.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import io.jsonwebtoken.ExpiredJwtException;


@RestControllerAdvice
public class BaseException extends RuntimeException{
	
	@ExceptionHandler(value = ExpiredJwtException.class)
	public ResponseEntity<ErrorDetails> handleInvalidJsonFromateException(ExpiredJwtException exception,
			WebRequest request){
		ErrorDetails errorDetails = new ErrorDetails(new Date(), "Token Expired", request.getDescription(false));
		
		return new ResponseEntity<ErrorDetails>(errorDetails, HttpStatus.BAD_GATEWAY);
		
	}
	

}
