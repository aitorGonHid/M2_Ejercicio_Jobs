package Clases;

public class Boss extends Person {
	
	//Atributos
	private final static double AUMENTO_50 = 0.5;
	private final static int SALARIO_MIN = 8000;
	private final static double IRPF_BOSS = 0.32;
	//Constructores
	public Boss() {
		super();
		setSueldo(extraSueldo(getSueldo(), AUMENTO_50));
	}

	public Boss(String nombre, String apellido, double sueldo) {
		// Llama al constructor padre y asigna un valor provisional a sueldo
		super(nombre, apellido, sueldo);
		// Incrementa el sueldo segun su categoria
		setSueldo(extraSueldo(sueldo, AUMENTO_50));
		setIrpf(IRPF_BOSS);
	}	
	public static int getSalarioMin() {
		return SALARIO_MIN;
	}
}
