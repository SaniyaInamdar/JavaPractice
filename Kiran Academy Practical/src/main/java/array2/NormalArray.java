package array2;

import java.util.Scanner;

public class NormalArray {
	int arr[]=new int[4];
	
	public void accept(int a[]) {
		System.out.println("Enter an elements : ");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
	}
	
	public void show(int s[]) {
		System.out.println("Elemnts in array are : ");
		for(int j=0;j<s.length;j++) {
			System.out.println(s[j]);
		}
	}
	
	public static void main(String[] args) {
		NormalArray na=new NormalArray();
		na.accept(na.arr);
		na.show(na.arr);
	}
}
