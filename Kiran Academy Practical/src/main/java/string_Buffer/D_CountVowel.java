package string_Buffer;

public class D_CountVowel {
	public static void main(String[] args) {
		String s="Java programming is high level object oriented programming language";
		int count=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U'||
					s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u' ) {
				count++;
			}
		}
		System.out.println(count);
	}
}
