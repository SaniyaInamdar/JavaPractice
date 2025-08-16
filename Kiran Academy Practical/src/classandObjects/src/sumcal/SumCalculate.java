package sumcal;

public class SumCalculate {
			int sum;
	public void  sumcal(int start,int end) {
		//for(int i=start+1;i<end;i++) {
		for(int i=start;i<=end;i++) {
			sum=sum+i;
		}
//		System.out.println(sum);
	}
	
	public void show() {
		System.out.println(sum);
	}

}
