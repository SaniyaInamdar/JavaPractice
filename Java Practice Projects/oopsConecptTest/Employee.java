package oopsConecptTest;

//Ek Employee class banao jo Person ko extend kare, aur:
//Extra properties: salary, department
//Constructor overloading ka use karo
//Method overriding ka use karke displayInfo() implement karo

public class Employee extends Person{
	
	private double salary;
	private String department;
	
	public Employee() {
		
	}
	
	public Employee(String name,int age,double salary,String department) {
		setsalary(salary);
		setage(age);
		setdepartment(department);
		setname(name);
	
	}
	
	@Override
	public void displayInfo() {
		// TODO Auto-generated method stub
		System.out.println("Name : "+getname());
		System.out.println("Age : "+getage());
		System.out.println("Salary : "+getsalary());
		System.out.println("Department : "+getdepartment());
	}

	public void setsalary(double salary) {
		this.salary=salary;
	}
		
	public double getsalary() {
		return salary;
	}
	
	public void setdepartment(String department) {
		this.department=department;
	}
	public String getdepartment() {
		return department;
	}
}
