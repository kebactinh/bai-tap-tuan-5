package com.luvina.library.manager.services;

import java.util.ArrayList;
import java.util.List;

import com.luvina.library.manager.models.Document;

public class Library<T extends Document> {
	private List<T> documents;

	public Library() {
		documents = new ArrayList<>();
	}

	public void addDocument(T doc) {
		documents.add(doc);
	}

	public List<T> search(String keyword) {
		List<T> result = new ArrayList<>();
		for (T doc : documents) {
			if (doc.matches(keyword)) {
				result.add(doc);
			}
		}
		return result;
	}

	public void displayAll() {
		for (T doc : documents) {
			doc.displayInfo();
		}
	}
}
