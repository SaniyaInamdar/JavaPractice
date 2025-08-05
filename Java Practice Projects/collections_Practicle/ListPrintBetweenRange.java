package collections_Practicle;

import java.util.ArrayList;
import java.util.List;

public class ListPrintBetweenRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list1=new ArrayList<>();
		
		list1.add(54);
		list1.add(21);
		list1.add(187);
		list1.add(96);
		list1.add(21);
		System.out.println(list1);
		
		
		Object o=list1.subList(1, 4);
		System.out.println(o);
		
	}

}
