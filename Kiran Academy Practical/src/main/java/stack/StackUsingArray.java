package stack;

import java.util.Scanner;

public class StackUsingArray {
	static int[] a=new int[5];
	static Scanner sc=new Scanner(System.in);
	
	public static void push() {
		System.out.println("Enter Elements : ");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
	}
	
	public static void pop() {
		for(int i=a.length-1;i>=0;i--) {
			System.out.println(a[i]);
		}
	}
	
	public static void display() {
		System.out.println("Elements are : ");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		push();
		pop();
		display();
	}

}
