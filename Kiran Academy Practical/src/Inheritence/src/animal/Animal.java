package animal;

import java.util.Scanner;

public class Animal {
	private String name,colour,sound,food_type;
	
	
	public Animal() {
	
	}
	
//	public Animal(String Name,String Colour,String Sound,String Food_type) {
//		System.out.println(Name);
//		System.out.println(Colour);
//		System.out.println(Sound);
//		System.out.println(Food_type);
//	}
	
	
	
	public void setname(String n) {
		name=n;
	}
	public String getname() {
		return name;
	}
	
	
	public void setcolour(String c) {
		colour=c;
	}
	public String getcolour() {
		return colour;
	}
	
	
	public void setsound(String s) {
		sound=s;
	}
	public String getsound() {
		return sound;
	}
	
	
	public void setfood_type(String f) {
		food_type=f;
	}
	public String getfood_type() {
		return food_type;
	}
	
	
	
	public void acceptanimal() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Animal Details : ");
		
		System.out.println("Name : ");
		setname(sc.next());
		System.out.println("Colour : ");
		setcolour(sc.next());
		System.out.println("Sound : ");
		setsound(sc.next());
		System.out.println("Food Type : ");
		setfood_type(sc.next());
	}
	
	public void showanimal() {
		System.out.println("Name : "+getname());
		System.out.println("Colour : "+getcolour());
		System.out.println("Sound : "+getsound());
		System.out.println("Food Type : "+getfood_type());
	}
	
}
