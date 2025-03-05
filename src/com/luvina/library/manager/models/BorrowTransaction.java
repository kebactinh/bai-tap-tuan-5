package com.luvina.library.manager.models;

import java.time.OffsetDateTime;

import com.luvina.library.manager.interfaces.ILibraryItem;

public class BorrowTransaction<T extends ILibraryItem> {
	private Reader reader;

	private T item;

	private OffsetDateTime borrowDate;

	private OffsetDateTime returnDate;

	public BorrowTransaction(Reader reader, T item, OffsetDateTime borrowDate) {
		this.reader = reader;
		this.item = item;
		this.borrowDate = borrowDate;
		this.returnDate = null;
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

}
