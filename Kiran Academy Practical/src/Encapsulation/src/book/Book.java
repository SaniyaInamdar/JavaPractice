package book;

import java.util.Scanner;

public class Book {

	private String Book_name,Book_Author;
	private int Book_Quantity;
	private double Book_price,Book_total;
	
	
	public String getBook_name() {
		return Book_name;
	}

	public void setBook_name(String book_name) {
		Book_name = book_name;
	}

	public String getBook_Author() {
		return Book_Author;
	}

	public void setBook_Author(String book_Author) {
		Book_Author = book_Author;
	}

	public int getBook_Quantity() {
		return Book_Quantity;
	}

	public void setBook_Quantity(int book_Quantity) {
		Book_Quantity = book_Quantity;
	}

	public double getBook_price() {
		return Book_price;
	}

	public void setBook_price(double book_price) {
		Book_price = book_price;
	}

	public double getBook_total() {
		return Book_total;
	}

	public void setBook_total(double book_total) {
		Book_total = book_total;
	}


	public void accept() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a book name : ");
		Book_name=sc.next();
		
		System.out.println("Enter a Author name : ");
		Book_Author=sc.next();
		
		System.out.println("Enter a book Quantity: ");
		Book_Quantity=sc.nextInt();
		
		System.out.println("Enter a book Price : ");
		Book_price=sc.nextDouble();
		
	}
	
	public void calculate() {
		Book_total=Book_Quantity*Book_price;
	}
	
	public void show() {
		System.out.println("book name : "+Book_name);
		System.out.println(" Author name : "+Book_Author);
		System.out.println("book Quantity: "+Book_Quantity);
		System.out.println("book Price : "+Book_price);
		System.out.println("Total is : "+Book_total);
		
	}
	
	
}
