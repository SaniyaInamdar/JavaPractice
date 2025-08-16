package pattern_practicle;

public class P2 {

	public static void main(String[] args) {
		char ch='A';
	   for(int r=1;r<=5;r++) {
		   ch='A';
		   for(int c=1;c<=5;c++) {
			   System.out.print((ch++)+" ");
		   }
		   System.out.println(" ");
	   }

	}

}
