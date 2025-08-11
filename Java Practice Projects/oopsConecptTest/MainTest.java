package oopsConecptTest;

	//MainTest class banao jisme:
	//Encapsulation ka use karke fields access karo
	//Polymorphism ka example do (Person ref = new Employee();)
	//Objects create karke methods call karo.

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee ref= new Employee();
		ref.setage(21);
		ref.setname("saniya");
		ref.setdepartment("It");
		ref.setsalary(50000);
		ref.displayInfo();
		
		Employee ref2= new Employee("Saniya",21,50000,"ITDepartment");
		ref2.displayInfo();
		
		Manager ref3=new Manager();
		ref3.setteamsize(5);
		ref3.printdetails();
		
		Manager ref4=new Manager("Sara",16,50000,"Teaammanager",5);
		ref4.displayInfo();
	}

}
