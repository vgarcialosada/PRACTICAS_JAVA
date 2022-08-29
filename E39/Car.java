package E39;

public class Car {
	public String company;
	public int speed;
	
	public Car(String company, int speed) {
		super();
		this.company = company;
		this.speed = speed;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public String displaySpeed() {
		return this.company+" car speed is "+speed+ " km/h";
	}

}
