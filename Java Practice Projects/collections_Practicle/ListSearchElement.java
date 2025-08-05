package collections_Practicle;

import java.util.ArrayList;
import java.util.List;

public class ListSearchElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list1=new ArrayList<>();
		
		list1.add(21);
		list1.add(54);
		list1.add(54);
		list1.add(187);
		list1.add(96);
		list1.add(12);
		search(list1);
	}
	
	public static void search(List<Integer> list) {
		int num=1;
		boolean search=true;
		for(int i=0;i<list.size();i++) {
			if(list.get(i) == num) {
				search=true;
			}
			else {
				search=false;
			}
		}
		
		if(search==true) {
			System.out.println("Available");
		}
		else {
			System.out.println("Not Available");
		}
	}

}
