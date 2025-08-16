package metalandgold;

import java.util.Scanner;

public class Metal {
	private String metalname,colour,boilingpoint,meltingpoint;
	
	
	
	public Metal() {
	
	}
	
	
	public Metal(String metalname,String colour,String boilingpoint,String meltingpoint) {
		 	setmetalname(metalname);
		    setcolour(colour);
		    setboilingpoint(boilingpoint);
		    setmeltingpoint(meltingpoint);
	}
	
	
	public void setmetalname(String metalname) {
		this.metalname=metalname;
	}
	public String getmetalname() {
		return metalname;
	}
	
	public void setcolour(String colour) {
		this.colour=colour;
	}
	
	public String getcolour() {
		return colour;
	}
	
	public void setboilingpoint(String boilingpoint) {
		this.boilingpoint=boilingpoint;
	}
	
	public String getboilingpoint() {
		return boilingpoint;
	}
	
	public void setmeltingpoint(String meltingpoint) {
		this.meltingpoint=meltingpoint;
	}
	
	public String getmeltingpoint() {
		return meltingpoint;
	}
	
	public void acceptmetal() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter metalname : ");
		setmetalname(sc.next());
		
		System.out.println("Enter metalcolour : ");
		setcolour(sc.next());
		
		System.out.println("Enter metal boilingpoint : ");
		setboilingpoint(sc.next());
		
		System.out.println("Enter metal meltingpoint : ");
		setmeltingpoint(sc.next());
	}
	
	
	public void showmetal() {
		System.out.println("matal name : "+getmetalname());
		
		System.out.println("MetL COLOUR : "+getcolour());
		
		System.out.println("metal boiling point : "+getboilingpoint());
		
		System.out.println("metal meltingpoint"+getmeltingpoint());
	}
}
