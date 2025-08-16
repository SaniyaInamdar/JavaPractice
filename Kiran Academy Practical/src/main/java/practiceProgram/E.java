package practiceProgram;

import java.util.ArrayList;
import java.util.Iterator;

//5. write a program to print product of arraylist elements

public class E {

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
		productPrint(list);
		
		System.out.println("Using Stream API");
		long product=list.stream().reduce(1,(a,b)->a*b);
		System.out.println(product);
	}
	
	public static void productPrint(ArrayList<Integer> list) {
		Iterator<Integer> itr=list.iterator();
		int product=1;
		while(itr.hasNext()) {
			int data=itr.next();
			product*=data;
		}
		System.out.println(product);
	}
}
