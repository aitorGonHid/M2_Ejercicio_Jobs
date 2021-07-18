package Clases;
import javax.swing.JOptionPane;

public class Volunteer extends Person {
	//Atributos
	public final static double AYUDA = 300;
	public final static int SALARIO_MIN = 0;
	public final static int SALARIO_MAX = 300;
	
	//Constructores
	public Volunteer() {
		super();
	}

	public Volunteer(String nombre, String apellido, double sueldo) {
		// Llama al constructor padre y asigna un valor provisional a sueldo
		super(nombre, apellido, sueldo);
		// Los voluntarios pueden recibir una ayuda siendo esta su unico ingreso neto
		String ayudaInput = JOptionPane.showInputDialog("El voluntario recibe una ayuda? (si/no)").toLowerCase();
		boolean ayuda = (ayudaInput.equals("si")) ? true : false;
		if (ayuda) setSueldo(AYUDA);
	}
	
	public static int getSalarioMin() {
		return SALARIO_MIN;
	}

	public static int getSalarioMax() {
		return SALARIO_MAX;
	}
}
