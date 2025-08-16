package arraylist;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;


public class A {
	public static void main(String[] args) {
		ArrayList list1=new ArrayList();
		list1.add("Saniya");
		list1.add(200);
		list1.add("Inamdar");
		list1.add("Saniya");
		System.out.println(list1);
		
		
		ArrayList list2=new ArrayList();
		list2.add("Apple");
		list2.add(500);
		list2.add("Inamdar");
		System.out.println(list2);

//		String str=list1.toString();
//		System.out.println(str);
//		
//		Object o[]=list1.toArray();
//		System.out.println(o);
		
//		list1.set(0, list2);
//		System.out.println(list1);
//		
//		list1.set(0, "saniya222");
//		System.out.println(list1);
		
//		List sub=list1.subList(1, 3);
//		System.out.println(sub);
		
//		list1.addAll(list2);
//		System.out.println(list1);
//		
//		list1.remove(0);
//		System.out.println(list1);
//
//		list1.retainAll(list2);
//		System.out.println(list1);
//		
//		
//		list1.removeAll(list2);
//		System.out.println(list1);
		
//		boolean b=	list1.contains("Saniya");
//		System.out.println(b);
//		
//		boolean b1=list1.containsAll(list2);
//		System.out.println(b1);
//		
//		int index=list1.indexOf(200);
//		System.out.println(index);
//		
//		int index1=list1.lastIndexOf("Saniya");
//		System.out.println(index1);
//		
//		Object index2=list1.getFirst();
//		System.out.println(index2);
//
//		Object index3=list1.getLast();
//		System.out.println(index3);
	}
}
