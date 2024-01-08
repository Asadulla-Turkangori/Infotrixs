package com.modules;

public class Quote {
	private int id;
	private String author;
	private String value;
	
	public Quote() {
		
	}
	
	public Quote(int id, String author, String value) {
		super();
		this.id = id;
		this.author = author;
		this.value = value;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getAuthor() {
		return author;
	}



	public void setAuthor(String author) {
		this.author = author;
	}



	public String getValue() {
		return value;
	}



	public void setValue(String value) {
		this.value = value;
	}
	
	
}
