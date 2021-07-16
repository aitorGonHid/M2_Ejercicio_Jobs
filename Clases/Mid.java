package Clases;

public class Mid extends Employee{

	// Constantes
	final private double REDU = -0.1;
	private final static int SALARIO_MIN = 1800;
	private final static int SALARIO_MAX = 2500;
	private final static double IRPF_MID = 0.15;
	// Constructres
	public Mid () {
		super ();
		setSueldo(extraSueldo(getSueldo(), REDU));
	}
		
	public Mid(String nombre, String apellido, double sueldo) {
		// Llama al constructor padre y asigna un valor provisional a sueldo
		super(nombre, apellido, sueldo);
		// Incrementa el sueldo segun su categoria
		setSueldo(extraSueldo(sueldo, REDU));
		setIrpf(IRPF_MID);
	}
	public static int getSalarioMin() {
		return SALARIO_MIN;
	}

	public static int getSalarioMax() {
		return SALARIO_MAX;
	}

	public static double getIrpfMid() {
		return IRPF_MID;
	}
	
}