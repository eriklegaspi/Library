package it.biblioteca.main.datas;

import java.util.ArrayList;

import it.biblioteca.utils.Utils;

public class Library {

	public Library() {
	}
	
	
	private ArrayList<Book> books = new ArrayList<Book>();
	private ArrayList<Book> loan = new ArrayList<Book>();
	
	
	/**
	 * add a book in the list
	 * @param title
	 * @return true = book added / false = book not added
	 */
	public boolean addBook(Book book) {
		boolean result;
		if(!Utils.existBook(books, book.getTitlte())) {
			books.add(book);
			result = true;
		}else {
			result = false;
		}
		return result;
	}
	
	/**
	 * loan a book
	 * @param book
	 * @return true = book loaned / false book not loaned
	 */
	public boolean loanBook(Book book) {
		boolean result = false;
			if(Utils.existBook(books, book.getTitlte()) &&
					!Utils.existBook(loan, book.getTitlte())) {
				books.remove(book);
				loan.add(book);
				result = true;
			}
		return result; 
	}
	
	/**
	 * return the book loaned
	 * @param book
	 * @return
	 */
	public boolean returnBook(Book book) {
		boolean result = false;
			if(Utils.existBook(loan, book.getTitlte())) {
				loan.remove(book);
				books.add(book);
				result = true;			
			}		
		return result;
	}
	
	/**
	 * read list of book loaned
	 */
	public void readLoan() {
		for (Book book : loan) {
			System.out.println(book.getTitlte());
		}
	}
	/**
	 * read the books inside the library
	 */
	public void readBooks() {
		for (Book book : books) {
			System.out.println(book.getTitlte());
		}
	}
}
