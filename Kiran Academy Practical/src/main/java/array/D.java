package array;

import java.util.Scanner;

public class D {
	short s[]=new short[10];
	
	public static void main(String[] args) {
		D d1=new D();
		d1.accept(d1.s);
		d1.show(d1.s);
	}
	
	public void show(short s[]) {
		for(int j=0;j<s.length;j++) {
			System.out.println(s[j]);
		}
	}
	
	public void accept(short a[]) {
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<s.length;i++) {
			s[i]=sc.nextShort();
		}
	}
	
}
