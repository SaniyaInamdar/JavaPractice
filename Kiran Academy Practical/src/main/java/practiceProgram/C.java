package practiceProgram;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


//3. write a program to print min element from arraylist 


public class C {

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
		minPrint(list);
		
		System.out.println("Using Collections");
		int min= Collections.min(list);
		System.out.println(min);
		
		System.out.println("Using Stream API");
		int min1= list.stream().mapToInt(t->t).min().getAsInt();
		System.out.println(min1);
	}
	
	public static void minPrint(ArrayList<Integer> list) {
		Iterator<Integer> itr=list.iterator();
		int min = itr.next();
		while(itr.hasNext()) {
			int data=itr.next();
			if(data<min) {
				min=data;
			}
		}
		System.out.println(min);
	}

}
