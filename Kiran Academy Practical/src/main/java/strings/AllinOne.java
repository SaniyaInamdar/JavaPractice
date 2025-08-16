package strings;
//equals
//touppercase
//tolwercase
//indexof
//lastindexof
//concat
//length
//trim
//substring
//contains
//startswith
//endswith
//replace
//split
//valueof
//isempty
//isblank
//charat
//codepointat
public class AllinOne {
	
	public static void main(String[] args) {
		String str="Saniya";
		String str1="Saniya";
		String s=new String("Saniya");
		String s1=new String("Saniya");
		
		System.out.println(str==str1);
		System.out.println(str.equals(str1));
		
		System.out.println(s==s1);
		System.out.println(s.equals(s1));
		
		System.out.println(str==s);
		System.out.println(str.equals(s));
	}
	
}
