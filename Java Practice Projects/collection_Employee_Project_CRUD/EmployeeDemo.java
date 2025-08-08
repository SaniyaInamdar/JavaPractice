package collection_Employee_Project_CRUD;

import java.util.Iterator;
import java.util.Scanner;

public class EmployeeDemo {
//insert.update.delete.search.show.exit 
//auto generate person employee id
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int choice;
		do {
			Scanner sc=new Scanner(System.in);
			System.out.println("1. Insert");
			System.out.println("2. Update");
			System.out.println("3. Delete");
			System.out.println("4. Search");
			System.out.println("5. Show");
			System.out.println("6. Exit");
			choice= sc.nextInt();
			
			switch(choice) {
				case 1: Employee e=new Employee();
						e.accept();
						Employee.list.add(e);
						break;
			
				case 2: 
					
						break;
			
				case 3: int deleteId;
						System.out.println("Enter id to delete ");
						deleteId=sc.nextInt();
						Iterator<Employee> print=Employee.list.iterator();
						while(print.hasNext()) {
							Employee emp=print.next();
							if(emp.getId()==deleteId) {
								print.remove();
							}
						}
						break;
			
				case 4: int searchId;
						System.out.println("Enter Id to search");
						searchId=sc.nextInt();
						for(Employee emp: Employee.list) {
							if(emp.getId()==searchId) {
								emp.show();
							}
						}
						
						break;
			
				case 5: 
						for(Employee emp:Employee.list) {
							emp.show();
							System.out.println(emp.toString());
						}
					
						break;
			
				case 6: System.out.println("Program Exited"); break;
			
				default: System.out.println("Wrong Choice");;
			}
			
		}while(choice!=6);
	}

}
