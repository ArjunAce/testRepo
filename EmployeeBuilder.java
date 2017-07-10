package p1;
public class EmployeeBuilder {
<<<<<<< HEAD
<<<<<<< HEAD
	
	private int projectid;

	
	
	public EmployeeBuilder setProjectid(int projectid) {
		this.projectid = projectid;
		return this;
	}
	
=======
=======

	private int ssoid;

	
	public EmployeeBuilder setSsoid(int ssoid) {
		this.ssoid = ssoid;
		return this;
	}

>>>>>>> c4655c2c094c33910fae2fbbd55af5b56ba5a207
	private String gender;
	public EmployeeBuilder setGender(String gender) {
		this.gender = gender;
		return this;
	}
	public Employee getEmployee(){	
		return new Employee(ssoid,name,gender,age,projectid);
	}
<<<<<<< HEAD
>>>>>>> 831fc0f1401cf740df1ce5e86050d72d018bcfd7
=======

>>>>>>> c4655c2c094c33910fae2fbbd55af5b56ba5a207
}