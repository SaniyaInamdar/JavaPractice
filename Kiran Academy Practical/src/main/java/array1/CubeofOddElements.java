package array1;

import java.util.Scanner;

public class CubeofOddElements {
	
	int arr[]=new int[10];
	
	public void accept(int a[]) {
		System.out.println("Enter elements  :");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
	}
	
	public void show(int s[]) {
		int cube = 0;
		System.out.println("Cube of odd elements : ");
		for(int j=0;j<s.length;j++) {
			if(s[j]%2!=0) {
				cube=s[j]*s[j];
				System.out.println(cube);
			}
		}
	}
	
	public static void main(String[] args) {
		CubeofOddElements c=new CubeofOddElements();
		c.accept(c.arr);
		c.show(c.arr);
	}
}
