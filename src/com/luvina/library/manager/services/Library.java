package com.luvina.library.manager.services;

import java.util.ArrayList;
import java.util.List;

import com.luvina.library.manager.models.Document;

public class Library<T extends Document> {
	private List<T> documents = new ArrayList<>();

	public void addDocument(T document) {
		documents.add(document);
	}

	public void borrowDocument(T document) {
		document.borrowDocument();
	}

	public void returnDocument(T document) {
		document.returnDocument();
	}

	public List<T> searchDocumentByName(String documentName) {
		List<T> results = new ArrayList<>();
		for (T item : documents) {
			if (item.matchByName(documentName)) {
				results.add(item);
			}
		}
		return results;
	}
}
