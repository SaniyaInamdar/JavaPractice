package array1;

import java.util.Scanner;

public class Reverse {
	int arr[]=new int[2];
	
	
	public void accept(int a[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter elements : ");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
	}
	
	public void show(int s[]) {
		System.out.println("Reverse Order is  :  ");
		
		for(int j=s.length-1;j>=0;j--) {
			System.out.println(s[j]);
		}
	}
	public static void main(String[] args) {
		Reverse r=new Reverse();
		r.accept(r.arr);
		r.show(r.arr);
	}
}
