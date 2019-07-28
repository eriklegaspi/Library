package it.biblioteca.main;
import it.biblioteca.main.datas.*;

public class Main {

	public static void main(String[] args) {
		Book a = new Book("a");
		Book b = new Book("b");
		Book c = new Book("c");
		
		Library library = new Library();
		
		//add books
		if(library.addBook(a) &&library.addBook(b) && library.addBook(c)) {
			System.out.println("Books added");
		}else {
			System.out.println("Books not added");
		}
		
		//read the book inside the library
		System.out.println("Book inside the library:");
		library.readBooks();
		
		//loan books
		if(library.loanBook(a) && library.loanBook(b)) {
			System.out.println("Books loaned");
		}else {
			System.out.println("Book not loaned");
		}
		
		//read the books loaned
		System.out.println("\nBook loaned:");
		library.readLoan();
		
		
		//check in the library
		System.out.println("\nBook inside the library:");
		library.readBooks();
		
		//return the books
		if(library.returnBook(a) && library.returnBook(b)) {
			System.out.println("Book returned");
		}else {
			System.out.println("Book not returned");
		}
		
		//check in the library
		System.out.println("\nBook inside the library:");
		library.readBooks();
	}
}
