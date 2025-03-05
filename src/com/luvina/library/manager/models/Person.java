package com.luvina.library.manager.models;

public class Person {
	private String personCode;

	private String personName;

	public Person(String personCode, String personName) {
		this.personCode = personCode;
		this.personName = personName;
	}

	/**
	 * @return the personCode
	 */
	public String getPersonCode() {
		return personCode;
	}

	/**
	 * @return the personName
	 */
	public String getPersonName() {
		return personName;
	}
}
