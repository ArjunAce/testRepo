package p1;
public class EmployeeBuilder {

	private String name;
	
	
	public EmployeeBuilder setName(String name) {
		this.name = name;
		return this;
	}
	
}