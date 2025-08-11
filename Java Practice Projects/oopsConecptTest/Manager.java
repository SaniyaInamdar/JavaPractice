package oopsConecptTest;

//Ek Manager class banao jo Employee ko extend kare:
//Extra property: teamSize
//super keyword ka use karke parent constructor call karo

public class Manager extends Employee implements Printable{
	private int teamsize;
	
	public Manager() {
	}

	public Manager(String name, int age, double salary,String department,int teamsize) {
		super(name,age,salary,department);
		setteamsize(teamsize);
	}
	
	
	public void setteamsize(int teamsize) {
		this.teamsize=teamsize;
	}
	public int getteamsize() {
		return teamsize;
	}
	@Override
	public void printdetails() {
		// TODO Auto-generated method stub
		System.out.println("Team size :"+getteamsize());
	}
	
}
