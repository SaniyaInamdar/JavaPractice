package array1;

import java.util.Scanner;

public class ProductofEven {
	int arr[]=new int[10];
	
	public void accept(int a[]) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Elemnts  : ");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
	}
	
	public void show(int s[]) {
		int product;
		System.out.println("Product of even : ");
		for(int j=0;j<=s.length;j++) {
			if(s[j]%2==0) {
				product=s[j]*s[j];
				System.out.println(product);
			}
		}
	}
	
	public static void main(String[] args) {
		ProductofEven p=new ProductofEven();
		p.accept(p.arr);
		p.show(p.arr);
	}
}
