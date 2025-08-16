package specialnumber;

import java.util.Scanner;

public class SpecialChecker {
	public void special() {
		int num,y,fact,sum=0;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		num=sc.nextInt();
		
		int orignalnum=num;
	
		while(num>0) {
			y=num%10;
			fact=1;
			for(int i=1;i<=y;i++) {
				fact=fact*i;
			}
			num=num/10;
			sum=sum+fact;
		}
		
		if(sum==orignalnum) {
			System.out.println("Its a special number");
		}
		else {
			System.out.println("It's not a special number");
		}
		
		sc.close();
		
	}
}
