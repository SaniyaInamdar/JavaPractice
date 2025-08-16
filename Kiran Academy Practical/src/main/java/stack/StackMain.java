package stack;

import java.util.Scanner;
import java.util.Stack;

public class StackMain{
	static Stack<Integer> s=new Stack<>();
	static Scanner sc=new Scanner(System.in);
	
	public static void push() {
		for(int i=0;i<=10;i++) {
		System.out.println("Enter Elements : ");
		int element=sc.nextInt();
		s.push(element);
		}
	}
	
	public static void pop() {
		
		s.pop();
	}
	
	public static void display() {
		for(int i:s) {
		System.out.println(i);
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		push();
		display();
		pop();
		display();
		
	}

}