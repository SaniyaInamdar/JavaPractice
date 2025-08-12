package comparatorcomparablesorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Student implements Comparable<Student> {
	private int id,age;
	private String name;
	static ArrayList<Student> list= new ArrayList<Student>();
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Student(int id, int age, String name) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", age=" + age + ", name=" + name + "]";
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public static  void studentagesort() {
		Collections.sort(list,new StudentAgeSort());
	}
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		if(o.getAge()<o.getAge()) {
			return -1; //descending
		}
		if(o.getAge()>o.getAge()) {
			return 1;
		}
		else {
			return 0;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		list.add(new Student(1,25,"s"));
		list.add(new Student(1,32,"sa"));
		list.add(new Student(1,5,"san"));
		list.add(new Student(1,15,"sani"));
		list.add(new Student(1,85,"saniy"));
		list.add(new Student(1,69,"saniya"));
		System.out.println("Before sorting");
		print(list);
		
		System.out.println("Sorting using comparatort (Studentagesort)");
		studentagesort();
		print(list);
		
		System.out.println("Sorting using comparable : ");
		Collections.sort(list);// uses compare to
		print(list);
	}
	public static void print(ArrayList<Student> list) {
		Iterator<Student> itr=list.iterator();
		while(itr.hasNext()) {
			Student s=itr.next();
			System.out.println(s);
		}
	}
	
}
