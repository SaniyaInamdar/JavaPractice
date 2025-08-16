package phone;

import java.util.Scanner;

public class PhoneDetails {
	int battery,ram,storage;
	String camera,proceesor,name,os;
			public void accept() {
				Scanner sc=new Scanner(System.in);
				
				System.out.println("Enter Phone Name : ");
				name=sc.next();
				System.out.println("Enter OS Name : ");
				os=sc.next();
				System.out.println("Enter Processor : ");
				proceesor=sc.next();
				System.out.println("Enter Ram :");
				ram=sc.nextInt();
				System.out.println("Enter Storage : ");
				storage=sc.nextInt();
				System.out.println("Enter Battery : ");
				battery=sc.nextInt();
				sc.close();
			}
			
			public void show() {
				System.out.println("Phone name is : "+name);
				System.out.println("OS name is : "+os);
				System.out.println("Processor is : "+ proceesor);
				System.out.println("Ram is : "+ram);
				System.out.println("Storage is : "+storage);
				System.out.println("Battery is : "+battery);
			}
}
