package metalandgold;

import java.util.Scanner;

public class Gold extends Metal{
	
	private String geolocation;
	
	public Gold() {
		acceptgold();
		showgold();
	}
	
	public Gold(String geolocation) {
		this.geolocation=geolocation;
	}
	
	
	public void setgeolocation(String geolocation) {
		this.geolocation=geolocation;
	}

	public String getgeolocation() {
		return geolocation;
	}

	public void acceptgold() {
		super.acceptmetal();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter gold geolocation : ");
		setgeolocation(sc.next());
	}
	public static void age() {
		int age1=30;
		System.out.println(age1);
	}
	public void showgold() {
		this.age();
		super.showmetal();
		System.out.println("Gold geo location : "+getgeolocation());
	}
}
