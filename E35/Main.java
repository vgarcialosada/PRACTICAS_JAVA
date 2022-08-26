package E35;

public class Main {
	public static void main(String[] args) {
		Cliente c1 = new Cliente("Fran", "Olano", "1232131", 0, 2);
		Cliente c2 = new Cliente ("Don", "Federico", "1232131", 1, 2);
		Empleado e1 = new Empleado("Pepe", "Viyuela", "21231", 1, 1);	
		System.out.println(c1.getNombre()+" "+ c1.getApellido()+" "+ c1.getDocumento()+ " "+c1.getTipo()+" categoria: "+c1.getCategoria()+" codigo:"+c1.getCodigo());
		System.out.println(c2.getNombre()+" "+ c2.getApellido()+" "+ c2.getDocumento()+ " "+c2.getTipo()+" categoria: "+c1.getCategoria()+" codigo:"+c1.getCodigo());
		System.out.println(e1.getNombre()+" "+ e1.getApellido()+" "+ e1.getDocumento()+ " "+e1.getTipo()+" tipo de contrato: "+ e1.getTipoContrato()
		+" sueldo: " +e1.calcularSueldo());

	}
}
