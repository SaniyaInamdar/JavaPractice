package buzznumber;

import java.util.Scanner;

public class BuzzChecker {
	int num,y,orignalnum=num;
public void buzz() {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter a number : ");
	num=sc.nextInt();
	
	y=num%10;
	
	if(y==7 && orignalnum%7==0) {
		System.out.println("Buzz");
	}
	else {
		System.out.println("Not Buzz number");
	}
	sc.close();
}
}
