package E34;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Employee employee1=new Employee();
		float basesalary=employee1.getSalary();
		System.out.println(basesalary);
		
		Employee.setSalary(employee1,1500);
		System.out.println(employee1.getSalary());
		
		
		Programmer employee2= new Programmer();
		System.out.println(employee2.getProgrammerSalary());
		employee2.setBonus(750);
		System.out.println(employee2.getProgrammerSalary());

		
		
	}

}
