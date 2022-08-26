package E34;

public class Employee {
	private static float salary = 1200;

	public Employee() {
		super();
	}
	public Employee(float salary) {
		super();
		Employee.salary = salary;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		Employee.salary=salary;
	}
}
