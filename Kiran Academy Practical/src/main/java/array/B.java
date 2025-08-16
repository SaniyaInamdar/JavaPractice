package array;

import java.util.Scanner;

public class B {
	
	int arr[]=new int[10];
	
	public static void main(String[] args) {
	B b1=new B();
	b1.accept(b1.arr);
	b1.show(b1.arr);
	}
	
	public void show(int s[]) {
		for(int i=0;i<s.length;i++) {
			System.out.println(s[i]);	
		}
	}
	
	public void accept(int a[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter elements : ");
		
		for(int k=0;k<arr.length;k++) {
			a[k]=sc.nextInt();
		}
	}
}
