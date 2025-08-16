package practiceProgram;

import java.util.Collections;
import java.util.TreeSet;

//13. write a program to print treeset in descending order
//14. write a program to print treeset in ascending order


public class K {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<Integer> list=new TreeSet<Integer>();
		list.add(58);
		list.add(14);
		list.add(03);
		list.add(28);
		list.add(17);
		list.add(22);
		System.out.println("Already in Ascending");
		System.out.println(list);
		
		
		TreeSet<Integer> list1=new TreeSet<Integer>(Collections.reverseOrder());
		list1.addAll(list);
		System.out.println("Already in Descending");
		System.out.println(list1);
		
	}

}
