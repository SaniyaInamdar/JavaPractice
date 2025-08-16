package highest;

public class HighestCal {
		public void displayhighest(int a, int b) {
			if(a>b) {
				System.out.println(a);
			}
			else {
				System.out.println(b);
			}
		}
		
		public void displaytwohighest(int a, int b,int c,int d) {
			if(a>b||a>b||a>c||a>d) {
				System.out.println(a);
			}
			else if(b>c||b>d){
				System.out.println(b);
			}
			else if(c>d){
				System.out.println(c);
			}
			else {
				System.out.println(d);
			}
		}
}
