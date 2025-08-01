package employee2usingCollections;

import java.util.Scanner;

public class Person {
	private String name,city;
	private int age;
	
	public Person() {
		super();
	}
	public Person(String name, String city,int age) {
		this.name=name;
		this.city=city;
		this.age=age;
	}
	
	public void accept() {
		Scanner sc=new Scanner(System.in);
		System.out.println("---------- Enter Person Details ----------");
		System.out.println("Enter Name : ");
		setname(sc.next());
		System.out.println("Enter City : ");
		setcity(sc.next());
		System.out.println("Enter age : ");
		setage(sc.nextInt());
	}
	
	public void show() {
		System.out.println("---------- Person Details ----------");
		System.out.println("Name is : "+getname());
		System.out.println("City is : "+getcity());
		System.out.println("Age is : "+getage());
	}
	
	@Override
	public String toString() {
		return "[ Name :"+getname()+" "+ "City : "+getcity()+" "+"Age :"+getage()+" "+"]";
	}
	
	public void setname(String name) {
		this.name=name;
	}
	public String getname() {
		return name;
	}
	
	public void setcity(String city) {
		this.city=city;
	}
	public String getcity() {
		return city;
	}
	
	public void setage(int age) {
		this.age=age;
	}
	public int getage() {
		return age;
	}
}

