package collection_Employee_Project_CRUD;

import java.util.Scanner;

public class Person {
//id.name.age.city.phone
	private int id,age;
	private long phone;
	private String city,name;
	static int  idcounter=1;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Person(int id, int age, long phone, String city, String name) {
		super();
		this.id = id;
		this.age = age;
		this.phone = phone;
		this.city = city;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", age=" + age + ", phone=" + phone + ", city=" + city + ", name=" + name + "]";
	}
	
	public void accept() {
		Scanner sc=new Scanner(System.in);
		System.out.println("============ Enter Person Details =============");
		setId(idcounter++);
		System.out.println("Enter Id : "+getId());
		
		System.out.println("Enter Name : ");
		setName(sc.next());
		System.out.println("Enter City : ");
		setCity(sc.next());
		System.out.println("Enter Phone Number : ");
		setPhone(sc.nextLong());
		System.out.println("Enter Age : ");
		setAge(sc.nextInt());
	}
	
	public void show() {
		System.out.println("============ Person Details =============");
		System.out.println("Id : "+getId());
		System.out.println("Enter Name : "+getName());
		System.out.println("Enter City : "+getCity());
		System.out.println("Enter Phone Number : "+getPhone());
		System.out.println("Enter Age : "+getAge());
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
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
