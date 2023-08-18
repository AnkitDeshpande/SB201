package com.masai.ui;

import java.time.LocalDate;

public class Message {
	private long id;
	private String content;
	private String author;
	private LocalDate timestamp;

	public Message() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Message(long id, String content, String author, LocalDate timestamp) {
		super();
		this.id = id;
		this.content = content;
		this.author = author;
		this.timestamp = timestamp;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public LocalDate getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(LocalDate timestamp) {
		this.timestamp = timestamp;
	}

	@Override
	public String toString() {
		return "Message [id=" + id + ", content=" + content + ", author=" + author + ", timestamp=" + timestamp + "]";
	}

}
