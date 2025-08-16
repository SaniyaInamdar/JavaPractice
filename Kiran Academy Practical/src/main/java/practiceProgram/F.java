package practiceProgram;

import java.util.ArrayList;
import java.util.Iterator;

//6. write a program to print average of arraylist elements

public class F {

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
		avgPrint(list);
		
		System.out.println("Using Stream API");
		double avg= list.stream().mapToInt(k->k).average().getAsDouble();
		System.out.println(avg);
	}
	
	public static void avgPrint(ArrayList<Integer> list) {
		Iterator<Integer> itr=list.iterator();
		int sum=0;
		double avg=0;
		int count=0;
		while(itr.hasNext()) {
			int data = itr.next();
			count++;
			sum+=data;
			avg=sum/count;
		}
		System.out.println(avg);
	}
}
