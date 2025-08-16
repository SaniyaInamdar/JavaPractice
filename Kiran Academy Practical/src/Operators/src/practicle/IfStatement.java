package practicle;

import java.util.Scanner;

public class IfStatement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number :");
		int n=sc.nextInt();
		System.out.println("Enter a second number :");
		int n2=sc.nextInt();
		System.out.println("Enter a third number :");
		int n3=sc.nextInt();
		
	 if(n%4==0 & n%7==0) {
			 System.out.println("Yes it is divisible");
	 }
		 else {
			 System.out.println("No");
		 }
		
		
		if(n%2==0){
			System.out.println("It is even number");
		}
		else {
			System.out.println("No");
		}
		
	
	if(n>n2 & n>n3) {
			System.out.println("Number 1 is greater");
		}
		else if(n2>n3) {
			System.out.println("Number 2 is greater");
		}
		else {
		System.out.println("Number 3 is greater");
		}
		
		
		if(n<n2 & n<n3) {
		System.out.println("Number 1 is smallest");
	}
		else if(n2<n3) {
		System.out.println("Number 2 is smallest");
	}
	else {
		System.out.println("Number 3 is smallest");
	}
        sc.close();
	}
}
