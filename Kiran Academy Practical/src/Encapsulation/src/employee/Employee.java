package employee;

import java.util.Scanner;

public class Employee {
	private int id;
	private String name,post,qualification;
	private double basic_salary;
	double net_salary,hra,tra,da,pf,pt,gross_salary;
	
	public Employee() {
		accept();
		calculate();
		show();
		
	}
	
	
	public void setid(int i) {
		id=i;
	}
	public int getid() {
		return id;
	}
	
	
	public void setname(String n) {
		name=n;
	}
	public String getname() {
		return name;
	}
	
	
	public void setpost(String p) {
		post=p;
	}
	public String getpost() {
		return post;
	}
	
	
	public void setqualification(String n) {
		qualification=n;
	}
	public String getqualification() {
		return qualification;
	}
	
	
	public double getBasic_salary() {
		return basic_salary;
	}
	public void setBasic_salary(double Basic_salary) {
		basic_salary=Basic_salary;
	}
	
	
	
	
	
	public void accept() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter id : ");
		setid(sc.nextInt());
		
		System.out.println("Enter Name : ");
		setname(sc.next());
		
		System.out.println("Enter Qualification : ");
		setqualification(sc.next());
		sc.nextLine();
		System.out.println("Enter Post : ");
		setpost(sc.next());
		sc.nextLine();
		System.out.println("Enter Basic Salary : ");
		setBasic_salary(sc.nextDouble());
		
	}
	
	public void calculate() {
		da=(basic_salary*15)/100;
		hra=(basic_salary*10)/100;
		tra=(basic_salary*10)/100;
		pt=(basic_salary*12)/100;
		pf=(basic_salary*10)/100;
		
		gross_salary=basic_salary+da+hra+tra;
		
		net_salary=gross_salary-(pf+pt);
		
	}
	
	
	public void show() {
		System.out.println("ID"+getid());
		System.out.println("ame"+getname());
		System.out.println("post"+getpost());
		System.out.println("qualification"+getqualification());
		System.out.println("basic_salary"+getBasic_salary());
		System.out.println("net_salary"+net_salary);
		System.out.println("gross_salary"+gross_salary);
		System.out.println("da"+da);
		System.out.println("hra"+hra);
		System.out.println("tra"+tra);
		System.out.println("pt"+pt);
		System.out.println("pf"+pf);
		
	}
}
