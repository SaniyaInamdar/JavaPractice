package array2;

import java.util.Scanner;

public class AscendingDescending {

	int arr[]=new int[4];
	
	public void accept(int a[]) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter an elements : ");
		for(int k=0;k<a.length;k++) {
			a[k]=sc.nextInt();
		}
	}
	
	public void show1(int s[]) {
		System.out.println("Normal Array");
		for(int j=0;j<s.length;j++) {
			System.out.println(s[j]);
		}
	}
	public void show(int s[]) {
		for(int j=0;j<s.length;j++) {
			System.out.println(s[j]);
		}
	}
	
	public void show2(int s[]) {
		int sh=s[0];
		System.out.println("Second Highest");
		for(int j=0;j<s.length;j++) {
			sh=s[1];
		}
		System.out.println(sh);
	}
	
	public void show3(int s[]) {
		int sl = s[0];
		System.out.println("Second Lowest");
		for (int j = 0; j < s.length; j++) {
			sl = s[1];  
		}
		System.out.println(sl);
	}
	
	public void ascending(int asc[]) {
		System.out.println("Ascending order : ");
		for(int i=0;i<asc.length;i++) {
			for(int j=i+1;j<asc.length;j++) {
				if(asc[i]>asc[j]) {
					int t=asc[i];
					asc[i]=asc[j];
					asc[j]=t;
				}
			}
		}
		show(asc);
	}
	
	public void descending(int asc[]) {
		System.out.println("Descending order : ");
		for(int i=0;i<asc.length;i++) {
			for(int j=i+1;j<asc.length;j++) {
				if(asc[i]<asc[j]) {
					int t=asc[i];
					asc[i]=asc[j];
					asc[j]=t;
				}
			}
		}
		show(asc);
	}
	
	
	public void max(int m[]) {
		System.out.println("Maximum of array");
		int max=m[0];
		for(int i=0;i<m.length;i++) {
			if(max<m[i]) {
			max=m[i];
			}
		}
		System.out.println(max);
	}
	
	
	public void min(int m[]) {
		System.out.println("Minimum of array");
		int max=m[0];
		for(int i=0;i<m.length;i++) {
			if(max>m[i]) {
			max=m[i];
			}
		}
		System.out.println(max);
	}
	
	public void secondhighest(int h[]) {
		for(int i=0;i<h.length;i++) {
			for(int j=i+1;j<h.length;j++) {
				if(h[i]<h[j]) {
					int t=h[i];
					h[i]=h[j];
					h[j]=t;
				}
			}
		}
		show2(h);
	}

	public void secondlowest(int l[]) {
		for(int i=0;i<l.length;i++) {
			for(int j=i+1;j<l.length;j++) {
				if(l[i]>l[j]) {
					int t=l[i];
					l[i]=l[j];
					l[j]=t;
				}
			}
		}
		show3(l);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AscendingDescending ad=new AscendingDescending();
		ad.accept(ad.arr);
		ad.show1(ad.arr);
		ad.ascending(ad.arr);
		ad.descending(ad.arr);
		ad.min(ad.arr);
		ad.max(ad.arr);
		ad.show2(ad.arr);
		ad.show3(ad.arr);
	}
}
