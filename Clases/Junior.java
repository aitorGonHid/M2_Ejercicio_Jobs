package Clases;

public class Junior extends Employee{
	
	// Constante
	final private double REDU = -0.15;
	// Construcotres
	public Junior () {
		super ();
		setSueldo(extraSueldo(getSueldo(), REDU));
	}
	
	public Junior(String nombre, String apellido, double sueldo, int id) {
		// Llama al constructor padre y asigna un valor provisional a sueldo
		super(nombre, apellido, sueldo, id);
		// Incrementa el sueldo segun su categoria
		setSueldo(extraSueldo(sueldo, REDU));
	}
	
}
