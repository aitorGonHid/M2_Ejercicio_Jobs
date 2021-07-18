package Clases;

public class Manager extends Person {
	
	//Atributos
	public final static double AUMENTO_10 = 0.1;
	public final static int SALARIO_MIN = 3000;
	public final static int SALARIO_MAX = 5000;
	public final static double IRPF_MANAGER = 0.26;
	//Constructores
	public Manager() {
		super();
	}

	public Manager(String nombre, String apellido, double sueldo) {
		// Llama al constructor padre y asigna un valor provisional a sueldo
		super(nombre, apellido, sueldo);
		// Incrementa el sueldo segun su categoria
		setSueldo(extraSueldo(AUMENTO_10));
		setIrpf(IRPF_MANAGER);
	}
	public static int getSalarioMin() {
		return SALARIO_MIN;
	}

	public static int getSalarioMax() {
		return SALARIO_MAX;
	}
}
