package twoDArray;

import java.util.Scanner;

public class A {
	public static void accept(int k[][]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an elemnts : ");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				k[i][j]=sc.nextInt();
			}
		}
	}
	
	public static void total(int a[][], int b[][], int c[][]) {
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				c[i][j]= a[i][j]*b[i][j];
			}
		}
	}
	
	public static void show(int j[][]) {
		for(int i=0;i<3;i++) {
			for(int k=0;k<3;k++) {
				System.out.print(j[i][k]+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		int a1[][]=new int[3][3];
		int b1[][]= new int[3][3];
		int c1[][]= new int[3][3];
		A.accept(a1);
		A.accept(b1);
		A.show(a1);
		A.show(b1);
		System.out.println("-----Addition------");
		A.total(a1,b1,c1);
		A.show(c1);
	}
}
