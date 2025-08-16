package cutomException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LimitChecker {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int num=0;
	System.out.println("Enter a number  :");
	
	try {
	num=sc.nextInt();
		
		if(num<=20) {
			System.out.println("Limited");
		}
		else {
			throw new Limitcustom("Not in limit out of 20");
		}
	}
		
		catch(Limitcustom l) {
			l.limiterror();
		}
	}
}
