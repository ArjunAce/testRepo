package p1;
public class EmployeeBuilder {
<<<<<<< HEAD
	
	private int projectid;

	
	
	public EmployeeBuilder setProjectid(int projectid) {
		this.projectid = projectid;
		return this;
	}
	
=======
	private String gender;
	public EmployeeBuilder setGender(String gender) {
		this.gender = gender;
		return this;
	}
	public Employee getEmployee(){	
		return new Employee(ssoid,name,gender,age,projectid);
	}
>>>>>>> 831fc0f1401cf740df1ce5e86050d72d018bcfd7
}