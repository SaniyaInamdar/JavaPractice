package employee1;

import java.util.Scanner;

public class EmployeeTest extends Person {
	private String post,department;
	private int salary,id;
	
	public EmployeeTest() {
		
		
	}
	
	@Override
	public void accept() {
		super.accept();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an Id  : ");
		setId(sc.nextInt());
		System.out.println("Enter a post : ");
		setPost(sc.next());
		System.out.println("Enter a Department : ");
		setDepartment(sc.next());
		System.out.println("Enter a salary : ");
		setSalary(sc.nextInt());
	}
	
	@Override
	public void show() {
		super.show();
		System.out.println("Salary is : "+ getId());
		System.out.println("Post is : "+getPost());
		System.out.println("Department is : "+getDepartment());
		System.out.println("Salary is : "+ getSalary());
	}
	

	
	public EmployeeTest(String post, String department , int salary,int id) {
		this.post=post;
		this.department=department;
		this.salary=salary;
		this.id=id;
	}
	
	public String getPost() {
		return post;
	}

	public void setPost(String post) {
		this.post = post;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	

}
