package array;

import java.util.Scanner;

	public class C {
		byte ar1[]=new byte[10];
		byte ar[]=new byte[5];
		public static void main(String[] args) {
			C c1=new C();
			c1.accept(c1.ar1);
			c1.show(c1.ar1);
		}

		public void show(byte s[]) {
			for(int j=0;j<s.length;j++) {
				System.out.println(s[j]);
			}
		}
		
		public void accept(byte a[]) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter an elemets : ");
	
			for(int i=0;i<ar1.length;i++) {
				a[i]= sc.nextByte();
			}
		}
	}
