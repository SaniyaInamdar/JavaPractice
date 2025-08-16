package arethmetic;

import java.util.Scanner;

public class AirthmeticCal {
	int a,b,c;
	public AirthmeticCal() {
		accept();
		add();
		sub();
		mul();
		div();
		mod();
	}
	
	public void accept() {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter First number : ");
		a=sc.nextInt();
		System.out.println("Enter Second Name : ");
		b=sc.nextInt();
		
		sc.close();
		
	}
	
	public void add() {
		System.out.println(c=a+b);
		
	}
	
	public void sub() {
		System.out.println(c=a-b);
	}
	
	public void mul() {
		System.out.println(c=a*b);
	}
	
	public void div() {
		System.out.println(c=a/b);
	}
	
	public void mod() {
		System.out.println(c=a%b);
	}
}
