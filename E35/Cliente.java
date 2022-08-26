package E35;

import java.util.Random;

public class Cliente extends Persona {

	private int categoria = 0;
	private int codigo = generarCodigo();

	public Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cliente(String nombre, String apellido, String documento, int tipo, int categoria) {
		super(nombre, apellido, documento, tipo);
		// TODO Auto-generated constructor stub
	}

	public int generarCodigo() {
		Random rn = new Random();
		codigo = rn.nextInt(1000000);
		this.setCodigo(codigo);
		return codigo;
	}

	public String getCategoria() {
		if (this.categoria == 0) {
			return "Cliente no registrado";
		} else {
			return "Cliente registrado";
		}
	}

	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
}
