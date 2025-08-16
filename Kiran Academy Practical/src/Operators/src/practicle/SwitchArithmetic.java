package practicle;

import java.util.Scanner;

public class SwitchArithmetic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number to perform operation");
		System.out.println("1. Addition 2. Subtraction 3. Multiplication 4.division 5. Mod   ");
		int n=sc.nextInt();
		
		System.out.println("Enter 1st Number :");
		int n1=sc.nextInt();
		
		System.out.println("Enter 2nd Number :");
		int n2=sc.nextInt();
		
		switch(n) {
		case 1: int add=n1+n2; System.out.println(add); break;
		case 2: int sub=n1-n2; System.out.println(sub); break;
		case 3: int mul=n1*n2; System.out.println(mul); break;
		case 4: int div=n1/n2; System.out.println(div); break;
		case 5: int mod=n1%n2; System.out.println(mod); break;
		default: System.out.println("Invalid number"); break;
		}
		
		sc.close();
	}

}
