package book;

import java.util.Scanner;

public class BookDetails {
	String name,author;
	int price;
	public BookDetails() {
		accept();
		show();
	}
	
	public BookDetails(String name,String author,int price) {
		System.out.println(name);
		System.out.println(author);
		System.out.println(price);
	}
	public void accept() {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Books Details : ");
		
		System.out.println("Enter Book Name : ");
		name=sc.next();
		
		System.out.println("Enter Author Name : ");
		author=sc.next();
		
		System.out.println("Enter Price Of Book : ");
		price=sc.nextInt();
		
		sc.close();
	}
	
	public void show() {
		System.out.println("Book Detail : ");
		
		System.out.println("Book Name - "+name);
		System.out.println("Author Name - "+author);
		System.out.println("Book Price - "+price);
	}
}
