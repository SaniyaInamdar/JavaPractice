package cutomException;

public class Limitcustom extends Exception{
	private String e=null;
	public Limitcustom(){
		
	}
	
	public Limitcustom(String e) {
		this.e=e;
	}
	
	public void limiterror() {
		System.out.println(this.e);
	}
}
