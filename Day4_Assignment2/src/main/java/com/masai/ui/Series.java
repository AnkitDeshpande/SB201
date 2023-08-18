package com.masai.ui;

public class Series {
	private Long id;
	private String title;

	public Series() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Series(Long id, String title) {
		super();
		this.id = id;
		this.title = title;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "Series [id=" + id + ", title=" + title + "]";
	}

}