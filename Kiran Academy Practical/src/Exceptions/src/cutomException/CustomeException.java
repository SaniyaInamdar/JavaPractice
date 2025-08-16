package cutomException;

public class CustomeException extends Exception{
	
	private String msg= null ;
	
	public CustomeException() {
		
	}
	
	public CustomeException(String message ) {
		this.msg=message;
	}
	
	public void throwmsg() {
		System.out.println(this.msg);
	}
	
}
