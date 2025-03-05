package com.luvina.library.manager.models;

import com.luvina.library.manager.interfaces.IBorrowable;
import com.luvina.library.manager.interfaces.ISearchable;

public class LibraryItem implements IBorrowable, ISearchable {
	private String itemCode;

	private String itemName;

	private int quantity;

	public LibraryItem(String itemCode, String itemName, int quantity) {
		this.itemCode = itemCode;
		this.itemName = itemName;
		this.quantity = quantity;
	}

	/**
	 * @return the itemCode
	 */
	public String getItemCode() {
		return itemCode;
	}

	/**
	 * @return the itemName
	 */
	public String getItemName() {
		return itemName;
	}

	/**
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}

	@Override
	public boolean borrow() {
		if (quantity > 0) {
			quantity--;
			return true;
		}
		return false;
	}

	@Override
	public void returnItem() {
		quantity++;
	}

	@Override
	public boolean matches(String searchTerm) {
		if (itemName == null)
			return false;
		return itemName.toLowerCase().contains(searchTerm.toLowerCase());
	}
}
