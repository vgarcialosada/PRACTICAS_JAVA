package E29;

import java.util.ArrayList;

public class Java_29 {
	public static void main(String[] args) {
		ArrayList<Alumno> alumnosList = new ArrayList<Alumno>();
		// Añadiendo peliculas al arrayList
		alumnosList.add(new Alumno("Pepe", "Viyuela", "2º","1960"));
		alumnosList.add(new Alumno("Pepa", "Pig", "7º","20 D.C"));		
		alumnosList.add(new Alumno("Ana", "Bohueles", "1º","2003"));

		System.out.printf("%20s%20s%20s%20s%n", "Nombre ", "Apellidos", "Curso","Year");
		System.out.println("\t------------------------------------------------------------------------");
		for (Alumno alumno : alumnosList) {
			System.out.printf("%20s%20s%20s%20s%n", alumno.nombre, alumno.apellidos, alumno.curso, alumno.year);
		}

		System.out.printf("%20s%20s%20s%20s%n", "Nombre ", "Apellidos", "Curso","Year");
		System.out.println("\t-------------------------------------------------------------------------");
		for (Alumno alumno : alumnosList) {
			System.out.printf("%20s%20s%20s%20s%n", alumno.nombre, alumno.apellidos, alumno.curso, alumno.year);
		}
	}

	public static class Alumno {
		String nombre = "";
		String apellidos = "";
		String curso = "";
		String year="";
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public String getApellidos() {
			return apellidos;
		}
		public void setApellidos(String apellidos) {
			this.apellidos = apellidos;
		}
		public String getCurso() {
			return curso;
		}
		public void setCurso(String curso) {
			this.curso = curso;
		}
		public String getYear() {
			return year;
		}
		public void setYear(String year) {
			this.year = year;
		}
		public Alumno(String nombre, String apellidos, String curso, String year) {
			super();
			this.nombre = nombre;
			this.apellidos = apellidos;
			this.curso = curso;
			this.year = year;
		}
		
		

		
	}
}