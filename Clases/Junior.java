package Clases;

public class Junior extends Employee{
	
	// Constante
	final private double REDU = -0.15;
	public final static int SALARIO_MIN = 900;
	public final static int SALARIO_MAX = 1600;
	public final static double IRPF_JUNIOR = 0.02;
	// Construcotres
	public Junior () {
		super ();
	}
	
	public Junior(String nombre, String apellido, double sueldo) {
		// Llama al constructor padre y asigna un valor provisional a sueldo
		super(nombre, apellido, sueldo);
		// Incrementa el sueldo segun su categoria
		setSueldo(extraSueldo(REDU));
		setIrpf(IRPF_JUNIOR);
	}

	public static int getSalarioMin() {
		return SALARIO_MIN;
	}

	public static int getSalarioMax() {
		return SALARIO_MAX;
	}
	
}
