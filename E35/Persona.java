package E35;

public abstract class Persona {

	private String nombre = "";
	private String apellido = "";
	private String documento = "";
	private int tipo = 0; // 0 cliente, 1 empleado

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public String getTipo() {
		if (this.tipo == 0) {
			return "Cliente";
		} else {
			return "Empleado";
		}
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public Persona() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Persona(String nombre, String apellido, String documento, int tipo) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.documento = documento;
		this.tipo = tipo;
	}

}
