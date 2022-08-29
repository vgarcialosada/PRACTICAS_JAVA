package E39;

public class Main {

	public static void main(String[] args) {
		Car honda = new Car("Honda", 100);
		Car jeep = new Car("Jeep", 500);
		Car bmw = new Car("Bmw", 800);

		System.out.println("\n"+honda.displaySpeed()+
				"\n"+jeep.displaySpeed() +
				 "\n"+bmw.displaySpeed());
	}

}
