package string_Buffer;


public class A {
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("I like java programming language");
		System.out.println(sb);
		sb.append(false);
		System.out.println(sb);
		sb.append(500);
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		sb.delete(5,10);
		System.out.println(sb);
		sb.deleteCharAt(5);
		System.out.println(sb);
		sb.setCharAt(1,'Y');
		System.out.println(sb);
	}
}
