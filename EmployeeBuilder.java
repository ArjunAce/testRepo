package p1;
public class EmployeeBuilder {
	private int age;
	private int ssoid;
	private String gender;
	
	public EmployeeBuilder setSsoid(int ssoid) {
		this.ssoid = ssoid;
		return this;
	}
	public EmployeeBuilder setAge(int age) {
		this.age = age;
		return this;
	}
	public EmployeeBuilder setGender(String gender) {
		this.gender = gender;
		return this;
	}
	public Employee getEmployee(){	
		return new Employee(ssoid,name,gender,age,projectid);
	}

}