package employee;

import java.util.Scanner;

public class Employee extends Person{
	private String post,qualification;
	private double salary;
	
	public void setpost(String p) {
		post=p;
	}
	public String getpost() {
		return post;
	}

	
	public void setqualification(String q) {
		qualification=q;
	}
	public String getqualification() {
		return qualification;
	}
	
	
	public void setsalary(double s) {
		salary=s;
	}
	public double getsalary() {
		return salary;
	}
	
	public void accept2() {
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter employee details : ");
		
		System.out.println("Enter a post : ");
		setpost(sc.next());
		System.out.println("Enter a qualification : ");
		setqualification(sc.next());
		System.out.println("Enter a salary : ");
		setsalary(sc.nextDouble());
		
		
	}
	
	public void show2() {
			System.out.println("post : "+getpost());
		System.out.println("qualification : "+getqualification());
		System.out.println("salary : "+getsalary());
	}
}
