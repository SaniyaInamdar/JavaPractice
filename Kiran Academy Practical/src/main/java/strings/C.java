package strings;

// concat - concat the 2 string , subtring-  gives the string from particular number
//contains - check if that word is available or not , trim- remove start and ending space

public class C {
	public static void main(String[] args) {
	String s1=" Java programming is a language ";
	
	String s2="this is a - ";
	
	String s3=s1.concat(s2);
	System.out.println(s3);
	
	String s4=s1.substring(5);
	System.out.println(s4);
	
	boolean s5=s1.contains("is ");
	System.out.println(s5);
	
	String s6=s1.trim();
	System.out.println(s6);
	
	int length1=s1.length();
	System.out.println(length1);
	
	int length2=s6.length();
	System.out.println(length2);
	
	}
}

