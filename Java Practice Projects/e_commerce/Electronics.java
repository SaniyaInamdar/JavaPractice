package e_commerce;

import java.util.Scanner;

public class Electronics extends Product{

		int warrantyperiod;
		
		public Electronics() {
		
			
		}
		
		@Override
		public void accept() {
			super.accept();
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Warranty Period : ");
			warrantyperiod=sc.nextInt();
			
			if(warrantyperiod>1) {
				System.out.println("Applicable ");
			}
			else {
				System.out.println("Not applicable");
			}
		}
		
		@Override
		public void show() {
			super.show();
			System.out.println("Warranty period : "+warrantyperiod);
		}
		
		
}
