package ClassExample;

import java.util.Scanner;

public class BookClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name,authorname;
		int quantity,price,total,noofbooks;
		double discount,finalamt;
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("How many books you want to enter : ");
		noofbooks=sc.nextInt();
		sc.nextLine();
		
		for(int i=1;i<=noofbooks;i++) {
			System.out.println("Enter"+i+"Details");
			System.out.println("Enter"+i+" Book name : ");
			name=sc.nextLine();
			
			System.out.println("Enter"+i+" Author Name : ");
			authorname=sc.nextLine();
			
			System.out.println("Enter"+i+" Quantity : ");
			quantity=sc.nextInt();
			sc.nextLine();
			
			System.out.println("Enter"+i+" Price : ");
			price=sc.nextInt();
			sc.nextLine();
			
			total=quantity*price;
			
			System.out.println("Total of "+name+" is : "+ total);
			
			if(total>500) {
				discount=(total*5)/100;
				finalamt=total-discount;
				System.out.println("After 5% discount the prce of "+name+"and author of : "+authorname+"is"+finalamt);
				
			}	
		}
		sc.close();
		
	}


}
