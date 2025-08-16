package strings;
//equals
public class A {
	public static void main(String[] args) {
		String s1="Saniya";
		String s2="Saniya";
		
		System.out.println(s1==s2);// Compare reference
		
		String t1=new String("Saniya");
		String t2=new String("Saniya");
		
		System.out.println(t1==t2);
		System.out.println(t1.equals(t2)); // Compare contents
		
		
		String s3=new String("Saniya");
		System.out.println(s1==s3); 
		
		System.out.println(s1.equals(s3));
		
	}
}


