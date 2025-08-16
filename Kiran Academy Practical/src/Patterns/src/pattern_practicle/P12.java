package pattern_practicle;

public class P12 {

	public static void main(String[] args) {
		for(int c=1;c<=5;c++) {
			for(int r=1;r<=5;r++) {
				if((c==3)||(r==3)) {
					System.out.print("# ");
				}
				else {
					System.out.print("* ");
				}
			}
			System.out.println(" ");
		}

	}

}
