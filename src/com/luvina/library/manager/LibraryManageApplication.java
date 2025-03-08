package com.luvina.library.manager;

import com.luvina.library.manager.models.Author;
import com.luvina.library.manager.models.Book;
import com.luvina.library.manager.models.Document;
import com.luvina.library.manager.models.Person;
import com.luvina.library.manager.services.Library;

public class LibraryManageApplication {

	public static void main(String[] args) {
		Person person = new Person("1", "kien");
		Author author = new Author(person, "VN");
		Document doc1 = new Book("1", "test", 5, author, "test");

		Library<Document> library = new Library<>();
		library.addDocument(doc1);

		library.borrowDocument(doc1);

		System.out.println(doc1.getDocumentName());
		System.out.println(doc1.getQuantity());

		Document doc = new Book("1", "test2", 6, author, "test");

		Library<Document> library2 = new Library<>();
		library2.addDocument(doc);

		library2.borrowDocument(doc);

		System.out.println(doc.getDocumentName());
		System.out.println(doc.getQuantity());

		library2.returnDocument(doc);

		System.out.println(doc.getDocumentName());
		System.out.println(doc.getQuantity());

	}

}
