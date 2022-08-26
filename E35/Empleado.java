package E35;

public class Empleado extends Persona{
	private int tipoContrato = 0;
	private int sueldoBase = 1200;



	public  int calcularSueldo() {
		int tipo = this.getTipoContrato();
		int sueldo = this.getSueldo();
		switch (tipo) {
		case 0:
			sueldo = (int) (sueldo * 0.8);
			return sueldo;
		case 1:
			sueldo = (int) (sueldo);
			return sueldo;
		case 2:
			sueldo = (int) (sueldo * 1.2);
			return sueldo;
		default:
			return sueldo;
		}
	}



	public Empleado() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Empleado(String nombre, String apellido, String documento, int tipo,int tipoContrato) {
		super(nombre, apellido, documento, tipo);
		this.tipoContrato = tipoContrato;
	}


	public  int getTipoContrato() {
		return this.tipoContrato;
	}

	public  void setTipoContrato(int tipoContrato) {
		this.tipoContrato = tipoContrato;
	}

	public  int getSueldo() {
		return this.sueldoBase;
	}

	public  void setSueldo(int sueldo) {
		this.sueldoBase = sueldo;
	}

}
