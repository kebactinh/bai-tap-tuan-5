package com.luvina.library.manager.models;

import java.time.OffsetDateTime;

import com.luvina.library.manager.annotation.Entity;

@Entity(name = "Transaction")
public class Transaction {
	private String transactionCode;

	private Book book;

	private Reader reader;

	private OffsetDateTime borrowDate;

	private OffsetDateTime returnDate;

	public Transaction(String transactionCode, Book book, Reader reader, OffsetDateTime borrowDate,
			OffsetDateTime returnDate) {
		this.transactionCode = transactionCode;
		this.book = book;
		this.reader = reader;
		this.borrowDate = borrowDate;
		this.returnDate = returnDate;
	}

	/**
	 * @return the transactionCode
	 */
	public String getTransactionCode() {
		return transactionCode;
	}

	/**
	 * @return the book
	 */
	public Book getBook() {
		return book;
	}

	/**
	 * @return the reader
	 */
	public Reader getReader() {
		return reader;
	}

	/**
	 * @return the borrowDate
	 */
	public OffsetDateTime getBorrowDate() {
		return borrowDate;
	}

	/**
	 * @return the returnDate
	 */
	public OffsetDateTime getReturnDate() {
		return returnDate;
	}
}
