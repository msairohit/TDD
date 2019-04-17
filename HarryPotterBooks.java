package com.rohit.day3;

import java.util.List;

import org.hamcrest.Matcher;

public class HarryPotterBooks {

	public double getCost(List<Book> books) {
		return books.size() * 8;
	}

}
