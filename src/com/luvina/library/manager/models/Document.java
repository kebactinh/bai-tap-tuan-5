package com.luvina.library.manager.models;

import com.luvina.library.manager.constant.Constants;
import com.luvina.library.manager.interfaces.IBorrowable;
import com.luvina.library.manager.interfaces.ISearchable;

public abstract class Document implements ISearchable, IBorrowable {
	protected String documentId;

	protected String documentName;

	protected int quantity;

	public Document(String documentId, String documentName, int quantity) {
		this.documentId = documentId;
		this.documentName = documentName;
		this.quantity = quantity;
	}

	/**
	 * @return the documentId
	 */
	public String getDocumentId() {
		return documentId;
	}

	/**
	 * @return the documentName
	 */
	public String getDocumentName() {
		return documentName;
	}

	/**
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}

	@Override
	public boolean matchByName(String documentName) {
		return documentName.toLowerCase().contains(documentName.toLowerCase());
	}

	@Override
	public void borrowDocument() {
		if (quantity > Constants.DEFAULT_QUANTITY) {
			quantity--;
			System.out.println(String.format(Constants.MESSAGE_BORROW_SUCCESS, documentName));
		} else {
			System.out.println(String.format(Constants.MESSAGE_BORROW_FAILURE, documentName));
		}

	}

	@Override
	public void returnDocument() {
		quantity++;
		System.out.println(String.format(Constants.MESSAGE_RETURN, documentName));

	}

	public abstract String getDetails();

}
