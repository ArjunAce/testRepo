package p1;
public class EmployeeBuilder {
	private int age;
	
	public EmployeeBuilder setAge(int age) {
		this.age = age;
		return this;
	}
}