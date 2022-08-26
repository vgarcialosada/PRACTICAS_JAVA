package E38;

public class Profesor implements Persona {
	public String nombre = "";
	public int salario = 1000;

	public Profesor(String nombre, int salario) {
		super();
		this.nombre = nombre;
		this.salario = salario;
	}

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}

	@Override
	public String getNombre() {
		return this.nombre;
	}

	@Override
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Profesor [nombre=" + nombre + ", salario=" + salario + "]";
	}

}
