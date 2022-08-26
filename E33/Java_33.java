package E33;
import java.sql.Date;

public class Java_33 {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		//creamos tarjetas
		Tarjeta t1= new Tarjeta(50,"pepe","LaCaixa",new Date(2,2,1999));
		Tarjeta t2= new Tarjeta(100,"pepe","LaCaixa",new Date(2,2,2000));
		t1.activarTarjeta();
		t1.pagarConTarjeta(25);
		t1.pagarConTarjeta(2000);
		t1.anularTarjeta();
		
		t2.pagarConTarjeta(10);
		t2.activarTarjeta();
		t2.pagarConTarjeta(500);
	}

}
