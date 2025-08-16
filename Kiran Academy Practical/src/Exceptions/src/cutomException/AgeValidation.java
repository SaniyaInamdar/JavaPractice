package cutomException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AgeValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			
			int age=0;
			System.out.println("Enter a age");
		
			try {
				age=sc.nextInt();
				
				if(age>=18) {
					System.out.println("Eligable");
				}
				else {
					throw new CustomeException("Not eligable");
				}
			}catch(InputMismatchException e) {
				e.printStackTrace();
			}
			catch(CustomeException e) {
				e.throwmsg();
			}
	}

}
