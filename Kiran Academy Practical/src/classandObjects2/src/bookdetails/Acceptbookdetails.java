package bookdetails;

import java.util.Scanner;

public class Acceptbookdetails {
	String bookname,authorname;
	int price;
	
 public void accept() {
	 Scanner sc=new Scanner(System.in);
	 
	 System.out.println("Enter Book Name : ");
	 bookname=sc.nextLine();
	 
	 System.out.println("Enter Author Name : ");
	 authorname=sc.nextLine();
	 
	 System.out.println("Enter Price : ");
	 price=sc.nextInt();
	 sc.nextLine();
	 sc.close();
 }
 
 public void show() {
	 System.out.println("Bookname is : "+bookname);
	 System.out.println("Author name is : "+ authorname);
	 System.out.println("Price is : "+ price);
 }
}
