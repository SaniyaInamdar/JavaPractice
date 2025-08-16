package ClassExample;

import java.util.Scanner;

public class StudentClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int age,m1, m2,m3,m4,m5,total;
         String ch;
         double percentage;
         
         Scanner sc= new Scanner(System.in);
         System.out.println("Enter Name : ");
         ch=sc.nextLine();
         
         System.out.println("Enter Age : ");
         age=sc.nextInt();
         sc.nextLine();
         
         System.out.println("Enter Math marks: ");
         m1=sc.nextInt();
         sc.nextLine();
         
         System.out.println("Enter English Marks: ");
         m2=sc.nextInt();
         sc.nextLine();
         
         System.out.println("Enter Marathi marks : ");
         m3=sc.nextInt();
         sc.nextLine();
         
         System.out.println("Enter Hindi Marks : ");
         m4=sc.nextInt();
         sc.nextLine();
         
         System.out.println("Enter Science Marks : ");
         m5=sc.nextInt();
         sc.nextLine();
         
         System.out.println("Your Name : "+ch);
       
         
         System.out.println("Your Age : "+age);
    
         
         System.out.println("Your Math marks: "+m1);
         
         
         System.out.println("Your English Marks: "+m2);
         
         
         System.out.println("Your Marathi marks : "+m3);
         
         
         System.out.println("Your Hindi Marks : "+m4);
         
         
         System.out.println("Your Science Marks : "+m4);
         
         
         total=m1+m2+m3+m4+m5;
         System.out.println("Total of Marks is : "+ total);
         
         percentage=(total*100)/500;
         System.out.println("Percentage is : "+ percentage);
         
         if(percentage>80) {
        	 System.out.println("Got a Grade A+");
         }
         else if(percentage<80 && percentage>60) {
        	 System.out.println("Got a Grade A");
         }
         else if(percentage<60 && percentage>50) {
        	 System.out.println("Got a Grade B+");
         }
         else if(percentage<50 && percentage>40) {
        	 System.out.println("Got a Grade B");
         }
         else if(percentage<40 && percentage>35) {
        	 System.out.println("Got a Grade C");
         }
         else {
        	 System.out.println(ch+" You are failed ! Dont worry try again ");
         }
         
         
         sc.close();
         
	}

}
