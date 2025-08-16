package employee;

import java.util.Scanner;

public class Employee extends Person{
	private int id;
	private double salary;
	private String department,post;
	String ex="saniya";
	
	public Employee() {
		
	}
	
	public Employee(int id,String department,String post,double salary) {
		this.setage(id);
		this.setcity(post);
		this.setdepartment(department);
		this.setsalary(salary);
	}
	
	
	public void setid(int id) {
		this.id=id;
	}
	public int getid() {
		return this.id;
	}
	
	public void setdepartment(String department) {
		this.department=department;
	}
	public String getdepartment() {
		return this.department;
	}
	
	public void setpost(String post) {
		this.post=post;
	}
	public String getpost() {
		return this.post;
	}
	
	public void setsalary(double salary) {
		this.salary=salary;
	}
	public double getsalary() {
		return this.salary;
	}
	
	@Override
	public void accept() {
		Scanner sc=new Scanner(System.in);
		super.accept();
		
		System.out.println("Enter Employee Id : ");
		this.setid(sc.nextInt());
		System.out.println("Enter Employee Department :");
		this.setdepartment(sc.next());
		System.out.println("Enter Employee post :");
		this.setpost(sc.next());
		System.out.println("Enter Employee salary :");
		this.setsalary(sc.nextDouble());
	}
	

	@Override
	public void show() {
		super.show();
		System.out.println("Employee Id : "+this.getid());
		System.out.println("Employee Department :"+this.getdepartment());
		System.out.println("Employee post :"+this.getpost());
		System.out.println("Employee salary :"+this.getsalary());
	}
	



	@Override
	public String toString() {
		super.toString();
		return "[Employee info : "+"Id :"+this.getid()+" "+"Departmrnt : "+this.getdepartment()+" "+"Post : "+getpost()+" "+"Salary :"+getsalary()+"]";
	}
}
