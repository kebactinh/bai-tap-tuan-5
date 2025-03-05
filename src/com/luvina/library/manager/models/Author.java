package com.luvina.library.manager.models;

public class Author {
	private Person person;

	private String nationality;

	public Author(Person person, String nationality) {
		this.person = person;
		this.nationality = nationality;
	}

	/**
	 * @return the person
	 */
	public Person getPerson() {
		return person;
	}

	/**
	 * @return the nationality
	 */
	public String getNationality() {
		return nationality;
	}

}
