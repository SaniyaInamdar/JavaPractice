package employeedetails;

import java.util.Scanner;

public class Acceptemployee {
	
	int id;
	String name;
	int age;
	
	public void accept() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter ID : ");
		id=sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter Name : ");
		name=sc.nextLine();
		
		System.out.println("Enter Age : ");
		age=sc.nextInt();
		sc.close();
	}
	
	public void show() {
		System.out.println("ID is: "+id);
		System.out.println("Name is : "+name);
		System.out.println("Age is : "+age);
		
		
	}
}
