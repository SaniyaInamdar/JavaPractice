package collections_Practicle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortElemnts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list1=new ArrayList<>();
		
		list1.add(21);
		list1.add(54);
		list1.add(54);
		list1.add(187);
		list1.add(96);
		list1.add(12);
		
		System.out.println("List in Ascending order");
		Collections.sort(list1);
		System.out.println(list1);
		System.out.println("List in Descending order");
		Collections.sort(list1,Collections.reverseOrder());
		System.out.println(list1);
		
		
	}
	

}
