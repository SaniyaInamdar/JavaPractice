package studentArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class StudentManagement1 {
	static Scanner sc = new Scanner(System.in);
	
	static ArrayList<Student> list=new ArrayList<>();
	
	public static void acceptStudent() {
		Student std = new Student();
		System.out.println("Enter Id : ");
		std.setId(sc.nextInt());
		System.out.println("Enter Roll No : ");
		std.setRollno(sc.nextInt());
		System.out.println("Enter Name : ");
		std.setName(sc.next());
		list.add(std);
	}
	
	public static void showStudent() {
		for(Student s: list) {
			System.out.println(s.toString());
		}
	}
	
	public static void deleteStudent() {
		System.out.println("Enter Id to delete student : ");
		int deleteId = sc.nextInt();
		Iterator<Student> itr=list.iterator();
		while(itr.hasNext()) {
			Student s=itr.next();
			if(s.getId()==deleteId) {
				itr.remove();
			}
		}
	}
	
	public static void updateStudent() {
		System.out.println("Enter Id to update student : ");
		int updateId = sc.nextInt();
		for(Student s : list) {
			if(s.getId()==updateId) {
				System.out.println("Enter Name : ");
				s.setName(sc.next());
				System.out.println("Enter Roll No : ");
				s.setRollno(sc.nextInt());
				break;
			}
			else {
				System.out.println("Id not found");
			}
		}
		System.out.println("Student Updated Succesfully");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice;
		do {
		System.out.println("Choose Choice ");
		System.out.println("1. Add Student");
		System.out.println("2. Show Student");
		System.out.println("3. Update Student");
		System.out.println("4. Delete Student");
		System.out.println("5. Exit");
		choice = sc.nextInt();
		
		switch(choice) {
		case 1 : acceptStudent(); break;
		case 2 : showStudent(); break;
		case 3 : updateStudent(); break;
		case 4 : deleteStudent(); break;
		case 5 : System.out.println("Program Terminated...."); break;
		default : System.out.println("Wrong choice");
		}
		}while(choice!=5);
	}

}
