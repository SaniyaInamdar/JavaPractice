package pattern_practicle;

public class P7 {

	public static void main(String[] args) {
		char ch='a';
		for(int r=1;r<=5;r++) {
			ch='a';
			for(int c=1;c<=r;c++) {
				System.out.print((ch++)+" ");
			}
			System.out.println(" ");
		}
	}

}
