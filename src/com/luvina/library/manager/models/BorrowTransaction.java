package com.luvina.library.manager.models;

import java.time.OffsetDateTime;

public class BorrowTransaction<T extends Document> {
	private Reader reader;

	private T item;

	private OffsetDateTime borrowDate;

	private OffsetDateTime returnDate;

	public BorrowTransaction(Reader reader, T item, OffsetDateTime borrowDate) {
		this.reader = reader;
		this.item = item;
		this.borrowDate = borrowDate;
	}

	/**
	 * @return the reader
	 */
	public Reader getReader() {
		return reader;
	}

	/**
	 * @return the item
	 */
	public T getItem() {
		return item;
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

	/**
	 * @param returnDate the returnDate to set
	 */
	public void setReturnDate(OffsetDateTime returnDate) {
		this.returnDate = returnDate;
	}

}
