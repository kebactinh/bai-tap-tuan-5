package com.luvina.library.manager;

import java.util.List;

import com.luvina.library.manager.models.Author;
import com.luvina.library.manager.models.Book;
import com.luvina.library.manager.models.Reader;
import com.luvina.library.manager.services.Library;

public class LibraryManageApplication {

	public static void main(String[] args) {
		// Tạo các đối tượng tác giả
		Author author1 = new Author("A001", "Nguyễn Văn A", "Việt Nam");

		// Tạo đối tượng sách
		Book book1 = new Book("B001", "Lập Trình Java", author1, "Giáo trình", 5);

		// Tạo đối tượng độc giả
		Reader reader1 = new Reader("R001", "Trần Thị B", "0123456789");

		// Tạo thư viện và thêm sách
		Library<Book> library = new Library<>();
		library.addDocument(book1);

		// Hiển thị thông tin sách
		library.displayAll();

		// Tìm kiếm sách theo từ khóa
		List<Book> found = library.search("Java");
		System.out.println("Kết quả tìm kiếm:");
		for (Book b : found) {
			b.displayInfo();
		}

		// Mượn và trả sách
		book1.borrow(reader1);
		book1.returnItem();

	}

}
