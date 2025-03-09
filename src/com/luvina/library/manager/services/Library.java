package com.luvina.library.manager.services;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

import com.luvina.library.manager.models.BorrowTransaction;
import com.luvina.library.manager.models.Document;
import com.luvina.library.manager.models.Reader;

public class Library<T extends Document> {
	private List<T> documents = new ArrayList<>();

	private List<BorrowTransaction<T>> borrowTransactions = new ArrayList<>();

	public void addDocument(T document) {
		documents.add(document);
	}

	public void borrowDocument(Reader reader, T document, OffsetDateTime borrowDate) {
		document.borrowDocument();
		BorrowTransaction<T> borrowTransaction = new BorrowTransaction<T>(reader, document, borrowDate);
		borrowTransactions.add(borrowTransaction);
	}

	public void returnDocument(BorrowTransaction<T> borrowTransaction, OffsetDateTime returnDate) {
		borrowTransaction.getItem().returnDocument();
		borrowTransaction.setReturnDate(returnDate);
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

	public List<BorrowTransaction<T>> getBorrowTransactions() {
		return borrowTransactions;
	}
}
