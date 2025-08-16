package animal;

import java.util.Scanner;

public class Tiger extends Animal{

		private String tiger_type;
		
		public Tiger() {
			acceptanimal();
			accepttiger();
			showanimal();
			showtiger();
		}
		
//		public Tiger(String tigert) {
//			System.out.println(tigert);
//		}
		
		
		public void setTiger_type(String tt) {
			tiger_type=tt;
		}
		public String getTiger_type() {
			return tiger_type;
		}
		
		
		public void accepttiger() {
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter Tiger Tyep : ");
			setTiger_type(sc.next());
		}
		
		
		public void showtiger() {
			System.out.println("Tiger type : "+getTiger_type());
		}
		
}
