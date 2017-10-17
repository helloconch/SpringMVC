package com.conch.model;

import java.io.Serializable;

public class Book implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2163202156174148649L;
	private int id;
	private String name;
	private String author;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

}
