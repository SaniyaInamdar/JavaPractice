package treeset;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class A  {
	public static void main(String[] args) {
		TreeSet set1=new TreeSet( );
		
//		set1.add("Saniya");
//		set1.add("Apple");
//		set1.add("Mango");
		set1.add(200);
		set1.add(200);
		set1.add(-200);
		set1.add(105);
		set1.add(20);
		set1.add(80);
	//	set1.add(null); //NullPointerException
	//	set1.add(false); //ClassCastException
	
		System.out.println(set1);
		print1(set1);
		System.out.println();
		System.out.println();
		print2(set1);
	}
	
	public static void print1(TreeSet set) {
		Iterator itr=set.iterator(); 
		while(itr.hasNext()) {
			Object o=itr.next();
			System.out.println(o);
		}
	}
	
	public static void print2(TreeSet set) {
		for(Object o:set) {
			System.out.println(o);
		}
	}

}
