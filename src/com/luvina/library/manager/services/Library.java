package com.luvina.library.manager.services;

import java.util.ArrayList;
import java.util.List;

import com.luvina.library.manager.interfaces.ILibraryItem;

public class Library<T extends ILibraryItem> {
	private List<T> items = new ArrayList<>();

	public void add(T item) {
		items.add(item);
	}

	public void remove(T item) {
		items.remove(item);
	}

	public T search(String searchTerm) {
		for (T item : items) {
			if (item.matches(searchTerm)) {
				return item;
			}
		}
		return null;
	}

	public List<T> getItems() {
		return items;
	}
}
