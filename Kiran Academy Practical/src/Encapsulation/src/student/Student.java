package student;

import java.util.Scanner;

public class Student {
	private int id,m1,m2,m3,m4,m5;
	int total;
	double percentage;
	 String name,course,grade;
	public Student() {
		accept();
		total();
		percentage();
		grade();
		show();
	}
	
	public int getId() {
		return id;
	}
	public void setId(int Id) {
		Id=id;
	}
	
	
	public int getM1() {
		return m1;
	}
	public void setM1(int M1) {
		M1=m1;
	}
	
	
	public int getM2() {
		return m2;
	}
	public void setM2(int M2) {
		M2=m2;
	}
	
	
	public int getM3() {
		return m3;
	}
	public void setM3(int M3) {
		M3 = m3;
	}
	
	
	public int getM4() {
		return m4;
	}
	public void setM4(int M4) {
		M4=m4;
	}
	
	
	public int getM5() {
		return m5;
	}
	public void setM5(int M5) {
		M5=m5;
	}
	

	
	public void accept() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a ID : ");
		id=sc.nextInt();
		
		System.out.println("Enter a name : ");
		name=sc.next();
		
		System.out.println("Enter a Course name : ");
		course=sc.next();
		
		System.out.println("Enter a Marks of 1: ");
		m1=sc.nextInt();
		
		System.out.println("Enter a Marks of 2: ");
		m2=sc.nextInt();
		
		System.out.println("Enter a Marks of 3: ");
		m3=sc.nextInt();
		
		System.out.println("Enter a Marks of 4: ");
		m4=sc.nextInt();
		
		System.out.println("Enter a Marks of 5: ");
		m5=sc.nextInt();
		
		
		
	}
	
	public void total() {
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
		System.out.println("Student Details : ");
		
		System.out.println("Id "+id);
		System.out.println("name "+name);
		System.out.println("course "+course);
		System.out.println("m1 "+m1);
		System.out.println("m1 "+m2);
		System.out.println("m1 "+m3);
		System.out.println("m1 "+m4);
		System.out.println("m1 "+m5);
		
		System.out.println("Total is : "+total);
		System.out.println("Percentage is "+percentage);
		System.out.println("grade is  : "+grade);
		
	}

}
