package com.luvina.library.manager.services;

import com.luvina.library.manager.models.Reader;

public interface IBorrowable {
	void borrow(Reader reader);

	void returnItem();
}
