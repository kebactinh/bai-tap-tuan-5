package com.luvina.library.manager.models;

import com.luvina.library.manager.annotation.Entity;

@Entity(name = "Author")
public class Author {
	private String authorCode;

	private String authorName;

	private String nationality;

	public Author(String authorCode, String authorName, String nationality) {
		this.authorCode = authorCode;
		this.authorName = authorName;
		this.nationality = nationality;
	}

	/**
	 * @return the authorCode
	 */
	public String getAuthorCode() {
		return authorCode;
	}

	/**
	 * @return the authorName
	 */
	public String getAuthorName() {
		return authorName;
	}

	/**
	 * @return the nationality
	 */
	public String getNationality() {
		return nationality;
	}

}
