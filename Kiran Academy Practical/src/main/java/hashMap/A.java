package hashMap;

import java.util.HashMap;

public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> map1=new HashMap<>();
		map1.put(12, "Saniya");
		map1.put(2, "Sara");
		map1.put(15, "Ruhan");
		map1.put(92, "Sufyan");
		map1.put(29, "Sufyan");
		System.out.println(map1);
		
		int size=map1.size();
		System.out.println(size);
		
		boolean empty=map1.isEmpty();
		System.out.println(empty);
		
//		map1.clear();
//		System.out.println(map1);
		
		Object o = map1.get(2);
		System.out.println(o);
		
		Object o1 = map1.replace(29, "Arshad");
		System.out.println(o1);
		System.out.println(map1);
		
		Object o2= map1.remove(29);
		System.out.println(o2);
		System.out.println(map1);
		
		
	}

}
