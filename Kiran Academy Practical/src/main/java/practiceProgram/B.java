package practiceProgram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

//2. write a program to print max element from arraylist 

public class B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(58);
		list.add(14);
		list.add(03);
		list.add(28);
		list.add(17);
		list.add(22);
		
		System.out.println("Using Iterator");
		maxPrint(list);
		
		System.out.println("Using Collection");
		int max=Collections.max(list);
		System.out.println(max);
		
		System.out.println("Using Stream API");
		int max1= list.stream().mapToInt(k -> k).max().getAsInt();
		System.out.println(max1);
	}

	public static void maxPrint(ArrayList<Integer> list) {
		Iterator<Integer> itr = list.iterator();
		int max=itr.next();
		while(itr.hasNext()) {
			int data=itr.next(); 
			if(data>max) {
				max=data;
			}
		}
		System.out.println(max);
	}
}
