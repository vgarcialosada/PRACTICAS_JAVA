package E40;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce tu nombre");
		String name = sc.nextLine();
		System.out.println("Edad:");
		int num= sc.nextInt();
		System.out.println("true or false");
		boolean bool = sc.nextBoolean();
		
		
		System.out.println("Nombre: "+name
				+"\n Edad: "+num+
				"\n Boolean: "+bool);
	}

}
