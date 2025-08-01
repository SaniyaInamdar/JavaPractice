package employee2usingCollections;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e=new Employee();
		e.accept();
		System.out.println(e.toString());
		e.show();
		
		Employee e1=new Employee();
		e1.accept();
		System.out.println(e.toString());
		e1.show();
		
		Employee e2=new Employee();
		e2.accept();
		System.out.println(e.toString());
		e2.show();
		
		Employee e3=new Employee();
		e3.accept();
		System.out.println(e.toString());
		e3.show();
		
		Employee e4=new Employee();
		e4.accept();
		System.out.println(e.toString());
		e4.show();
		
		
		System.out.println("=======List is========");
		for(Employee emp: Employee.list) {
			System.out.println(emp);
		}
	}

}
