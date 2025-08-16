package strings;
//charAt, codePointAt -  unicode show, 
public class E {
	public static void main(String[] args) {
		String s1= "Java is a programming language";
		char s2= s1.charAt(5);
		System.out.println(s2);
		int code = s1.codePointAt(20);
		System.out.println(code);
	}
}

