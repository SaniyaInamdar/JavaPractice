package collections_Practicle;


import java.util.TreeSet;

public class TreeSetSort {
	public static void main(String[] args) {
		TreeSet<Integer> set1=new TreeSet<Integer>();
		set1.add(12);
		set1.add(45);
		set1.add(82);
		set1.add(92);
		set1.add(112);
		set1.add(125);
		set1.add(1248);
		set1.add(712);
		set1.add(52);
		set1.add(72);
		System.out.println(set1);
		Object o=set1.descendingSet();
		System.out.println(o);
	}
}
