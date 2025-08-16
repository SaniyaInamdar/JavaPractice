package practiceProgram;

import java.util.ArrayList;

//12. write a program to print arraylist in reverse


public class J {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(58);
		list.add(14);
		list.add(03);
		list.add(28);
		list.add(17);
		list.add(22);

		System.out.println("Using iterator");
		reverseList(list);
		
		
		System.out.println("Using Stream API");
	}

	public static void reverseList(ArrayList<Integer> list) {
		for(int i=list.size()-1;i>=0;i--) {
			System.out.println(list.get(i));
		}
	}
}
