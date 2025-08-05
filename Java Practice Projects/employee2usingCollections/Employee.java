package employee2usingCollections;

import java.util.ArrayList;
import java.util.Scanner;



public class Employee extends Person{
	private int id;
	private String department, post;
	private double salary;
	static ArrayList<Employee> list=new ArrayList<>();
	
	public Employee() {
		list.add(this);
	}
	
	
	
	public Employee(int id, String department, String post, double salary) {
		this.id = id;
		this.department = department;
		this.post = post;
		this.salary = salary;
		list.add(this);
	}
	
	@Override
	public void accept() {
//		super.accept();
		Scanner sc=new Scanner(System.in);
		System.out.println("---------- Enter Employee Details ----------");
		System.out.println("Enter Id : ");
		setId(sc.nextInt());
		System.out.println("Enter Department : ");
		setDepartment(sc.next());
		System.out.println("Enter Post : ");
		setPost(sc.next());
		System.out.println("Enter Salary : ");
		setSalary(sc.nextDouble());
	}
	
	@Override
	public void show() {
//		super.show();
		System.out.println("---------- Employee Details ----------");
		System.out.println("Id is : "+getId());
		System.out.println("Departmnet is : "+getDepartment());
		System.out.println("Post is : "+getPost());
		System.out.println("Salary is : "+getSalary());
	}
	
	
	@Override
	public String toString() {
		
		return super.toString() + "Employee [id=" + getId() + ", department=" + getDepartment() + ", post=" + getPost() + ", salary=" + getSalary() + "]";
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getPost() {
		return post;
	}
	public void setPost(String post) {
		this.post = post;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}
