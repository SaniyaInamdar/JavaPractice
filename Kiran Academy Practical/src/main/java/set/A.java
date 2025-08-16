package set;

import java.util.HashSet;

public class A {
	public static void main(String[] args) {
		HashSet set1=new HashSet();
		set1.add("Saniya");
		set1.add("Mango");
		set1.add("Cherry");
		set1.add(500);
		System.out.println(set1);
		System.out.println(set1.size());
		System.out.println(set1.isEmpty());
		
		HashSet set2=new HashSet();
		set2.add("Apple");
		set2.add("Mango");
		set2.add("Watermelon");
		set2.add(600);
		System.out.println(set2);
		System.out.println(set2.size());
		System.out.println(set2.isEmpty());
		
		set1.addAll(set2);
		System.out.println(set1);
		System.out.println(set1.size());
		System.out.println(set1.isEmpty());
		
		set1.clear();
		System.out.println(set1);
		
		set2.clear();
		System.out.println(set2);
	
		
	}
}
