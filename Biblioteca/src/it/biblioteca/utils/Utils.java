package it.biblioteca.utils;
import java.util.ArrayList;

import it.biblioteca.main.datas.*;
public class Utils {

	/**
	 * check if this book exist inside list
	 * @param books
	 * @param title
	 * @return
	 */
	public static boolean existBook(ArrayList<Book> books, String title) {
		boolean result = false;
		for (Book book : books) {
			if(book.getTitlte().equals(title)) {
				result = true;
			}
		}
		return result;
	}
}
