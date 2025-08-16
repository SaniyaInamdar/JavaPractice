package practiceProgram;

import java.util.ArrayList;
import java.util.Collections;


//7. write a program to print arraylist in descending order
//8. write a program to print arraylist in ascending order

public class G {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(58);
		list.add(14);
		list.add(03);
		list.add(28);
		list.add(17);
		list.add(22);


		System.out.println("Using Collections Ascending");
		Collections.sort(list);
		System.out.println(list);
		
		System.out.println("Using Collections Descending");
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list);
		
		System.out.println("Using Stream API Ascending");
		list.stream().sorted().forEach(k-> System.out.println(k));
		
		System.out.println("Using Stream API Descending");
		list.stream().sorted(Collections.reverseOrder()).forEach(k-> System.out.println(k));
		
	}
	

}
