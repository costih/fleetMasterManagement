package fleetMasterManagement;

public class Employee extends Person {
	private double salary;
	private String role;
	//private String [] roles = {"trucker","manager","mechanic"};
	
	
	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		if(salary>0)this.salary = salary;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

}
