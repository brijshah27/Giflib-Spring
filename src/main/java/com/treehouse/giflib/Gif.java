package com.treehouse.giflib;

import java.time.LocalDate;

public class Gif {
	private String name;
	private int categoryId;
	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	private LocalDate dateUploaded;
	private String username;
	private boolean favourite;
	
	
	public Gif(String name, int categoryId,LocalDate dateUploaded,String username, boolean favourite) {
		super();
		this.name = name;
		this.categoryId = categoryId;
		this.dateUploaded = dateUploaded;
		this.username = username;
		this.favourite = favourite;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getDateUploaded() {
		return dateUploaded;
	}
	public void setDateUploaded(LocalDate dateUploaded) {
		this.dateUploaded = dateUploaded;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public boolean isFavourite() {
		return favourite;
	}
	public void setFavourite(boolean favourite) {
		this.favourite = favourite;
	}
	
}
