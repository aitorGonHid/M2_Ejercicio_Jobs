package Clases;

public class Volunteer extends Person {
	//Atributos
	private boolean ayuda;
	private final static double AUMENTO_100_NEGATIVO = -1;
	private final static int SALARIO_MAX = 0;
	private final static int AYUDA = 300;
	//Constructores
	public Volunteer() {
		super();
		setSueldo(extraSueldo(getSueldo(), AUMENTO_100_NEGATIVO));
	}

	public Volunteer(String nombre, String apellido, double sueldo, int id, boolean ayuda) {
		// Llama al constructor padre y asigna un valor provisional a sueldo
		super(nombre, apellido, sueldo, id);
		this.ayuda = ayuda;
		// Incrementa el sueldo segun su categoria
		if (ayuda) {
			setSueldo(AYUDA);
		}
		else {
			setSueldo(extraSueldo(sueldo, AUMENTO_100_NEGATIVO));
		}
	}

	public static int getSalarioMax() {
		return SALARIO_MAX;
	}

	// Getters setters
	public boolean isAyuda() {
		return ayuda;
	}

	public void setAyuda(boolean ayuda) {
		this.ayuda = ayuda;
	}
	
}
