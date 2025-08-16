package array1;

import java.util.Scanner;

public class PrimeAccept {
	int arr[]=new int[4];
	
	public void accept(int a[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter only prime elements : ");
		int i=0;
		
		while(i<a.length) {
			int num=sc.nextInt();
			int count=0;
			for(int k=1;k<=num;k++) {
				if(num%k==0) {
					count++;
			}
		}
			if(count==2) {
					a[i]=num;
					i++;
			}
			else {
				System.out.println("Not prime ");
			}
			
		}
	}

	public void show(int s[]) {
		System.out.println("Prime Accepted Number : ");
		for(int j=0;j<s.length;j++) {
			System.out.println(s[j]);
		}
	}
	
	public static void main(String[] args) {
		PrimeAccept p=new PrimeAccept();
		p.accept(p.arr);
		p.show(p.arr);
	}
}