package set;

import java.util.HashSet;
import java.util.Iterator;

public class C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet set1=new HashSet();
		
		set1.add("Apple");
		set1.add("A");
		set1.add("Ap");
		set1.add("App");
		set1.add("Appl");
		set1.add("Apple");
		set1.add("Mango");
		set1.add("Mang");
		set1.add("Man");
		set1.add("Ma");
		set1.add("M");
		System.out.println(set1);
		System.out.println();
		System.out.println();
		System.out.println();
		printset1(set1);
		System.out.println();
		System.out.println();
		System.out.println();
		printset2(set1);
		
	}
	
	public static void printset1(HashSet set) {
		Iterator itr=set.iterator();
		while(itr.hasNext()) {
			Object o=itr.next();
			System.out.println(o);
		}
	}
	
	
	public static void printset2(HashSet set) {
		for(Object o: set) {
			System.out.println(o);
		}
	}

}
