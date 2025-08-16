package array2;

import java.util.Scanner;

public class MinandMax {
	int arr[]=new int[5];
	
	public void accept(int a[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an elemnts : ");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
	}
	
//	public void show(int s[]) {
//		for(int j=0;j<s.length;j++) {
//			System.out.println(s[j]);
//		}
//	}
	
	public void min(int m[]) {
		System.out.println("Minimum in an Array ");
		int min=m[0];
		for(int i=0;i<m.length;i++) {
			if(min>m[i]) {
				min=m[i];
			}
		}
		System.out.println(min);
	}
	
	
	public void max(int m[]) {
		System.out.println("Maximum in an Array ");
		int max=m[0];
		for(int i=0;i<m.length;i++) {
			if(max<m[i]) {
				max=m[i];
			}
		}
		System.out.println(max);
	}
	
	public static void main(String[] args) {
		MinandMax mam=new MinandMax();
		mam.accept(mam.arr);
		mam.min(mam.arr);
		mam.max(mam.arr);
		
	}
}
