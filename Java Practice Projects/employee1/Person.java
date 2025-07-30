package employee1;

import java.util.Scanner;

public class Person {
	private String name,city;
	private int age;
	
	public Person() {
		
	}
	public Person(String name,String city,int age) {
		this.name=name;
		this.city=city;
		this.age=age;
	}
	
	public void accept() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a name : ");
		setname(sc.next());
		System.out.println("Enter a city : ");
		setcity(sc.next());
		System.out.println("Enter an age : ");
		setage(sc.nextInt());
	}
	
	public void show() {
		System.out.println("Name is : "+getname());
		System.out.println("City is : "+getcity());
		System.out.println("Age is : "+ getage());
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
