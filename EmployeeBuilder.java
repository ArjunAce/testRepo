package p1;
public class EmployeeBuilder {
	private int age;

	private int projectid;
	private int ssoid;
	private String gender;
	
	public EmployeeBuilder setProjectid(int projectid) {
		this.projectid = projectid;
		return this;
	}
	

	private String name;
	
	
	public EmployeeBuilder setName(String name) {
		this.name = name;
		return this;
	}
	
	private int ssoid;

	

	}	

	public EmployeeBuilder setSsoid(int ssoid) {
		this.ssoid = ssoid;
		return this;
	}
	public EmployeeBuilder setAge(int age) {
		this.age = age;
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