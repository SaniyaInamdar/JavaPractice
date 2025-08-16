package metalandgold;

import java.util.Scanner;

public class Iron extends Metal{
	
	private String geolocation;
	
	public Iron() {
		super();
		acceptIron();
		showIron();
		usedofiron();
	}
	
	public Iron(String geolocation) {
		setgeolocation(geolocation);
	}
	
	
	public void setgeolocation(String geolocation) {
		this.geolocation=geolocation;
	}
	
	public String getgeolocation() {
		return geolocation;
	}
	
	public void usedofiron() {
		System.out.println("Use 1");
		System.out.println("Use 2");
		System.out.println("Use 3");
		System.out.println("Use 4");
		System.out.println("Use 5");
		System.out.println("Use 6");
	}
	
	public void acceptIron() {
		super.acceptmetal();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter iron geolocation : ");
		setgeolocation(sc.next());
	}
	
	public void showIron() {
		super.showmetal();
		System.out.println("Iron geolocation"+getgeolocation());
	}
}
