package twoDArray;

import java.util.Scanner;

public class Multiply {
	
	public static void accept(int a[][]) {
		System.out.println("Enter an elements : ");
		Scanner sc= new Scanner(System.in);
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				a[i][j]=sc.nextInt();
			}
		}
	}
	
	public static void show(int a[][]) {
		System.out.println("Matrix is : ");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static void mul(int c[][],int a[][], int b[][]) {
		System.out.println("Multiplication is : ");
		for(int i=0;i<c.length;i++) {
			for(int j=0;j<c.length;j++) {
				c[i][j]=a[i][j]*b[i][j];
			}
		}
	}
	
	public static void main(String[] args) {
		int arr[][]= new int[2][2];
		int arr1[][]= new int[2][2];
		int arr2[][]= new int[2][2];
		Multiply.accept(arr);
		Multiply.show(arr);
		System.out.println();
		Multiply.accept(arr1);
		Multiply.show(arr1);
		System.out.println("==========Multiplication==========");
		Multiply.mul(arr2,arr,arr1);
		Multiply.show(arr2);
	}
}
