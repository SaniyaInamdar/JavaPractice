package array1;

import java.util.Scanner;

public class Square {
	int arr[]=new int[10];
	
	
	public void accept(int a[]){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter elements : ");
		
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
	}
	
	
	public void show(int s[]) {
		System.out.println("Square of elements are ");
		
		for(int j=0;j<s.length;j++) {
			int square=s[j]*s[j];
			System.out.println(square);
		}
	}
public static void main(String[] args) {
	Square s=new Square();
	s.accept(s.arr);
	s.show(s.arr);
}
}
