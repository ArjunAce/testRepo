package p1;
public class EmployeeBuilder {

	private String gender;
	private int age;


	public EmployeeBuilder setGender(String gender) {
		this.gender = gender;
		return this;
	}
	public EmployeeBuilder setAge(int age) {
		this.age = age;
		return this;
	}

}