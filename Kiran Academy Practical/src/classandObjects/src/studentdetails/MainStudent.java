package studentdetails;

public class MainStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentDetails sd=new StudentDetails();
		sd.accept();
		sd.calculatemarks();
		sd.percentage();
		sd.grade();
		sd.show();
	}

}
