package collections_Practicle;

import java.util.ArrayList;
import java.util.HashSet;

public class ArrayListintoHastList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list1=new ArrayList<>();
		
		list1.add(21);
		list1.add(54);
		list1.add(21);
		list1.add(187);
		list1.add(96);
		list1.add(21);
		
		System.out.println(list1);
		
		HashSet<Integer> list2=new HashSet<Integer>(list1);
		System.out.println(list2);
//		System.out.println(list1.hashCode());
	}

}
