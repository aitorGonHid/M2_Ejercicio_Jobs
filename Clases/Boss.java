package Clases;

public class Boss extends Person {
	
	//Atributos
	private final static double AUMENTO_50 = 0.5;
	private final static int SALARIO_MIN = 8000;
	//Constructores
	public Boss() {
		super();
		setSueldo(extraSueldo(getSueldo(), AUMENTO_50));
	}

	public Boss(String nombre, String apellido, double sueldo, int id) {
		// Llama al constructor padre y asigna un valor provisional a sueldo
		super(nombre, apellido, sueldo, id);
		// Incrementa el sueldo segun su categoria
		setSueldo(extraSueldo(sueldo, AUMENTO_50));
	}	
	public static int getSalarioMin() {
		return SALARIO_MIN;
	}
}
