package collections;

import java.util.ArrayList;

public class B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list1=new ArrayList();
		
		list1.add(100);
		list1.add(false);
		list1.add(null);
		list1.add("red");
		list1.add("green");
		System.out.println(list1);
		
		list1.add(2,"yellow");
		System.out.println(list1);
		
		
		ArrayList list2=new ArrayList();
		list2.add("Rose");
		list2.add("Lily");
		list2.add("Mogra");
		System.out.println(list2);
		
		list1.addAll(list2);
		System.out.println(list1);
		list1.addAll(1,list2);
		System.out.println(list1);
	}

}
