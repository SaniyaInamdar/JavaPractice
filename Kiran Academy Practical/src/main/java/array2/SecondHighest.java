package array2;

import java.util.Scanner;

public class SecondHighest {
	int arr[]=new int[4];
	
	public void accept() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an elements : ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
	}
	
	public void descending() {
		System.out.println("Descending order : ");
		for(int j=0;j<arr.length;j++) {
			for(int k=j+1;k<arr.length;k++) {
				if(arr[j]<arr[k]) {
					int temp = arr[j];
					arr[j]=arr[k];
					arr[k]=temp;
				}
			}
		}
	}
	
	public void ascending() {
		System.out.println("Ascending order : ");
		for(int j=0;j<arr.length;j++) {
			for(int k=j+1;k<arr.length;k++) {
				if(arr[j]>arr[k]) {
					int temp = arr[j];
					arr[j]=arr[k];
					arr[k]=temp;
				}
			}
		}
	}
	
	public void normal() {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	
	public void secondhighest() {
		System.out.println("Second highest : ");
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			max=arr[1];
		}
		System.out.println(max);
	}

	
	public void secondlowest() {
		System.out.println("Second lowest : ");
		int min=arr[0];
		for(int i=0;i<arr.length;i++) {
			min=arr[1];
		}
		System.out.println(min);
	}
	public static void main(String[] args) {
		SecondHighest sh=new SecondHighest();
		sh.accept();
		sh.descending();
		sh.normal();
		sh.secondhighest();
		sh.accept();
		sh.ascending();
		sh.normal();
		sh.secondlowest();
	
	}
}
