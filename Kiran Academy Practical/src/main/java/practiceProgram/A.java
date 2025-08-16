package practiceProgram;

import java.util.ArrayList;
import java.util.Iterator;

//1. write a program to print elements from arraylist

public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(58);
		list.add(14);
		list.add(03);
		list.add(28);
		list.add(17);
		list.add(22);
		
		System.out.println("Normal List");
		System.out.println(list);
		
		System.out.println("Using Iterator");
		print(list);
		
		System.out.println("Using Stream");
		list.stream().forEach(k -> System.out.println(k));
	}

	public static void print(ArrayList<Integer> list) {
		Iterator<Integer> itr=list.iterator();
		while(itr.hasNext()) {
			int data=itr.next();
			System.out.println(data);
		}
	}
}
