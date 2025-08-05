package collections_Practicle;

import java.util.ArrayList;
import java.util.List;

public class ListMaxElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	List<Integer> list1=new ArrayList<>();
		
		list1.add(21);
		list1.add(54);
		list1.add(54);
		list1.add(187);
		list1.add(96);
		list1.add(12);
		PrintMax(list1);
		
	}
	
	public static void PrintMax(List<Integer> list) {
		int max=1;
		for(Integer i:list) {
			if(max<i) {
				max=i;
			}
		}
		System.out.println(max);
	}

}
