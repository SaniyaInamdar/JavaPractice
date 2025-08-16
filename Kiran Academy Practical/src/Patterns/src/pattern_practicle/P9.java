package pattern_practicle;

public class P9 {

	public static void main(String[] args) {
		int space=5;
		for(int r=1;r<=5;r++) {
			for(int k=1;k<=(space-r);k++) {                                                                                                   
				System.out.print(" ");
			}
				for(int c=1;c<=r;c++) {
					System.out.print("* ");
			}
				System.out.println(" ");
		}
	}

}
