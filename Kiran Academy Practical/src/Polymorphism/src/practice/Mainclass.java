package practice;

import java.util.Scanner;

public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		
		Calculator c=new Calculator();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter 1 for addition , 2 for substraction, 3 for division, 4 for multiplication");
		int ch=sc.nextInt();
		
		System.out.println("Enter first number : ");
		a=sc.nextInt();
		
		System.out.println("Enter Second number : ");
		b=sc.nextInt();
		
		
		switch(ch) {
		case 1 :c.add(a,b);
		break;
		case 2 : c.sub(a,b);
		break;
		case 3 : c.div(a,b);
		break;
		case 4 : c.mul(a,b);
		break;
		default: System.out.println("Wrong input");
		}
		
		sc.close();
	}

}
