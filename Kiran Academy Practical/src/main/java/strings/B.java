package strings;
//indexof, lastindexof, touppercase, tolowercase
public class B {
	public static void main(String[] args) {
		
		String s1="Java Programming";
		int index=s1.indexOf('a');
		System.out.println(index);
		int index1=s1.indexOf('a',4);
		System.out.println(index1);
		int index3=s1.lastIndexOf('a');
		System.out.println(index3);
		int index4=s1.lastIndexOf('a',10);
		System.out.println(index4);
		int index5=s1.length();
		System.out.println(index5);
		int index6=s1.indexOf("gram");
		System.out.println(index6);
		
		String upper=s1.toUpperCase();
		System.out.println(upper);
		
		String lower=s1.toLowerCase();
		System.out.println(lower);
	}
}

