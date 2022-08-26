package E30_1;
import E30_2.HolaMundo;
public class Main {
	public static void main(String[] args) {
		//llamar funcion mediante import
	System.out.println(HolaMundo.saludar());
	
	//llamar funcion mediante ruta
	String patada=E30_2.HastaNunqui.patada();
	System.out.println(patada);
	
	//otra solucion sería importar todo el package (import E30_2)
	}

}
