package pattern_practicle;

public class P11 {

	public static void main(String[] args) {
		char ch='e';
		for(int r=5;r>=1;r--) {
			ch='e';
			for(int c=5;c>=1;c--) {
				System.out.print((ch--)+" ");
			}
			System.out.println(" ");
		}
	}

}
