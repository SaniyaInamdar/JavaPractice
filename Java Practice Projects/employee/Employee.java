package employee;

public class Employee extends Person implements ProjectDetails{
	private int employeeId;
	private double salary;
	
	public Employee() {
		
	}
	public Employee(int employeeId,double salary) {
		this.employeeId=employeeId;
		this.salary=salary;
		System.out.println(employeeId);
		System.out.println(salary);
	}

	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	@Override
	public void projectInfo() {
		// TODO Auto-generated method stub
		System.out.println("java developer");
	}
	
	public void display() {
		System.out.println("Employee Id : "+getEmployeeId());
		System.out.println("Salary  :"+getSalary());
	}
	
	public void display(String location) {
		System.out.println("Employee location :"+location);
	}
	
}
