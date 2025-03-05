package com.luvina.library.manager.models;

import com.luvina.library.manager.annotation.Entity;

@Entity(name = "Book")
public class Book {
	private String bookCode;

	private String bookName;

	private Author author;

	private String genre;

	private Integer quantity;

	public Book(String bookCode, String bookName, Author author, String genre, Integer quantity) {
		this.bookCode = bookCode;
		this.bookName = bookName;
		this.author = author;
		this.genre = genre;
		this.quantity = quantity;
	}

	/**
	 * @return the bookCode
	 */
	public String getBookCode() {
		return bookCode;
	}

	/**
	 * @return the bookName
	 */
	public String getBookName() {
		return bookName;
	}

	/**
	 * @return the author
	 */
	public Author getAuthor() {
		return author;
	}

	/**
	 * @return the genre
	 */
	public String getGenre() {
		return genre;
	}

	/**
	 * @return the quantity
	 */
	public Integer getQuantity() {
		return quantity;
	}
}
