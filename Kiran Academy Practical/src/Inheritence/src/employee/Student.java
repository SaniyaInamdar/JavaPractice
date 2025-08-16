package employee;

import java.util.Scanner;

public class Student extends Person{
	private int id;
	private String course,coolegename;
	
	public void setid(int i) {
		id=i;
	}
	public int getid() {
		return id;
	}
	
	
	public void setcourse(String Course) {
		course=Course;
	}
	public String getcourse() {
		return course;
	}
	
	
	public void setcollegename(String college) {
		coolegename=college;
	}
	public String getcollegename() {
		return coolegename;
	}
	
	public void accept() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Student Details");
		System.out.println(" ");
		System.out.println("Enter student id :");
		setid(sc.nextInt());
		System.out.println("Enter course name : ");
		setcourse(sc.next());
		System.out.println("Enter college name  :");
		setcollegename(sc.next());
	}
	
	public void show() {
		System.out.println("Id is : "+getid());
		System.out.println("Student name is :"+getcourse());
		System.out.println("colege name is: "+getcollegename());
	}
}
