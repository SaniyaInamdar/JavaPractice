package set;

import java.util.HashSet;

public class B {

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
		
		
		set1.remove("Saniya");
		System.out.println(set1);
		
		set1.addAll(set2);
		System.out.println(set1);
		
		boolean b = set1.contains("Mango");
		System.out.println(b);
		
		
		boolean b1 = set1.containsAll(set2);
		System.out.println(b1);
		
		set1.retainAll(set2);
		System.out.println(set1);
		
	}

}
