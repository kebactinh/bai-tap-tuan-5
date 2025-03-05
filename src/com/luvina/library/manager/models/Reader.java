package com.luvina.library.manager.models;

import com.luvina.library.manager.annotation.Entity;

@Entity(name = "Reader")
public class Reader {
	private String readerCode;

	private String readerName;

	private String phoneNumber;

	public Reader(String readerCode, String readerName, String phoneNumber) {
		this.readerCode = readerCode;
		this.readerName = readerName;
		this.phoneNumber = phoneNumber;
	}

	/**
	 * @return the readerCode
	 */
	public String getReaderCode() {
		return readerCode;
	}

	/**
	 * @return the readerName
	 */
	public String getReaderName() {
		return readerName;
	}

	/**
	 * @return the phoneNumber
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}
}
