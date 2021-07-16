package Clases;

public class Senior extends Employee{

	// Constante
	final private double REDU = -0.1;
	private final static int SALARIO_MIN = 2700;
	private final static int SALARIO_MAX = 4000;
	private final static double IRPF_SENIOR = 0.24;
	// Construcotres
	public Senior () {
		super ();
		setSueldo(extraSueldo(getSueldo(), REDU));
	}
		
	public Senior(String nombre, String apellido, double sueldo) {
		// Llama al constructor padre y asigna un valor provisional a sueldo
		super(nombre, apellido, sueldo);
		// Incrementa el sueldo segun su categoria
		setSueldo(extraSueldo(sueldo, REDU));
		setIrpf(IRPF_SENIOR);
	}
	public static int getSalarioMin() {
		return SALARIO_MIN;
	}

	public static int getSalarioMax() {
		return SALARIO_MAX;
	}
}