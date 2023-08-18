package com.masai.exception;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.NoHandlerFoundException;

@ControllerAdvice
public class GlobalExceptionhandler {

	@ExceptionHandler(NoHandlerFoundException.class)
	public ResponseEntity<ErrorDetails> getExceptionForNoHandler(NoHandlerFoundException ex, WebRequest request) {
		ErrorDetails ed = new ErrorDetails(LocalDateTime.now(), ex.getMessage(), request.getDescription(false));
		return new ResponseEntity<ErrorDetails>(ed, HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<ErrorDetails> handleException(MethodArgumentNotValidException ex, WebRequest request) {
		LocalDateTime now = LocalDateTime.now();
		List<ObjectError> msgs = ex.getAllErrors();
		String message = String.join(" || ", MethodArgumentNotValidException.errorsToStringList(msgs));

		String url = request.getDescription(false);

		ErrorDetails details = new ErrorDetails(now, message, url);
		return new ResponseEntity<ErrorDetails>(details, HttpStatus.FORBIDDEN);
	}
}
