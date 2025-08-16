package todo;

public class accepttodo {
	int fact=1,sq;
	public void fact(int num) {
		System.out.println("Factorial of "+num+" is :");
		for(int i=1;i<=num;i++) {
			fact=fact*i;
		}
		System.out.println(fact);
	}
	
	public void square(int num) {
		sq=num*num;
		System.out.println("Square of "+num+" is :"+sq);
	}
	
	public static void sum() {
		int total=0;
		for(int i=1;i<=10;i++) {
			total=total+i;
			
		}
		System.out.println("Sum of 1 to 10 is : "+total);
	}
	
	public static void table(int num) {
		int tbl;
		System.out.println("Table of "+num+" is :");
		for(int i=1;i<=10;i++) {
			tbl=i*num;
			System.out.println(tbl);
		}
	}
}
