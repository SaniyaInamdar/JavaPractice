package constructorA;

public class PracticeConstructor {
	
	 public PracticeConstructor() {
		System.out.println("This is a constructor");
		Student();
	}
	 public PracticeConstructor(int a) {
		 System.out.println("This ais a parameterized constructor "+a);
	 }
	 public PracticeConstructor(String a) {
		 System.out.println("This ais a parameterized constructor "+a);
	 }
	 public PracticeConstructor(int a,String b) {
		 System.out.println("This ais a parameterized constructor "+a+" "+b);
	 }
	public void Student() {
		System.out.println("This is not a constructor");
		}
}
