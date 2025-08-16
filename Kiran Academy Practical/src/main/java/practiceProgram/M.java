package practiceProgram;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedList;

//17. write a program to print elements from linkedlist
//18. write a program to print elements from hashset
//19. write a program to print elements from hashmap
//20. write a program to print elements from hashtable or properties

public class M {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> list=new LinkedList<Integer>();
		list.add(4);
		list.add(5);
		list.add(85);
		list.add(11);
		list.add(1);
		list.add(0);
		list.add(-1);
		System.out.println(list);
		
		HashSet<Integer> list1=new HashSet<Integer>();
		list1.add(4);
		list1.add(5);
		list1.add(85);
		list1.add(11);
		list1.add(1);
		list1.add(0);
		list1.add(-1);
		System.out.println(list1);
		
		
		HashMap<Integer, String> list3=new HashMap<Integer, String>();
		//list3.put(1, null);
		list3.put(1, "A");
		list3.put(15, "B");
		list3.put(2, "C");
		list3.put(8, "D");
		list3.put(-1, "E");
		list3.put(87, "F");
		list3.put(4, "G");
		list3.put(11, "H");
		list3.put(0, "I");
		System.out.println(list3);
		
		
		Hashtable<Integer, String> list4=new Hashtable<Integer, String>();
//		list4.put(1, null);
		list4.put(1, "A");
		list4.put(15, "B");
		list4.put(2, "C");
		list4.put(8, "D");
		list4.put(-1, "E");
		list4.put(87, "F");
		list4.put(4, "G");
		list4.put(11, "H");
		list4.put(0, "I");
		System.out.println(list4);
		
	}

}
