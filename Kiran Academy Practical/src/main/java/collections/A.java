package collections;

import java.util.ArrayList;

public class A {
	public static void main(String[] args) {
		int y=100;
	
		ArrayList list1=new ArrayList();
		System.out.println(list1.size());
		System.out.println(list1.isEmpty());
		list1.add(y);
//		int h=list1.get(0);
		Object h=list1.get(0);
		System.out.println(h);
		
		A a=new A();
		list1.add(a);
		
		Object h1=list1.get(1);
		System.out.println(h1);
		
		
		
//		ArrayList e=new ArrayList();
//		e.add(y);
//		System.out.println(e);
//		System.out.println(e.size());
//		System.out.println(e.isEmpty());
//		e.clear();
	}
}
