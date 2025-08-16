package studentdetails;

import java.util.Scanner;

public class StudentDetails {
	
		String name,grade;
		int id,age,rollno,m1,m2,m3,m4,m5,total;
		long contactno;
		double percentage;
		
		public void accept() {
			
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter id : ");
		id=sc.nextInt();
		
		System.out.println("Enter name : ");
		name=sc.next();
		
		System.out.println("Enter age : ");
		age=sc.nextInt();

		System.out.println("Enter Rool no : ");
		rollno=sc.nextInt();
		
		System.out.println("Enter Contact No : ");
		contactno=sc.nextLong();
		
		System.out.println("Enter Marks 1 : ");
		m1=sc.nextInt();
		
		System.out.println("Enter Marks2 : ");
		m2=sc.nextInt();
		
		System.out.println("Enter Marks 3 : ");
		m3=sc.nextInt();
		
		System.out.println("Enter Marks 4 : ");
		m4=sc.nextInt();
		
		System.out.println("Enter Marks 5 : ");
		m5=sc.nextInt();
		
		
		sc.close();
	}
		
		public void calculatemarks() {
			total=m1+m2+m3+m4+m5;
		}
		
		public void percentage() {
			percentage=(total*100)/500;
		}
		
		public void grade() {
		    if (percentage >= 85 && percentage <= 100) {
		        grade = "A+";
		    } 
		    else if (percentage >= 70 && percentage < 85) {
		        grade = "A";
		    }
		    else if (percentage >= 55 && percentage < 70) {
		        grade = "B+";
		    } 
		    else if (percentage >= 45 && percentage < 55) {
		        grade = "B";
		    }
		    else if (percentage >= 40 && percentage < 45) {
		        grade = "C";
		    }
		    else if (percentage >= 35 && percentage < 40) {
		        grade = "D";
		    } 
		    else {
		        grade = "F (Fail)";
		    }
		}

		
		public void show() {
			System.out.println("Your ID is : "+ id);
			System.out.println("Your name is : "+ name);
			System.out.println("Your age is : "+ age);
			System.out.println("Your rollno is : "+ rollno);
			System.out.println("Your contactno is : "+ contactno);
			System.out.println("Marks of Subject 1 is : "+m1);
			System.out.println("Marks of Subject 2 is : "+m2);
			System.out.println("Marks of Subject 3 is : "+m3);
			System.out.println("Marks of Subject 4 is : "+m4);
			System.out.println("Marks of Subject 5 is : "+m5);
			System.out.println("Total of this marks is : "+total);
			System.out.println("Percentage of this marks is : "+percentage);
			System.out.println("You Got "+grade+" Grade");
		}
		
		
		
		
		
}
