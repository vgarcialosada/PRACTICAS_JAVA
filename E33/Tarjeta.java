package E33;

import java.sql.Date;

public class Tarjeta {
	private int numero = 0;
	private int saldo = 1000;
	private String titular = "";
	private String entidad_bancaria = "";
	private Date fecha_caducidad;
	private boolean status = false;

	public Tarjeta(int numero, String titular, String entidad_bancaria, Date fecha_caducidad) {
		super();
		this.numero = numero;
		this.saldo = 1000;
		this.titular = titular;
		this.entidad_bancaria = entidad_bancaria;
		this.fecha_caducidad = fecha_caducidad;
		this.status = false;
	}

	public Tarjeta() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public String getEntidad_bancaria() {
		return entidad_bancaria;
	}

	public boolean getStatus() {
		return status;
	}

	public void setEntidad_bancaria(String entidad_bancaria) {
		this.entidad_bancaria = entidad_bancaria;
	}

	public Date getFecha_caducidad() {
		return fecha_caducidad;
	}

	public void setFecha_caducidad(Date fecha_caducidad) {
		this.fecha_caducidad = fecha_caducidad;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public void activarTarjeta() {
		this.setStatus(true);
	}

	public void anularTarjeta() {
		this.setStatus(false);
	}

	public void pagarConTarjeta(int pago) {
		int saldo=this.saldo;
		if (this.status) {
			System.out.println("Tarjeta activa. \n Saldo:" + saldo + "\n Pago: " + pago + "\n");
			if(pago>saldo) {
				System.out.println("\nSaldo insufciente. Pago denegado");
			}else {
				this.saldo=saldo-pago;
				System.out.println("\nPago realizado. Saldo restante: "+ this.saldo+"\n");
			}

		} else {
			System.out.println("\nTarjeta no activa. Pago denegado.\n");
		}
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
}
