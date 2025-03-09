package com.luvina.library.manager;

import java.time.OffsetDateTime;
import java.util.List;

import com.luvina.library.manager.models.Author;
import com.luvina.library.manager.models.Book;
import com.luvina.library.manager.models.Document;
import com.luvina.library.manager.models.Person;
import com.luvina.library.manager.models.Reader;
import com.luvina.library.manager.services.Library;

public class LibraryManageApplication {

	public static void main(String[] args) {
		Person person = new Person("1", "kien");
		Author author = new Author(person, "VN");
		Document doc1 = new Book("1", "test", 5, author, "test");

		Reader re = new Reader(person, "");

		Library<Document> library = new Library<>();
		library.addDocument(doc1);

		library.borrowDocument(re, doc1, OffsetDateTime.now());

		List<Document> ketQuaTimKiem = library.searchDocumentByName("test");
		for (Document sach : ketQuaTimKiem) {
			System.out.println(sach.getDetails());
		}
		
		var a = library.getBorrowTransactions();
		library.returnDocument(a.get(0), OffsetDateTime.now());
		var b = library.getBorrowTransactions();

	}

}
