package array;

import java.util.Scanner;

public class A {
	
	int arr[]=new int[5];
	
	public static void main(String[] args) {
	
	A a1=new A();
	
	a1.accept();
	a1.show();
	}
	
	
	public void show() {
		for(int k=0;k<arr.length;k++) {
			System.out.println(arr[k]);
		}
	}
	public void accept() {
		Scanner sc=new Scanner(System.in);
		for(int k=0;k<arr.length;k++) {
			arr[k]=sc.nextInt();
			}
		}
}
