package E32;

import java.util.Random;

public class Java_32 {
	public static void main(String[] args) {
		Car[] coches= {new Car(0, 0),new Car(0, 0),new Car()};
		for (Car car : coches) {
			Random rn1 = new Random();
			Random rn2 = new Random();
			int rand1=rn1.nextInt(100 - 0 + 1);
			int rand2=rn2.nextInt(100 - 0 + 1);
			car.setSpeed(rand1);
			car.refuel(rand2);
			System.out.println(car.getFuel());
			System.out.println(car.getSpeed());
		}
		
	
	}

	

}
