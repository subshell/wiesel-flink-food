package com.subshell.weasel.wieselflinkfood.model;

/**
 * This class represents a restaurant with a name and tables.
 */
public class Restaurant {

	private final String name;
	//TODO: add tables

	public Restaurant(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public boolean hasAvailableTable(int seats) {
		//TODO
		return false;
	}

	//TODO: add further methods as needed

}
