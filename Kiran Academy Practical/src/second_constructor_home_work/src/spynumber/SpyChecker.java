package spynumber;

import java.util.Scanner;

public class SpyChecker {
	public SpyChecker() {
		spy();
	}
	
	public void spy() {
		int y,add=0,num=0,mul=1;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number : ");
		num=sc.nextInt();
		
		while(num>0) {
			y=num%10;
			add=add+y;
			mul=mul*y;
			num=num/10;
		}
		
		if(add==mul) {
			System.out.println("Spy number ");
		}
		else {
			System.out.println("Not a spy number");
		}
		sc.close();
	}
}
