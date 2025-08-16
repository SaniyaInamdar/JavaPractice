package string_Buffer;
import java.util.Arrays;

public class H_Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="study , is , a very good";
		String s1="study , is , a very good";
	
		if(s.length()!=s1.length()) {
			System.out.println("Not anagram");
		}
		else {
			char[] a=s.toCharArray();
			char[] b=s1.toCharArray();
			
			Arrays.sort(a);
			Arrays.sort(b);
			
			if(Arrays.equals(a, b)) {
				System.out.println("Anagram");
			}
			else {
				System.out.println("Not anagram");
			}
		}
	}
}
