package com.masai.exception;

import java.time.LocalDate;

public class ExceptionFormat {
	private LocalDate date;
	private String msg;
	private String uri;

	public ExceptionFormat() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ExceptionFormat(LocalDate date, String msg, String uri) {
		super();
		this.date = date;
		this.msg = msg;
		this.uri = uri;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}

}
