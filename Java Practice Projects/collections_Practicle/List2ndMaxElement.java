package collections_Practicle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class List2ndMaxElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list1=new ArrayList<>();
		
		list1.add(21);
		list1.add(54);
		list1.add(54);
		list1.add(187);
		list1.add(96);
		list1.add(12);
		System.out.println(list1);
		Collections.sort(list1);
		System.out.println(list1);
		System.out.println(list1.get(list1.size()-2));
	}
	
}


//aloo kachalu beta kaha gaye the baigan ke tokri mein so rahe the baigan ne gali di ro rahe the mummy ne mobile diya nach rahe the bhaiya ne khelona diya 
//has rahe the papa dande se mara  pagalon jaisa ro rahe the wa
//wawwa
//awwawawwwwaaaaaaaa nooooooo