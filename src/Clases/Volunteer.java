package Clases;

public class Volunteer extends Person {
	//Atributos
	private final static double AUMENTO_100_NEGATIVO = -1;
	//Constructores
	public Volunteer() {
		super();
		setSueldo(extraSueldo(getSueldo(), AUMENTO_100_NEGATIVO));
	}

	public Volunteer(String nombre, String apellido, double sueldo, int id) {
		// Llama al constructor padre y asigna un valor provisional a sueldo
		super(nombre, apellido, sueldo, id);
		// Incrementa el sueldo segun su categoria
		setSueldo(extraSueldo(sueldo, AUMENTO_100_NEGATIVO));
	}
}
