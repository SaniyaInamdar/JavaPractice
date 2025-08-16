package genericCollections;

import java.util.ArrayList;
import java.util.Iterator;

public class A {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(50);
		list.add(550);
		list.add(80);
		list.add(550);
		list.add(77);
		print(list);
	}

		public static void print(ArrayList<Integer> list) {
			Iterator<Integer> itr=list.iterator();
			while(itr.hasNext()) {
				int data=itr.next();
				System.out.println(data);
			}
		}
}
