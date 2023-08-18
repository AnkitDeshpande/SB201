package com.example.demo.exception;

import java.time.LocalDateTime;

public class ExceptionFormat {
	
	private LocalDateTime timeStamp;
	private String message;
	private String uri;
	
	public ExceptionFormat(LocalDateTime timeStamp, String message, String uri) {
		super();
		this.timeStamp = timeStamp;
		this.message = message;
		this.uri = uri;
	}
	
	public ExceptionFormat() {
		// TODO Auto-generated constructor stub
	}

	public LocalDateTime getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(LocalDateTime timeStamp) {
		this.timeStamp = timeStamp;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}
	
	
	

}
