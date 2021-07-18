package Clases;

public class Boss extends Person {
	
	//Atributos
	public final static double AUMENTO_50 = 0.5;
	public final static int SALARIO_MIN = 8000;
	public final static double IRPF_BOSS = 0.32;
	//Constructores
	public Boss() {
		super();
	}

	public Boss(String nombre, String apellido, double sueldo) {
		// Llama al constructor padre y asigna un valor provisional a sueldo
		super(nombre, apellido, sueldo);
		// Incrementa el sueldo segun su categoria
		setSueldo(extraSueldo(AUMENTO_50));
		setIrpf(IRPF_BOSS);
	}	
	public int getSalarioMin() {
		return SALARIO_MIN;
	}
}
