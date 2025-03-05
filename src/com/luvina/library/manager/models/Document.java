package com.luvina.library.manager.models;

import com.luvina.library.manager.annotation.Entity;
import com.luvina.library.manager.services.ISearchable;

@Entity(name = "Document")
public abstract class Document implements ISearchable {
	protected String documentName;

	public Document(String documentName) {
		this.documentName = documentName;
	}

	@Override
	public boolean matches(String keyword) {
		return documentName != null && documentName.toLowerCase().contains(keyword.toLowerCase());
	}

	public abstract void displayInfo();
}
