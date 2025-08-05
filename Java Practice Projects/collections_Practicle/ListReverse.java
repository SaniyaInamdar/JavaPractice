package collections_Practicle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list1=new ArrayList<>();
		
		list1.add(21);
		list1.add(54);
		list1.add(54);
		list1.add(187);
		list1.add(96);
		list1.add(12);
		
		Collections.reverse(list1);
		System.out.println(list1);
		
		reverse(list1);
	}
	
	public static void reverse(List<Integer> list) {
		for(int i=list.size()-1;i>=0;i--) {
			System.out.println(list.get(i));
		}
	}

}
