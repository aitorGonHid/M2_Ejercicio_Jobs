package Clases;

public abstract class Employee extends Person {
	
	
	// Constante
	final private double REDU = -0.15;
	// Construcotres
	public Employee () {
		super ();
//		setSueldo(extraSueldo(getSueldo(), REDU));
	}
	
	public Employee(String nombre, String apellido, double sueldo, int id) {
		// Llama al constructor padre y asigna un valor provisional a sueldo
		super(nombre, apellido, sueldo, id);
		// Incrementa el sueldo segun su categoria
//		setSueldo(extraSueldo(sueldo, REDU));
	}
	
}
