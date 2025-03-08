package com.luvina.library.manager.models;

import com.luvina.library.manager.annotation.Entity;
import com.luvina.library.manager.constant.Constants;

@Entity(name = "Book")
public class Book extends Document {

	private Author author;

	private String genre;

	public Book(String documentId, String documentName, int quantity, Author author, String genre) {
		super(documentId, documentName, quantity);
		this.author = author;
		this.genre = genre;
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

	@Override
	public String getDetails() {
		return String.format(Constants.BOOK_DETAIL, documentName, author.getPerson().getPersonName(), genre, quantity);
	}

}
