package E38;

public class Main {

	public static void main(String[] args) {
Alumno a1= new Alumno("pepe",2);
Profesor p1= new  Profesor("Profe",1000);
System.out.println(a1.toString());
System.out.println(p1.toString());

a1.setNombre("Manuel");
p1.setSalario(1);

System.out.println(a1.toString());
System.out.println(p1.toString());

	}

}
