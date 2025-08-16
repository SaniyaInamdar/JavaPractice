package strings;
//startswith, endswith, replace, split, valueof, isEmpty, isBlank          
public class D {                                                   

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Java is a programming language";
		String s7=" ";
		
		boolean s2=s1.startsWith("Java");
		System.out.println(s2);
		
		boolean s3=s1.endsWith("age");
		System.out.println(s3);
		
		
		String s4= s1.replace("Java", "Sql");
		System.out.println(s4);
		
		String[] s5=s1.split("a");
		for(String s11:s5) {
			System.out.println(s11);
		}
		
		
		String s6=String.valueOf(s1);
		System.out.println(s6);
		
		boolean s8=s7.isBlank();
		System.out.println(s8);
		boolean s9=s7.isEmpty();
		System.out.println(s9);
		
	}

}


