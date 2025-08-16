package bingonumber;

import java.util.Scanner;

public class BingoChecker {
	int num,y,orignalnum=num;
	boolean haveseven=false;
public void accept() {
	
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter a number : ");
	num=sc.nextInt();
	
	while(num>0) {
		
	y=num%10;
	if(y==7) {
		haveseven=true;
		break;
	}
	num=num/10;
	}
	
	if(!haveseven && num%7==0) {
		System.out.println("Bingo");
	}
	else {
		System.out.println("Not a bingo ");
	}
	
	sc.close();
	
	}
}
