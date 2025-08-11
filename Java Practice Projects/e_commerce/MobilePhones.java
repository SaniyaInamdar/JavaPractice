package e_commerce;

import java.util.Scanner;

//MobilePhone → inherits from Electronics (brand, model, batteryCapacity)
public class MobilePhones extends Electronics{

		String brand;
		String model;
		double batterCapacity;
		
		
		public void accept() {
			super.accept();
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Mobile Phone Details : ");
			
			System.out.println("Enter Brand : ");
			brand=sc.next();
			System.out.println("Enter Model : ");
			model=sc.next();
			System.out.println("Enter BatteryCapacity : ");
			batterCapacity =sc.nextDouble();
		}
		
		public void show() {
			super.show();
			System.out.println("Mobile Phone Details : ");
			
			System.out.println("Enter Brand : "+brand);
			
			System.out.println("Enter Model : "+model);
			
			System.out.println("Enter BatteryCapacity : "+batterCapacity);
			
		}
}
