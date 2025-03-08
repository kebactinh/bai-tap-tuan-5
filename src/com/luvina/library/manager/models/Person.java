package com.luvina.library.manager.models;

public class Person {
	private String personId;

	private String personName;

	public Person(String personId, String personName) {
		this.personId = personId;
		this.personName = personName;
	}

	/**
	 * @return the personId
	 */
	public String getPersonId() {
		return personId;
	}

	/**
	 * @return the personName
	 */
	public String getPersonName() {
		return personName;
	}
}
