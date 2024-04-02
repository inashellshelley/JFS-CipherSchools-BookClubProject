package com.bookClub.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="MyReads")
public class MyReadingList {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String book_name;
	private String author_name;
	private String genre;
	private String book_owner_name;
	private String book_link;
	public MyReadingList(int id, String book_name, String author_name, String genre, String book_owner_name,
			String book_link) {
		super();
		this.id = id;
		this.book_name = book_name;
		this.author_name = author_name;
		this.genre = genre;
		this.book_owner_name = book_owner_name;
		this.book_link = book_link;
	}
	public MyReadingList() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBook_name() {
		return book_name;
	}
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}
	public String getAuthor_name() {
		return author_name;
	}
	public void setAuthor_name(String author_name) {
		this.author_name = author_name;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getBook_owner_name() {
		return book_owner_name;
	}
	public void setBook_owner_name(String book_owner_name) {
		this.book_owner_name = book_owner_name;
	}
	public String getBook_link() {
		return book_link;
	}
	public void setBook_link(String book_link) {
		this.book_link = book_link;
	}
	
}
