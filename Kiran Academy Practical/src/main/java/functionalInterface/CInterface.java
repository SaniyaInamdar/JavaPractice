package functionalInterface;

@FunctionalInterface
public interface CInterface {
	
	public void subtract(int a, int b);
	
	public default void ADefault() {
		System.out.println("I am default method in interface");
		BPrivate();
	}
	
	public static void AStatic() {
		System.out.println("I am Static Method in interface ");
	}
	
	private void BPrivate() {
		System.out.println("I am private method int interface which called in a default method");
	}
}
