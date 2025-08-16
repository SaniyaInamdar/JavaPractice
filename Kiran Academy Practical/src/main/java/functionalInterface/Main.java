package functionalInterface;

public class Main implements CInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AInterface a1= (a,b) -> System.out.println(a+b); 
		a1.total(4,10);
		
		BInterface b1=(a,b) -> a*b;
		int h=b1.multiplication(5,6);
		System.out.println(h);
		
		CInterface c1=(a,b)->System.out.println(a-b);
		c1.subtract(5, 10);
		
		CInterface.AStatic();
	
		Main m=new Main();
		m.ADefault();
		
		
		
	}

	@Override
	public void ADefault() {
		System.out.println("Default method in main class");
	}
	
	@Override
	public void subtract(int a, int b) {
		// TODO Auto-generated method stub
		
	}

}