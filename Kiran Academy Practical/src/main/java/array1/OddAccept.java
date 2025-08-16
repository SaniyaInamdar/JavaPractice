package array1;

import java.util.Scanner;

public class OddAccept {
	
	int arr[]=new int[5];
	
	public void accept(int a[]) {
		System.out.println("Enter Elements : ");
		Scanner sc=new Scanner(System.in);
		int i=0;
		while(i<a.length) {
			int num=sc.nextInt();
			if(num%2!=0) {
				a[i]=num;
				i++;
			}
			else {
				System.out.println("Not an odd number ");
			}
		}
	}
	
	
	public void show(int s[]){
		System.out.println("Odd elemnts : ");
		
		for(int j=0;j<s.length;j++) {
			System.out.println(s[j]);
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OddAccept o=new OddAccept();
		o.accept(o.arr);
		o.show(o.arr);
	}

}
