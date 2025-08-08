package studentArrayList;



public class Student {
	private int id;
	private String name;
	private int rollno;
	int count=0;

	

	@Override
	public String toString() {
		return "[Student Info:   "+getId()+" "+ getRollno()+" "+getName()+" "+"]";
	}
	public void setId(int id) {
		this.id=id;
	}
	public int getId() {
		return id;
	}
	public void setRollno(int rollno) {
		this.rollno=rollno;
	}
	public int getRollno() {
		return rollno;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	
	
	
}
