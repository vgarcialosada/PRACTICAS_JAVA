package E32;

public class Car {
	private int fuel = 0;
	private int maxSpeed = 1;

	public Car(int fuel, int maxSpeed) {
		super();
		this.fuel = fuel;
		this.maxSpeed = maxSpeed;
	}

	public void refuel(int num) {
		this.fuel = this.fuel + num;

	}
	
	public int getFuel() {
		return this.fuel;
	}

	public void setSpeed(int num) {
		this.maxSpeed = num;
	}

	public int getSpeed() {
		return this.maxSpeed;
	}

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	

}
