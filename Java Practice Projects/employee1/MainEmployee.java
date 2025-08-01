package employee1;
//-: create a class EmployeeTest 
//- show option to user 
//	1. Add Employee 
//	2. Show Specific Employee - by Id 
//	3. Show All Employee Data 
//	4. Update Salary - by Id 
//	5. Delete Specific employee - by ID 
//	6. Exit 
//- define a method to above option 
//- define main() method 

import java.util.Scanner;

public class MainEmployee {
	public static void main(String[] args) {
	
		EmployeeTest arr[]=new EmployeeTest[100];
		
		int num;
		int count=0;
		
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Your Choice : ");
			System.out.println();
			System.out.println("1 . Add Employee ");
			System.out.println("2 . View All Employee ");
			System.out.println("3 . View Specific Employee ");
			System.out.println("4 . Update Employee salary ");
			System.out.println("5 . Delete Specifc Employee ");
			System.out.println("6 . Exit ");
			num=sc.nextInt();
			
			switch(num) {
			
			case 1: System.out.println("How many Employee you want to insert ");
					 int accept=sc.nextInt();
					 for(int i=0;i<accept;i++) {
						 arr[count]=new EmployeeTest();
						 arr[count].accept();
						 count++;
					 }
					 break;
					 
			case 2: for(int i=0;i<count;i++) {
						arr[i].show();
					}
					break;
					
			case 3:System.out.println("Enter id to show detials of that employee : ");
					int id=sc.nextInt();
					for(int i=0;i<count;i++) {
						if(arr[i].getId()==id) {
							arr[i].show();
						}
						else {
							System.out.println("Not found");
						}
					}
					
					break;
					
			case 4: System.out.println("Enter Id to update : ");
					int updateid=sc.nextInt();
					for(int i=0;i<count;i++) {
						if(arr[i].getId()==updateid) {
							System.out.println("Enter new salary : ");
							int newsalary=sc.nextInt();
							arr[i].setSalary(newsalary);
							System.out.println("Salary updated");
						}
							else {
								System.out.println("Not found");
								}
							}
						break;
						
			case 5: break;
			
			case 6 : System.out.println("Program terminated "); break;
			
			default : System.out.println("Wrong choice ");
 			}
		}while(num!=6);
		
	}
}
