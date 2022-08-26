package E34;

public class Programmer extends Employee {

	private int bonus = 500;

	public Programmer() {
		super();
	}

	public Programmer(int bonus) {
		super();
		this.bonus = (int) bonus;
	}

	public float getProgrammerSalary() {
		return this.getSalary()+bonus;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
}
