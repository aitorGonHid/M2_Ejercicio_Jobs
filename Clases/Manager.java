package Clases;

public class Manager extends Person {
	
	//Atributos
	private final static double AUMENTO_10 = 0.1;
	//Constructores
	public Manager() {
		super();
		setSueldo(extraSueldo(getSueldo(), AUMENTO_10));
	}

	public Manager(String nombre, String apellido, double sueldo, int id) {
		// Llama al constructor padre y asigna un valor provisional a sueldo
		super(nombre, apellido, sueldo, id);
		// Incrementa el sueldo segun su categoria
		setSueldo(extraSueldo(sueldo, AUMENTO_10));
	}
	
}
