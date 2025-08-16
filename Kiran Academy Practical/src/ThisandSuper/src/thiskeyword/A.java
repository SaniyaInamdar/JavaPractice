package thiskeyword;

public class A {
	String name="Saniya";
	int dd=108;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a1=new A();
		a1.m3();

	}
	

		public void m1() {
			String n="Saniya";
			System.out.println(n);
		}
	
		public void m2() {
			this.m1();
			System.out.println("Asif");
		}
	
		
		public void m3() {
			 this.m2();
			 System.out.println("Inamdar");
			 
			}
}
