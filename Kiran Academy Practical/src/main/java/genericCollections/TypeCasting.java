package genericCollections;

import java.util.ArrayList;
import java.util.Iterator;

public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list=new ArrayList();
		list.add(50);
		list.add(550);
		list.add(80);
		list.add(550);
		list.add(77);
		print(list);
	}
	
	public static void print(ArrayList list) {
		Iterator itr=list.iterator();
		while(itr.hasNext()) {
			Object o=itr.next();
			Integer i=(Integer)(o);
			System.out.println(i);
		}
	}
}
