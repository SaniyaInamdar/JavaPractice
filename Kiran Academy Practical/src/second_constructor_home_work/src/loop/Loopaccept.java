package loop;

import java.util.Scanner;

public class Loopaccept {
	
	public Loopaccept() {
		accept();
		loopprint();
		series();
	}

	public void accept() {
		int num,num2;
		
		Scanner sc=new Scanner(System.in);

		System.out.println("How many numbers you want to enter : ");
		num=sc.nextInt();
		
		for(int i=1;i<=num;i++) {
			System.out.println("Enter a "+i+ " number : ");
			num2=sc.nextInt();
			if(num2==7) {
				System.out.println("Loop terminated ");
				break;
			}
		}
		
		sc.close();
		
	}
	
	public void loopprint() {
		for(int i=455;i>=234;i--) {
			System.out.println(i);
		}
	}
	
	public void series() {
		//1,3,6,10,15,21...
		int n=10,series;
		for(int i=1;i<=n;i++)
		{
			series=i*(i+1)/2;
			System.out.println(series);
		}
	}
}