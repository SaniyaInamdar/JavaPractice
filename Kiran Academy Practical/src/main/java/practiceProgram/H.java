package practiceProgram;

import java.util.ArrayList;
import java.util.Collections;

//9. write a program to print 2nd max number from arraylist
//10. write a program to print 2nd min number from arraylist

public class H {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(58);
		list.add(14);
		list.add(03);
		list.add(28);
		list.add(17);
		list.add(22);
		
		System.out.println("Using Method Collections Second Max");
		secondMax(list);
		
		System.out.println("Using Method Collections Second Min");
		secondMin(list);
		
	
		System.out.println("Using Stream API Second Max");
		int secondMax=list.stream().sorted(Collections.reverseOrder()).skip(1).findFirst().get();
		System.out.println(secondMax);
		
		
		System.out.println("Using Stream API Second Min");
		int secondMin=list.stream().sorted().skip(1).findFirst().get();
		System.out.println(secondMin);
		
	}
	
	public static void secondMax(ArrayList<Integer> list) {

		Collections.sort(list,Collections.reverseOrder());
		int secondMax=list.get(1);
		System.out.println(secondMax);
		
	}
	
	public static void secondMin(ArrayList<Integer> list) {

		Collections.sort(list);
		int secondMin=list.get(1);
		System.out.println(secondMin);
		
	}
}
