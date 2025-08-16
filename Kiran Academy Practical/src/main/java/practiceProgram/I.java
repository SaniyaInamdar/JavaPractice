package practiceProgram;

import java.util.ArrayList;
import java.util.LinkedHashSet;

//11. write a program to remove duplicate elements from arraylist



public class I {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(58);
		list.add(14);
		list.add(03);
		list.add(28);
		list.add(17);
		list.add(22);
		list.add(28);
		list.add(17);
		list.add(22);

		

		LinkedHashSet<Integer> list2=new LinkedHashSet<Integer>(list);
		ArrayList<Integer> uniquelist=new ArrayList<Integer>(list2);
		System.out.println(uniquelist);
		
		
	}
}
