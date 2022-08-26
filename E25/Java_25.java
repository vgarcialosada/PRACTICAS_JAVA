package E25;

import java.util.ArrayList;

public class Java_25 {
	public static void main(String[] args) {
		ArrayList<Numeral> numeralsList = new ArrayList<Numeral>();
		// Añadiendo peliculas al arrayList
		numeralsList.add(new Numeral("byte", "-128","127",1,8));
		numeralsList.add(new Numeral("short", "-32768","32767",2,16));
		numeralsList.add(new Numeral("int", "-2147483648","2147483647",4,32));
		numeralsList.add(new Numeral("long", "-9223372036854775808","9223372036854775807",4,64));
		numeralsList.add(new Numeral("float", "±1.4E-45","±3.4028235E+38",4,32));
		numeralsList.add(new Numeral("double", "±4.9E-324","±1.7976931348623157E+308",8,64));


		System.out.printf("%20s%20s%20s%20s%20s%n", "Nombre ", "Min", "Max","Nbites","Nbits");
		System.out.println("\t"+"-".repeat(100));
		for (Numeral numeral : numeralsList) {
			System.out.printf("%20s%20s%20s%20s%20s%n", numeral.nombre, numeral.min, numeral.max, numeral.nbites, numeral.nbits);
		}
	}

	public static class Numeral {
		String nombre = "";
		String min ="";
		String max ="";
		int nbites=0;
		int nbits=0;
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public String getMin() {
			return min;
		}
		public void setMin(String min) {
			this.min = min;
		}
		public String getMax() {
			return max;
		}
		public void setMax(String max) {
			this.max = max;
		}
		public int getNbites() {
			return nbites;
		}
		public void setNbites(int nbites) {
			this.nbites = nbites;
		}
		public int getNbits() {
			return nbits;
		}
		public void setNbits(int nbits) {
			this.nbits = nbits;
		}
		public Numeral(String nombre, String min, String max, int nbites, int nbits) {
			super();
			this.nombre = nombre;
			this.min = min;
			this.max = max;
			this.nbites = nbites;
			this.nbits = nbits;
		}
		
		
		

		
	}
}