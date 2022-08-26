package E31;

public class Java_31 {

	public static String[] tecnologies = { "Markdown", "Regexp", "HTML", "CSS", "JS", "SQL", "Java" };
	static int num = -1;
	public static String sup = "supercalifragilisticoespialidoso";
	public static String palabraInvertida = "";

	public static void main(String[] args) {
		recorrerArray(tecnologies);

		setCounter(-1);
		buscarHtml(tecnologies);

		setCounter(1);
		fibonacci(213213213);

		setCounter(-1);
		invertirPalabra(sup);

		setCounter(0);
		sumarNumeros(124127);
	}

	public static void recorrerArray(String[] recorrer) {
		num++;
		if (num != recorrer.length) {
			System.out.println(recorrer[num]);
			recorrerArray(recorrer);
		} else {
			separador();
		}
	}

	public static void buscarHtml(String[] recorrer) {
		num++;
		if (recorrer[num] != "HTML") {
			System.out.println(recorrer[num]);
			buscarHtml(recorrer);
		} else {
			System.out.println(recorrer[num]);
			separador();
		}
	}

	public static void fibonacci(int n) {
		if (num == 1) {
			System.out.println(num);
		}
		if (num + num < n) {
			num = num + num;
			System.out.println(num);
			fibonacci(n);
		} else
			separador();
	}

	public static void invertirPalabra(String toInvert) {
		int length = toInvert.length();
		num++;
		if (num < length) {
			palabraInvertida += toInvert.charAt(length - num - 1);
			invertirPalabra(toInvert);
		} else {
			System.out.println(palabraInvertida);
			separador();
		}
	}

	public static void sumarNumeros(int n) {      
		if (n > 0) {
			System.out.print(n % 10 + "+");      
			num = num + (n % 10);               
			n = n / 10;
			sumarNumeros(n);
		} else {
			System.out.println("=" + num);
		}
	}

	// utilities
	public static void separador() {
		System.out.println("-".repeat(10));
	}

	public static void setCounter(int n) {
		num = n;
	}

}