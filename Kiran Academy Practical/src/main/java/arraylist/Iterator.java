package arraylist;

import java.awt.List;
import java.util.ArrayList;
import java.util.ListIterator;

public class Iterator {
	public static void main(String[] args) {
		ArrayList ar=new ArrayList();
		List list=new List();
		list.add("a");
		System.out.println(list);
		ar.add("A");
		ar.add("B");
		ar.add("C");
		ar.add("D");
		ar.add("E");
		ar.add("F");
		ar.add("G");
		ar.add("H");
		ar.add("I");
		ar.add("J");
		ar.add("K");
		ar.add("L");
		ar.add("M");
		
		System.out.println(ar);
		Iterator.printlist1(ar);
		System.out.println();
		Iterator.printlist2(ar);
		System.out.println();
		Iterator.printlist3(ar);
	}

	public static void printlist1(ArrayList list) {
		ListIterator itr=list.listIterator(); 
			while(itr.hasNext()) {
				Object o=itr.next();
				System.out.println(o);
			}
			System.out.println(" ");
			while(itr.hasPrevious()) {
				Object o=itr.previous();
				System.out.println(o);
			}
	}
	
	public static void printlist2(ArrayList list) {
		for(Object o:list) {
			System.out.println(o);
		}
	}
	
	public static void printlist3(ArrayList list) {
		for(int k=0;k<list.size();k++) {
			Object o=list.get(k);
			System.out.println(o);
		}
	}
}
