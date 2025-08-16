package series;

public class Sriescode {
	
	
	//1  3  6  10   15  21
	//1  4  9  16  25  36
	//1  8  27  64  124  
	
	
	public void series1() {
	int num=10;
	for(int i=1;i<=num;i++) {
		int output=i*(i+1)/2;
		System.out.println(output);
		}
	}
	
	
	public void series2() {
		for(int i=1;i<=10;i++) {
			int output=i*i;
			System.out.println(output);
		}
	}
	
	public void series3() {
		for(int i=1;i<=10;i++) {
			int output=i*i*i;
			System.out.println(output);
		}
	}
}
