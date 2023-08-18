package com.example.demo.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	
	@ExceptionHandler(NoBookByIdException.class)
	public ResponseEntity<ExceptionFormat> noBookById(NoBookByIdException ex, WebRequest wr){
		
		ExceptionFormat ef = new ExceptionFormat(LocalDateTime.now(), ex.getMessage(), wr.getDescription(false) );
		
		return new ResponseEntity<ExceptionFormat>(ef, HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler(NoBookInPriceRangeException.class)
	public ResponseEntity<ExceptionFormat> noBookInPriceRange(NoBookInPriceRangeException ex, WebRequest wr){
		ExceptionFormat ef = new ExceptionFormat(LocalDateTime.now(), ex.getMessage(), wr.getDescription(false) );
		
		return new ResponseEntity<ExceptionFormat>(ef, HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(MissingParam.class)
	public ResponseEntity<ExceptionFormat> missingParam(MissingParam ex, WebRequest wr){
		ExceptionFormat ef = new ExceptionFormat(LocalDateTime.now(), ex.getMessage(), wr.getDescription(false) );
		
		return new ResponseEntity<ExceptionFormat>(ef, HttpStatus.BAD_REQUEST);
	}
}
