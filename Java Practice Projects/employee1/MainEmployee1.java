package employee1;

import java.util.Scanner;

public class MainEmployee1 {
	
	static Employee arr[]= new Employee[1];
	static Scanner sc =new Scanner(System.in);

			
		public static void add() {
			for(int i=0;i<arr.length;i++) {
				Employee e=new Employee();
			System.out.println("Enter Id : ");
			e.setId(sc.nextInt());
			System.out.println("Enter Post : ");
			e.setPost(sc.next());
			System.out.println("Enter Department : ");
			e.setDepartment(sc.next());
			System.out.println("Enter salary : ");
			e.setSalary(sc.nextInt());
			arr[i]=e;
			}
		}
		
		public static void show() {
			for(int i=0;i< arr.length;i++) {
				
			System.out.println("Id : "+ arr[i].getId());
			System.out.println("Post : "+arr[i].getPost());
			System.out.println("Department : "+arr[i].getDepartment());
			System.out.println("Salary : "+arr[i].getSalary());
			}
		}
		
		public static void delete() {
			System.out.println("Enter id to delete");
			int deleteId=sc.nextInt();
			for(int i=0;i<=arr.length;i++) {
				if(arr[i].getId()==deleteId) {
					
				}
			}
		}
		
		public static void update() {
			System.out.println("Enter id to update : ");
			int updateId =sc.nextInt();
			for(int i=0;i<arr.length;i++) {
				if(arr[i].getId()==updateId) {
					System.out.println("Enter post : ");
					arr[i].setPost(sc.next());
					System.out.println("Enter department : ");
					arr[i].setDepartment(sc.next());
					System.out.println("Enter salary : ");
					arr[i].setSalary(sc.nextInt());
				}
				else {
					System.out.println("Id not founded ");
				}
			}
			System.out.println("Updated Succefully");
		}
		
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add();
		show();
		update();
		show();
	}

}
