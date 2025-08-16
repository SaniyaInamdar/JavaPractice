package array1;

import java.util.Scanner;

public class Sum {
	int arr[]=new int[5];
	
	public void acceot(int a[]) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter elements : ");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
	}
	
	public void show(int s[]){
		int sum=0;
		System.out.println("Sum of array elemnts : ");
		for(int j=0;j<s.length;j++) {
			sum=sum+s[j];
		}
		System.out.println(sum);
	}
	
	
	public static void main(String[] args) {
		Sum s=new Sum();
		s.acceot(s.arr);
		s.show(s.arr);
	}
}
