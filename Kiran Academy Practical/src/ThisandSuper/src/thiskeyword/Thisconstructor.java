package thiskeyword;

public class Thisconstructor {

		double d1=22.45;
	
	public Thisconstructor() {
		this("Saniya");
		// this(12);
		System.out.println(this.d1);
		// this("Saniya");
	}
	
	public Thisconstructor(String name) {
		this(12);
		System.out.println(name);
	}
	
	public Thisconstructor(int no) {
		this(12,"Saniya");
		System.out.println(no);
	}
	
	public Thisconstructor(int no,String name) {
		System.out.println(no+" "+name);
	}
	
}
