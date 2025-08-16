package array1;

import java.util.Scanner;

public class Factorial {
	int arr[]=new int[5];
	
	public void accept(int a[] ){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter elements");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
	}
	
	
	public void show(int s[]) {
		int fact=1;
		for(int j=0;j<s.length;j++) {
			fact=fact*s[j];
			System.out.println(fact);
		}
	}
	
	
	public static void main(String[] args) {
		Factorial f=new Factorial();
		f.accept(f.arr);
		f.show(f.arr);
	}
	
	
}
