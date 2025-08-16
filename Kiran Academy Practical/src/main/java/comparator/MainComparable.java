package comparator;

import java.util.TreeSet;

public class MainComparable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> set1 = new TreeSet<Integer>(new CustomeSorting());
		set1.add(54);
		set1.add(4);
		set1.add(4);
		set1.add(554);
		set1.add(44);
		set1.add(0);
		set1.add(-2);
		set1.add(8);
		System.out.println(set1);
	}

}
