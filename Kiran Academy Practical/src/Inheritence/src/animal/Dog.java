package animal;

import java.util.Scanner;

public class Dog extends Animal {
	private String dogtype;
	
	public Dog() {
		acceptanimal();
		acceptdog();
		showanimal();
		showdog();
	}
	
//	public Dog(String dogtype) {
//		
//	}
//	
	
	public void setdogtype(String dt) {
		dogtype=dt;
	}
	
	public String getdogtype() {
		return dogtype;
	}
	
	
	public void acceptdog() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Dog Type :");
		setdogtype(sc.next());
	}
	
	public void showdog() {
		System.out.println("Dog Type is  : "+getdogtype());
	}
}
