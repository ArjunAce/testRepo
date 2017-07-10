package p1;
public class EmployeeBuilder {

	private String name;
	
	
	public EmployeeBuilder setName(String name) {
		this.name = name;
		return this;
	}
	
	private int ssoid;

	
	public EmployeeBuilder setSsoid(int ssoid) {
		this.ssoid = ssoid;
		return this;
	}

	private String gender;
	public EmployeeBuilder setGender(String gender) {
		this.gender = gender;
		return this;
	}
	public Employee getEmployee(){	
		return new Employee(ssoid,name,gender,age,projectid);
	}

}