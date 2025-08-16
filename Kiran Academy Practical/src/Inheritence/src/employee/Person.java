package employee;

import java.util.Scanner;

public class Person {
	private String name,city;
	private int age;
	private long phone;
	
	
	public void setname(String n) {
		name=n;
	}
	public String getname() {
		return name;
	}
	
	public void setcity(String c) {
		city=c;
	}
	public String getcity() {
		return city;
	}
	
	public void setage(int a) {
		age=a;
	}
	public int getage() {
		return age;
	}
	
	public void setphone(long p) {
		phone=p;
	}
	public long getphone() {
		return phone;
	}
	
	
	public void accept1() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Person Details ");
		
		System.out.println("Enter name  : ");
		setname(sc.next());
		
		System.out.println("Enter city name  : ");
		setcity(sc.next());
		
		System.out.println("Enter age  : ");
		setage(sc.nextInt());
		
		System.out.println("Enter phone no  : ");
		setphone(sc.nextLong());
		
		
		}
	
	public void show1() {
		System.out.println("Person Details : ");
		System.out.println("name  : "+ getname());
		System.out.println("city name  : "+getcity());
		System.out.println("age  : "+getage());
		System.out.println("phone no  : "+getphone());
	}
}
