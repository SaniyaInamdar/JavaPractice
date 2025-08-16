package array1;

import java.util.Scanner;

public class OddIndex {
	int arr[]=new int[5];
	
	
	public void accept(int a[]) {
		System.out.println("Enter Elements");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
	}
	
	public void show(int s[]) {
		System.out.println("Intex of elements : ");
		for(int j=0;j<s.length;j++) {
			if(s[j]%2!=0) {
				System.out.println(j);
			}
		}
	}
	
	public static void main(String[] args) {
		OddIndex o=new OddIndex();
		o.accept(o.arr);
		o.show(o.arr);
	}
}
