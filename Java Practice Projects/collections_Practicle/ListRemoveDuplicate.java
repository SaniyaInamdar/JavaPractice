package collections_Practicle;

import java.util.ArrayList;
import java.util.List;

public class ListRemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list1=new ArrayList<>();
		
		list1.add(21);
		list1.add(54);
		list1.add(21);
		list1.add(187);
		list1.add(96);
		list1.add(21);
		Remove(list1);
		System.out.println(list1);
		
	}
	
	public static void Remove(List list) {
		int i,j;
		for(i=0;i<list.size();i++) {
			for(j=i+1;j<list.size();j++)
			if(list.get(i).equals(list.get(j))) {
				list.remove(j);
				j--;
			}
		}
	}
}
