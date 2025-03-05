package com.luvina.library.manager.models;

public class Reader {
	private Person person;

	private String phoneNumber;

	public Reader(Person person, String phoneNumber) {
		this.person = person;
		this.phoneNumber = phoneNumber;
	}

	/**
	 * @return the person
	 */
	public Person getPerson() {
		return person;
	}

	/**
	 * @return the phoneNumber
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}

}
