package practicle;

import java.util.Scanner;

public class P1 {
   public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter First Number");
	int n1=sc.nextInt();
	
	System.out.println("Enter Second Number");
	int n2=sc.nextInt();
	
	System.out.println("Enter Third Number");
	int n3=sc.nextInt();
	
	int total=n1+n2+n3;
	
	int product=n1*n2*n3;
	
	int sqn1=n1*n1;
	int sqn2=n2*n2;
	int sqn3=n3*n3;
	
	int cuben1=n1*n1*n1;
	int cuben2=n2*n2*n2;
	int cuben3=n3*n3*n3;
	
	int sum=n1+n2+n3;
	int avg=sum/3;
	
	System.out.println("Sum of three integers is :"+total);
	System.out.println("Product of three integers is :"+product);
	System.out.println("Square of first number is "+sqn1);
	System.out.println("Square of second number is "+sqn2);
	System.out.println("Square of third number is "+sqn3);
	System.out.println("Cube of first number is "+cuben1);
	System.out.println("Cube of second number is "+cuben2);
	System.out.println("Cube of third number is "+cuben3);
	System.out.println("Average of three numbers is "+avg);
	
	sc.close();
}
}
