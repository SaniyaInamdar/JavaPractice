package studentArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class StudentManagement {
	static ArrayList<Student> list = new ArrayList<Student>();
	Scanner sc=new Scanner(System.in);
	int count=1;
	
	
	
	public void addStudent() {
		for(int i=0;i<=1;i++) {
			Student std=new Student();
	System.out.println("Enter Student Details : ");
	std.setId(count++);
	System.out.println("Enter Student Id : "+std.getId());
	System.out.println("Enter Student Roll No : ");
	std.setRollno(sc.nextInt());
	System.out.println("Enter Name : ");
	std.setName(sc.next());
	list.add(std);
	
		}
	}
	
	public void viewAllStudent() {
		
		for( Student std : list) {
	System.out.println("Enter Student Id : "+std.getId());
	System.out.println("Enter Student Roll No : "+std.getRollno());
	System.out.println("Enter Name : "+std.getName());
		}
}
	
	public void deleteStudent() {
		System.out.println("Enter Id to delete : ");
		int delteId=sc.nextInt();
		
		Iterator<Student> itr=list.iterator();
		while(itr.hasNext()) {
			Student s=itr.next();
			if(s.getId()==delteId) {
				itr.remove();
				System.out.println("Student deleted successfully");
				break;
			}
			else {
				System.out.println("Student not found ");
			}
		}
	}
	
	public void updateStudent() {
		System.out.println("Enter id to updtae : ");
		int updateId= sc.nextInt();
		Iterator<Student> itr= list.iterator();
		while(itr.hasNext()) {
			Student s=itr.next();
			if(s.getId()==updateId) {
				System.out.println("Enter Name : ");
				s.setName(sc.next());
				System.out.println("Enter Roll no : ");
				s.setRollno(sc.nextInt());
				System.out.println("Updated Successfully ");
			}
			else {
				System.out.println("Student not found ");
			}
		}
	}
	
	
	public void sortbyrolllno() {
		Collections.sort(list, new SortRollNo());
	}
	
	
	public static void main(String[] args) {
		
		StudentManagement sm=new StudentManagement();
		sm.addStudent();
		sm.viewAllStudent();
//		sm.deleteStudent();
//		sm.viewAllStudent();
//		sm.updateStudent();
//		sm.viewAllStudent();
		
		sm.sortbyrolllno();
		sm.viewAllStudent();
		
	}
	
	
}
