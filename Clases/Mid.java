package Clases;

public class Mid extends Employee{

	// Constante
	final private double REDU = -0.1;
	private final static int SALARIO_MIN = 1800;
	private final static int SALARIO_MAX = 2500;
	// Construcotres
	public Mid () {
		super ();
		setSueldo(extraSueldo(getSueldo(), REDU));
	}
		
	public Mid(String nombre, String apellido, double sueldo, int id) {
		// Llama al constructor padre y asigna un valor provisional a sueldo
		super(nombre, apellido, sueldo, id);
		// Incrementa el sueldo segun su categoria
		setSueldo(extraSueldo(sueldo, REDU));
	}
	
}