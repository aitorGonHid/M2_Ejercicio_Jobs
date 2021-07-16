package Clases;

public class Senior extends Employee{

	// Constante
	final private double REDU = -0.1;
	// Construcotres
	public Senior () {
		super ();
		setSueldo(extraSueldo(getSueldo(), REDU));
	}
		
	public Senior(String nombre, String apellido, double sueldo, int id) {
		// Llama al constructor padre y asigna un valor provisional a sueldo
		super(nombre, apellido, sueldo, id);
		// Incrementa el sueldo segun su categoria
		setSueldo(extraSueldo(sueldo, REDU));
	}
	
}