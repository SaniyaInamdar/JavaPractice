package collections_Practicle;


import java.util.ArrayList;
import java.util.List;

public class ListSumOfElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list1=new ArrayList<>();
		
		list1.add(21);
		list1.add(54);
		list1.add(54);
		list1.add(87);
		list1.add(96);
		list1.add(12);
		printsum(list1);
		
	}
	
	public static void printsum(List<Integer> list) {
		int sum=0;
		for(Integer i:list) {
			sum=i+sum;
		}
		System.out.println(sum);
	}

}
