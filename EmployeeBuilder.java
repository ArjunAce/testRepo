package p1;
public class EmployeeBuilder {
	private int age;
	private String gender;
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