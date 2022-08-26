package E38;

public class Alumno implements Persona{
public String nombre= "";
public int curso = 0;

	public int getCurso() {
	return curso;
}

public Alumno(String nombre, int curso) {
		super();
		this.nombre = nombre;
		this.curso = curso;
	}

public void setCurso(int curso) {
	this.curso = curso;
}

	@Override
	public String getNombre() {
return this.nombre;		
	}

	@Override
	public void setNombre(String nombre) {
this.nombre=nombre;		
	}

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", curso=" + curso + "]";
	}

}
