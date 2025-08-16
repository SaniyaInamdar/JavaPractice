package thisansSuperInheritance;

public class B  extends A{
	String name="Inamdar";
	public void b1() {
		String name="Asif";
		System.out.println(this.name);
		System.out.println(name);
		System.out.println(super.name);
	}
	
}
