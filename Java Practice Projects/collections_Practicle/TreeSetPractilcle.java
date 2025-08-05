package collections_Practicle;

import java.util.TreeSet;

public class TreeSetPractilcle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> set1=new TreeSet<>();
		set1.add(84);
		set1.add(897);
		set1.add(41);
		set1.add(12);
		System.out.println(set1);
		
		Object o= set1.descendingSet();
		System.out.println(o);
	}
}
