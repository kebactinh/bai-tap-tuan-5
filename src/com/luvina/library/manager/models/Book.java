package com.luvina.library.manager.models;

import com.luvina.library.manager.annotation.Entity;
import com.luvina.library.manager.services.IBorrowable;

@Entity(name = "Book")
public class Book extends Document implements IBorrowable {
	private String bookCode;

	private String bookName;

	private Author author;

	private String category;

	private Integer quantity;

	public Book(String documentId, String title, String bookCode, String bookName, Author author, String category,
			Integer quantity) {
		super(documentId, title);
		this.bookCode = bookCode;
		this.bookName = bookName;
		this.author = author;
		this.category = category;
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
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * @return the quantity
	 */
	public Integer getQuantity() {
		return quantity;
	}

	@Override
	public void borrow(Reader reader) {
		// TODO Auto-generated method stub

	}

	@Override
	public void returnItem() {
		// TODO Auto-generated method stub

	}

	@Override
	public void displayInfo() {
		// TODO Auto-generated method stub

	}
}
