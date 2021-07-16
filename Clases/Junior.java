package Clases;

public class Junior extends Employee{
	
	// Constante
	final private double REDU = -0.15;
	private final static int SALARIO_MIN = 900;
	private final static int SALARIO_MAX = 1600;
	private final static double IRPF_JUNIOR = 0.02;
	// Construcotres
	public Junior () {
		super ();
		setSueldo(extraSueldo(getSueldo(), REDU));
	}
	
	public Junior(String nombre, String apellido, double sueldo) {
		// Llama al constructor padre y asigna un valor provisional a sueldo
		super(nombre, apellido, sueldo);
		// Incrementa el sueldo segun su categoria
		setSueldo(extraSueldo(sueldo, REDU));
		setIrpf(IRPF_JUNIOR);
	}

	public static int getSalarioMin() {
		return SALARIO_MIN;
	}

	public static int getSalarioMax() {
		return SALARIO_MAX;
	}
	
}
