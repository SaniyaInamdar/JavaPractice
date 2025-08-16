package array2;

import java.util.Scanner;

public class AscendingandDescending {
	int arr[]=new int[4];
	
	public void accept(int a[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an elements : ");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
	}
	
	public void show(int s[]) {
		for(int j=0;j<s.length;j++) {
			System.out.println(s[j]);
		}
	}
	
	
	
	public void ascending(int ascending[]) {
		System.out.println("Ascending Order : ");
		for(int i=0;i<ascending.length;i++) {
			for(int j=i+1;j<ascending.length;j++) {
				if(ascending[i]>ascending[j]) {
					int t= ascending[i];
					ascending[i]=ascending[j];
					ascending[j]=t;
				}
			}
		}
		show(ascending);
	}
	
	public void descending(int descending[]) {
		System.out.println("Descending Order : ");
		for(int i=0;i<descending.length;i++) {
			for(int j=i+1;j<descending.length;j++) {
				if(descending[i]<descending[j]) {
					int t=descending[i];
					descending[i]=descending[j];
					descending[j]=t;
				}
			}
		}
		show(descending);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AscendingandDescending aad=new AscendingandDescending();
		 aad.accept(aad.arr);
		 aad.ascending(aad.arr);
		 aad.descending(aad.arr);;
	}

}
