package flower;

import java.util.Scanner;


public class Flower {
	private String name,colour,smell;
	
	
	
	public Flower(String name,String colour,String smell) {
		setname(name);
		setcolour(colour);
		setsmell(smell);
	}
	
	
	
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
	
	public void setsmell(String sm) {
		smell=sm;
	}
	public String getsmell() {
		return smell;
	}
	
	public Flower() {
		
	}
	
	
	
	public void acceptFlower() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Flower Name : ");
		setname(sc.next());
		System.out.println("Enter Flower Colour : ");
		setcolour(sc.next());
		System.out.println("Enter Flower Smell : ");
		setsmell(sc.next());
	}
	
	public void showFlower() {
		System.out.println("Flower Name : "+getname());
		System.out.println("Flower Colour : "+getcolour());
		System.out.println("Flower Smell : "+getsmell());
	}
	
}
