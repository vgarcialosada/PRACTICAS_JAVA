package E36;

public class Directivo extends Empleado{

	@Override
	public String toString() {
		return "Directivo [nombre=" + nombre + ", toString()=" + super.toString() + ", getNombre()=" + getNombre()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

	public Directivo(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}
}
