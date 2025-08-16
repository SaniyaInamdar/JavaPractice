package hashMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap map1=new HashMap<>();
		map1.put(12, "Saniya");
		map1.put(2, "Sara");
		map1.put(15, "Ruhan");
		map1.put(92, "Sufyan");
		map1.put(29, "Sufyan");
		System.out.println(map1);
		
//		Set key_set=map1.keySet();
//		System.out.println(key_set);
//		printsetkey(key_set);
//		printvalue(map1);
		
//		Collection map_value=map1.values();
//		printcollection(map_value);
		
		Set key_set=map1.entrySet();
//		printentrySet(key_set);
		
		Iterator itr=key_set.iterator();
		while(itr.hasNext()) {
			Object o=itr.next();
//			Map1.Entry entry=(Map1.Entry)(o);
			
		}
	}
	
//	public static void printsetkey(Set maplist) {
//		Iterator itr=maplist.iterator();
//		while(itr.hasNext()) {
//			Object o=itr.next();
//			System.out.println(o);
//		}
//	}
//
//	public static void printvalue(HashMap maplist) {
//		int key=12;
//		if(maplist.containsKey(key)) {
//			System.out.println(maplist.get(key));
//		}
//	}
//	
//	public static void printcollection(Collection maplist) {
//		Iterator itr=maplist.iterator();
//		while(itr.hasNext()) {
//			Object o=itr.next();
//			System.out.println(o);
//		}
//	}
//	
//	public static void printentrySet(Set maplist) {
//		Iterator itr=maplist.iterator();
//		while(itr.hasNext()) {
//			Object o=itr.next();
//			System.out.println(o);
//		}
//	}
}
