package book;

public class MainBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Book b1 = new Book();
	        Book b2 = new Book();

	        System.out.println("Enter details for Book 1:");
	        b1.accept();
	        b1.calculate();
	        b1.show();

	        System.out.println("\nEnter details for Book 2:");
	        b2.accept();
	        b2.calculate();
	        b2.show();
		
	}

}
