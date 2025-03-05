package com.luvina.library.manager.models;

import com.luvina.library.manager.annotation.Entity;
import com.luvina.library.manager.interfaces.ILibraryItem;

@Entity(name = "Book")
public class Book implements ILibraryItem {
	private LibraryItem libraryProps;

	private Author author;

	private String genre;

	public Book(LibraryItem libraryProps, Author author, String genre) {
		this.libraryProps = libraryProps;
		this.author = author;
		this.genre = genre;
	}

	/**
	 * @return the libraryProps
	 */
	public LibraryItem getLibraryProps() {
		return libraryProps;
	}

	/**
	 * @return the author
	 */
	public Author getAuthor() {
		return author;
	}

	/**
	 * @return the genre
	 */
	public String getGenre() {
		return genre;
	}

	@Override
	public String getItemCode() {
		return libraryProps.getItemCode();
	}

	@Override
	public String getItemName() {
		return libraryProps.getItemName();
	}

	@Override
	public int getQuantity() {
		return libraryProps.getQuantity();
	}

	@Override
	public boolean borrow() {
		return libraryProps.borrow();
	}

	@Override
	public void returnItem() {
		libraryProps.returnItem();
	}

	@Override
	public boolean matches(String searchTerm) {
		return libraryProps.matches(searchTerm);
	}

}
