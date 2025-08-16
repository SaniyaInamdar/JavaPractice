package primecount;


//public class PrimeCounter {
//	int i;
//public void prime() {
//	int countprime=0;
//	for(i=235;i<=456;i++) {
//		int count=0;
//		for(int j=1;j<=i;j++) {
//			if(i%j==0) {
//				count++;
//				
//			}
//		}
//		if(count==2) {
//			 countprime++;
//		 }
//		
//	}
//	 System.out.println("Count is "+ countprime);
//	 
//	}
//}

public class PrimeCounter {
public void Prime() {
	int start=235,end=456,count=0,pc=0;
	while(end>=start) {
		for(int i=1;i<=start;i++) {
			if(i%start==0){
				count++;
			}
		}
		if(count==2) {
			pc++;
		}
		
	}
	System.out.println(pc);
	
}
}
