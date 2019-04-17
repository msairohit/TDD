package com.rohit.day3;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class HarryPotterBooksTest {

	HarryPotterBooks harryPotter = new HarryPotterBooks();
	
	@Test
	public void test() {
		HarryPotterBooks harryPotter = new HarryPotterBooks();
	}
	
	@Test
	public void testBooks() {
		Book book;
	}
	
	@Test
	public void testWhenSingleBookIsOrdered() {
		List<Book> books = new ArrayList<>();
		Book book = null;
		books.add(book.BOOK1);
		assertEquals(8.0, harryPotter.getCost(books));
	}

}
