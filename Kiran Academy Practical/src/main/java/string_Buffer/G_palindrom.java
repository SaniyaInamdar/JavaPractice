package string_Buffer;

public class G_palindrom {
	public static void main(String[] args) {
		String s1="level";
		String rev="";
		for(int i=s1.length()-1;i>=0;i--) {
			rev=rev+s1.charAt(i);
		}
		if(s1.equals(rev)) {
			System.out.println("Palindrom");
		}
		else {
			System.out.println("Not Pallindrom");
		}
	}
}
