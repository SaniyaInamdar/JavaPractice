package collection_Employee_Project_CRUD;

import java.util.ArrayList;
import java.util.Scanner;

public class Employee extends Person{
//id.post.salary.department
	private int id;
	private String post,department;
	private double salary;
	static ArrayList<Employee> list=new ArrayList<Employee>();
	static int  idcounter=1;
	public Employee() {
		
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Employee(int id, String post, String department, double salary) {
		super();
		this.id = id;
		this.post = post;
		this.department = department;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return super.toString()+"Employee [id=" + id + ", post=" + post + ", department=" + department + ", salary=" + salary + "]";
	}
	
	public void accept() {
		super.accept();
		Scanner sc=new Scanner(System.in);
		System.out.println("============ Enter Employee Details =============");
		setId(idcounter++);
		System.out.println("Id : "+getId());
		
		System.out.println("Enter Department : ");
		setDepartment(sc.next());
		System.out.println("Enter Post : ");
		setPost(sc.next());
		System.out.println("Enter Salary : ");
		setSalary(sc.nextLong());
		
		}
	
	public void show() {
		
		super.show();
		System.out.println("============ Employee Details =============");
		System.out.println("Id : "+getId());
		System.out.println("Enter Name : "+getDepartment());
		System.out.println("Enter City : "+getPost());
		System.out.println("Enter Phone Number : "+getSalary());
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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	

}
