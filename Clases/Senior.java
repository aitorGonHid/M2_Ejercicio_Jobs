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
		
	public Senior(String nombre, String apellido, double sueldo, boolean bonus) {
		// Llama al constructor padre y asigna un valor provisional a sueldo
		super(nombre, apellido, sueldo, bonus);
		// Incrementa el sueldo segun su categoria
		setSueldo(extraSueldo(sueldo, REDU));
		setIrpf(IRPF_SENIOR);
	}
	public int getSalarioMin() {
		return SALARIO_MIN;
	}

	public int getSalarioMax() {
		return SALARIO_MAX;
	}

	public double getIrpfSenior() {
		return IRPF_SENIOR;
	}
	
}