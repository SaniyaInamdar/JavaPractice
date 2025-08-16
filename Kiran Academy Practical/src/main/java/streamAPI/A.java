package streamAPI;

import java.util.ArrayList;
import java.util.Comparator;

public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(500);
		list.add(5);
		list.add(-5);
		list.add(74);
		list.add(12);
		list.add(14);
		list.add(8);
		list.add(0);
		
		System.out.println("===Normal List====");
		System.out.println(list);
		
		System.out.println("===Using Stream - For Each list===");
		list.stream().forEach(t->System.out.println(t));
		
		System.out.println("===Max===");
		int max=list.stream().mapToInt(t->t).max().getAsInt();
		System.out.println(max);
		
		System.out.println("===Min===");
		int min=list.stream().mapToInt(t->t).min().getAsInt();
		System.out.println(min);
		
		System.out.println("===Average===");
		double avg=list.stream().mapToInt(t->t).average().getAsDouble();
		System.out.println(avg);
		
		System.out.println("===Sum====");
		int sum=list.stream().mapToInt(t->t).sum();
		System.out.println(sum);
		
		System.out.println("===Even Number====");
		list.stream().filter(t->t%2==0).forEach(t->System.out.println(t));
		
		System.out.println("===Sorting elemets Ascending Order===");
		list.stream().sorted().forEach(t1-> System.out.println(t1));;
		
		System.out.println("===Sorting elemets Descending Order===");
		list.stream().sorted(Comparator.reverseOrder()).forEach(t1-> System.out.println(t1));;
		
		
	}

}
