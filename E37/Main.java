package E37;

public class Main {

	public static void main(String[] args) {
	Planta p1 = new Planta();
	p1.alimentarse();
	
	AnimalCarnivoro leon= new AnimalCarnivoro();
	leon.alimentarse();
	
	AnimalHerbivoro conejo = new AnimalHerbivoro();
	conejo.alimentarse();
		
	}
}
