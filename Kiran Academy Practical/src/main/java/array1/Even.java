package array1;

import java.util.Scanner;

public class Even {
	int arr[]=new int[10];
	
	public void accept(int a[]) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter 10 elements : ");
		
		for(int i=0;i<a.length;i++) {
			 a[i]=sc.nextInt();
		}
	}
	
	
	
	public void show(int s[]) {
		for(int j=0;j<s.length;j++) {
			if(s[j]%2==0) {
				System.out.println(s[j]);
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Even e=new Even();
		e.accept(e.arr);
		e.show(e.arr);
	}

}
