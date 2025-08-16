package practiceProgram;

import java.util.ArrayList;
import java.util.Iterator;

//4. write a program to print sum of arraylist elements

public class D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(58);
		list.add(14);
		list.add(03);
		list.add(28);
		list.add(17);
		list.add(22);
		
		System.out.println("Using iterator");
		sumPrint(list);
		
		//System.out.println("Using Collections");
	
		System.out.println("Using Stream API");
		int sum=list.stream().mapToInt(k->k).sum();
		System.out.println(sum);
		
	}
	
	public static void sumPrint(ArrayList<Integer> list) {
		Iterator<Integer> itr=list.iterator();
		int sum=0;
		while(itr.hasNext()) {
			int data=itr.next();
			sum+=data;
		}
			System.out.println(sum);
	}
}
