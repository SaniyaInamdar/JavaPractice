package string_Buffer;

public class C_Reverse {
	public static void main(String[] args) {
		String s="Java programming is high level object oriented programming language";
		StringBuffer sb= new StringBuffer("Java programming is high level object oriented programming language");
		String rev="";
		System.out.println(sb.reverse());
		
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
	}
}
