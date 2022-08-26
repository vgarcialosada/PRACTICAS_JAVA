package E36;

public class Operario extends Empleado
{
	public Operario(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Operario [nombre=" + nombre + ", toString()=" + super.toString() + ", getNombre()=" + getNombre()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}


}
