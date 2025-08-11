package e_commerce;

import java.util.Scanner;

//E-Commerce System
//Product → base class (productId, price)
//
//Electronics → inherits from Product (warrantyPeriod)
//
//MobilePhone → inherits from Electronics (brand, model, batteryCapacity)
public class Product {
	int productId;
	double price;
	
	
	public void accept() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter product details : ");
		System.out.println("Enter Product Id");
		productId=sc.nextInt();
		System.out.println("Enter Product Price : ");
		price = sc.nextDouble();
		
	}
	
	public void show() {
		
		System.out.println("Product details : ");
		System.out.println("Product Id"+productId);
		System.out.println("Product Price : "+price);
		
	}
}
