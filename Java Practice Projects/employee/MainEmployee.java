package employee;

public class MainEmployee {
	public static void main(String[] args) {
		
		Person p=new Person("saniya",21);
		Employee e=new Employee();
		Employee e1=new Employee(1,20000);
		Department d=new ItDepartment();
		e.display();
		d.showDepartment();
		e.display("Pune");
		e.projectInfo();
		
	}
}
