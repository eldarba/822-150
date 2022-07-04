package e;

public class Manager extends Employee {
	
	public String department;
	
	@Override
	public String getDetails() {
		return "Manager[name=" + name + ", salary=" + salary + ", department=" + department +  "]";
	}

}
