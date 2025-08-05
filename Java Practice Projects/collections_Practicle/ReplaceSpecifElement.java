package collections_Practicle;

import java.util.ArrayList;
import java.util.List;


public class ReplaceSpecifElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list1=new ArrayList<>();
	
		list1.add(54);
		list1.add(21);
		list1.add(187);
		list1.add(96);
		list1.add(21);
		
		if(list1.contains(20)) {
			list1.remove(20);
			list1.add(20);
		}
		System.out.println(list1);
	}

}
