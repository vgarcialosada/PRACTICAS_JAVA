package E36;

public class Oficial extends Operario{

	@Override
	public String toString() {
		return "Oficial [nombre=" + nombre + ", toString()=" + super.toString() + ", getNombre()=" + getNombre()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

	public Oficial(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}


}
