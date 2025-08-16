package CircleArea;

import java.util.Scanner;

public class MainArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		areacalculate ac=new areacalculate();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Radius to calculate area of circle");
		double r=sc.nextDouble();
		double result=ac.area(r);
		System.out.println(result);
		sc.close();
	}

}
