package string_Buffer;

public class B_CountSpace {
	public static void main(String[] args) {
	//	StringBuffer sb=new StringBuffer("Java programming is high level object oriented programming language");
		String s1="Java programming is high level object oriented programming language";
		int count=0;
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i)==' ') {
				count++;
			}
		}
		System.out.println(count);
	}
}
