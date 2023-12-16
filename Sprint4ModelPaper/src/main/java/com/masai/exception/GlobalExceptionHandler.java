package com.masai.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

@RestControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorDetails> NotFoundException(NotFoundException ex, WebRequest req) {
		return new ResponseEntity<ErrorDetails>(
				new ErrorDetails(LocalDateTime.now(), ex.getMessage(), req.getDescription(false)),
				HttpStatus.BAD_REQUEST);
	}
}
