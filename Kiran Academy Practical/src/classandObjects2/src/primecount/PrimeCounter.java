package primecount;


public class PrimeCounter {
	int i;
public void prime() {
	int countprime=0;
	for(i=235;i<=456;i++) {
		int count=0;
		for(int j=1;j<=i;j++) {
			if(i%j==0) {
				count++;
				
			}
		}
		if(count==2) {
			 countprime++;
		 }
		
	}
	 System.out.println("Count is "+ countprime);
	 
	 
	}
}
