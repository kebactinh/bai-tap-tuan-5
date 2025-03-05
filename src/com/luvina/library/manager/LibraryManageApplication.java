package com.luvina.library.manager;

import java.time.OffsetDateTime;

import com.luvina.library.manager.annotation.Entity;
import com.luvina.library.manager.interfaces.ILibraryItem;
import com.luvina.library.manager.models.Author;
import com.luvina.library.manager.models.Book;
import com.luvina.library.manager.models.BorrowTransaction;
import com.luvina.library.manager.models.LibraryItem;
import com.luvina.library.manager.models.Person;
import com.luvina.library.manager.models.Reader;
import com.luvina.library.manager.services.Library;

public class LibraryManageApplication {

	public static void main(String[] args) {
		// Tạo các đối tượng tác giả
		Person person1 = new Person("A01", "John Doe");
		Author author1 = new Author(person1, "USA");
		Person person2 = new Person("A02", "Jane Smith");
		Author author2 = new Author(person2, "UK");

		// Khai báo các đối tượng sách theo interface ILibraryItem
		LibraryItem libraryItem1 = new LibraryItem("B01", "Java Programming", 5);
		LibraryItem libraryItem2 = new LibraryItem("B02", "Database Systems", 3);
		ILibraryItem book1 = new Book(libraryItem1, author1, "Technology");
		ILibraryItem book2 = new Book(libraryItem2, author2, "Science");

		// Sử dụng Generic Repository để quản lý các mục thư viện
		Library<ILibraryItem> repository = new Library<>();
		repository.add(book1);
		repository.add(book2);

		// Tạo đối tượng độc giả
		Person person3 = new Person("R01", "Alice Johnson");
		Reader reader1 = new Reader(person3, "1234567890");

		// Kiểm tra hành vi mượn và trả sách thông qua IBorrowable
		System.out.println("Initial state of book1: " + book1);
		if (book1.borrow()) {
			System.out.println("Book borrowed successfully!");
		} else {
			System.out.println("Book is not available!");
		}
		System.out.println("State after borrowing book1: " + book1);
		book1.returnItem();
		System.out.println("State after returning book1: " + book1);

		// Tìm kiếm sách theo tiêu đề thông qua Generic Repository
		ILibraryItem foundItem = repository.search("Database");
		if (foundItem != null) {
			System.out.println("Found book: " + foundItem);
		} else {
			System.out.println("Book not found.");
		}

		// Tạo giao dịch mượn trả sử dụng kiểu generic cho BorrowTransaction
		BorrowTransaction<ILibraryItem> transaction = new BorrowTransaction<>(reader1, book1, OffsetDateTime.now());
		System.out.println("Borrow transaction: " + transaction);

		// Sử dụng Reflection để đọc metadata từ annotation @LibraryEntity của lớp Book.
		Entity bookAnnotation = Book.class.getAnnotation(Entity.class);
		if (bookAnnotation != null) {
			System.out.println("Book Annotation value: " + bookAnnotation.name());
		}
	}

}
