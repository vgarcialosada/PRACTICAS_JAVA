package E36;

public abstract class Empleado {
public Empleado(String nombre) {
		super();
		this.nombre = nombre;
	}

public String nombre;

@Override
public String toString() {
	return "Empleado [nombre=" + nombre + "]";
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}



}
