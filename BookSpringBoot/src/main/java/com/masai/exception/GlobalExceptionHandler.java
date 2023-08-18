package com.masai.exception;

import java.time.LocalDate;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(NoBookFoundException.class)
	public ResponseEntity<ExceptionFormat> noBook(NoBookFoundException ex, WebRequest wr) {
		return new ResponseEntity<ExceptionFormat>(new ExceptionFormat(LocalDate.now(), ex.getMessage(), wr.getDescription(false)), HttpStatus.NOT_FOUND);
	}
}
