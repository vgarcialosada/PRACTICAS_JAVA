package E34;

public class Employee {
	private float salary = 1200;

	public Employee() {
		super();
	}
	public Employee(float salary) {
		super();
		this.salary = salary;
	}
	public float getSalary() {
		return salary;
	}
	public static void setSalary(Employee x , float salary) {
		x.salary=salary;
	}
}
