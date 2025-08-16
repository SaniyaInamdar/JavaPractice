package employee;

import java.util.Scanner;

public class Person {
		private String name,city;
		private int age;
		
		public Person() {
			
		}
		
		public Person(String name,String city,int age) {
			this.setage(age);
			this.setcity(city);
			this.setname(name);
		}
		
		public void setname(String name) {
			this.name=name;
		}
		public String getname() {
			return this.name;
		}
		
		
		public void setcity(String city) {
			this.city=city;
		}
		public String getcity() {
			return this.city;
		}
		
		public void setage(int age) {
			this.age=age;
		}
		public int getage() {
			return this.age;
		}
		
		
		public void accept() {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter name : ");
			this.setname(sc.next());
			System.out.println("Enter city : ");
			this.setcity(sc.next());
			System.out.println("Enter age : ");
			this.setage(sc.nextInt());
		}
		

		public void show() {
			System.out.println("Name is  :"+getname());
			System.out.println("City is  :"+getcity());
			System.out.println("Age is  :"+getage());
		}
		
		@Override
		public String toString() {
			return "[Person info : "+"Name :"+this.getname()+" "+"City : "+this.getcity()+" "+"Age : "+getage()+"]";
		}
}
