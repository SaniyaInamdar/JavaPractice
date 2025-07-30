package employee1;

import java.util.Scanner;

public class Employee extends Person {
	private String post,department;
	private int salary;
	int arr[]=new int[5];
	
	public Employee() {
		for(int i=0;i<arr.length;i++) {
			accept();
			show();
		}
	}
	
	@Override
	public void accept() {
		super.accept();
		Scanner sc=new Scanner(System.in);
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
		System.out.println("Post is : "+getPost());
		System.out.println("Department is : "+getDepartment());
		System.out.println("Salary is : "+ getSalary());
	}
	

	
	public Employee(String post, String department , int salary) {
		this.post=post;
		this.department=department;
		this.salary=salary;
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
	

}
