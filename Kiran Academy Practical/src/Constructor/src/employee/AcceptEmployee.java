package employee;

import java.util.Scanner;

public class AcceptEmployee {
	int id;
	double salary;
	String Name;
	
	public AcceptEmployee() {
		accept();
		show();
	}
public void accept() {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter Employee Details");
	
	System.out.println("Enter ID of Employee : ");
	id=sc.nextInt();
	
	System.out.println("Enter Name of Employee : ");
	Name=sc.next();
	
	System.out.println("Enter Salary of Employee :");
	salary=sc.nextDouble();
	
	sc.close();
	}
public void show() {
	System.out.println("Details of employee is  : ");
	
	System.out.println("ID - "+ id);
	System.out.println("Name -"+Name);
	System.out.println("Salary -"+salary);
	
}
}
