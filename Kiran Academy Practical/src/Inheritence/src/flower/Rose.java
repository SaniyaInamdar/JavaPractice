package flower;

import java.util.Scanner;

public class Rose extends Flower{
	private String Flowertype;
	
	public Rose() {
		acceptRose();
		showRose();
	}
	
	public Rose(String type) {
		setFlowerType(type);
	}
	
	public void setFlowerType(String ft) {
		Flowertype=ft;
	}
	public String getFlowerType() {
		return Flowertype;
	}
	
	public void acceptRose() {
		
		acceptFlower();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Rose Type : ");
		setFlowerType(sc.next());
	}
	
	public void showRose() {
		showFlower();
		System.out.println("Rose type is : "+getFlowerType());
	}
}
