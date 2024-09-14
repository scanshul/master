package com.java.develop.employee.exception;

import java.util.NoSuchElementException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandlar {
	
	@ExceptionHandler(NoSuchElementException.class)
	public ResponseEntity<String> resourseNotFoundException(NoSuchElementException ex){
		
		return new ResponseEntity<>("Id not found",HttpStatus.BAD_REQUEST);
		
	}

}
