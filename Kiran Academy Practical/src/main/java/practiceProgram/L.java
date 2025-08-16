package practiceProgram;

import java.util.Collections;
import java.util.TreeMap;

//15. write a program to print treemap in ascending order
//16. write a program to print treemap in descending order



public class L {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer, String> list=new TreeMap<Integer, String>();
		list.put(1, "A");
		list.put(15, "B");
		list.put(2, "C");
		list.put(8, "D");
		list.put(-1, "E");
		list.put(87, "F");
		list.put(4, "G");
		list.put(11, "H");
		list.put(0, "I");
		System.out.println(list);
		
		TreeMap<Integer, String> list1=new TreeMap<Integer, String>(Collections.reverseOrder());
		list1.putAll(list);
		System.out.println(list1);
	}

}
