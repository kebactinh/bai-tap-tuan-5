package com.luvina.library.manager.interfaces;

public interface ILibraryItem extends IBorrowable, ISearchable {
	String getItemCode();

	String getItemName();

	int getQuantity();
}
