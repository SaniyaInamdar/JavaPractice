package collections_Practicle;

import java.util.ArrayList;
import java.util.List;

public class ListOccuranceOfElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list1=new ArrayList<>();
		
		list1.add(21);
		list1.add(54);
		list1.add(21);
		list1.add(187);
		list1.add(96);
		list1.add(21);
		Occurance(list1);
	}
	
	public static void Occurance(List<Integer> list) {
		int count=0;
		int num=21;
		for(Integer i:list) {
			if(i==num) {
				count++;
			}
		}
		System.out.println(count);
	}

}
