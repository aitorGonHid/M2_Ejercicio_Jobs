package Clases;

public abstract class Person {
	
	//Atributos
	protected String nombre;
	protected String apellido;
	protected double sueldo;
	protected int id;
	protected double irpf;
	protected boolean bonus;
	private static int nextId = 1;
	
	//Constructores
	public Person () {
		this("Max", " Power", 0, false);
	}
	
	public Person(String nombre, String apellido, double sueldo, boolean bonus) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.sueldo = sueldo;
		this.irpf = 0;
		this.bonus = bonus;
		setId(); // Id autoincremental
	}

	// Getters setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public int getId() {
		return id;
	}

	public void setId() {
		this.id = nextId;
		incNextId(); // Aqui se autoincrementa (pijadas de aitor xd)
	}
	public static void incNextId() {
		nextId++;
	}
	
	public double getIrpf() {
		return irpf;
	}

	public void setIrpf(double irpf) {
		this.irpf = irpf;
	}

	public void setBonus(boolean bonus) {
		this.bonus = bonus;
	}
	public boolean isBonus() {
		return bonus;
	}

	// Metodos
	// Para el sueldo extra (el sueldo va a ser o positivo o negativo, pero eso ya esta en sus respectivas clases)
	public double extraSueldo(double sueldo, double porcentaje) {
		return sueldo + (sueldo * porcentaje);
	}
	// Para validar el sueldo
	public boolean validarSueldo (double min, double max) {
		// Comprueba si el sueldo esta dentro del rango pasado como parametro
		boolean valid = (sueldo >= min && sueldo <= max) ? true : false;
		return valid;
	}
	// Poliformismo
	public boolean validarSueldo (double min) {
		// Comprueba si el sueldo es igual o superior al valor mínimo
		boolean valid = (sueldo >= min) ? true : false;
		return valid;
	}
	
	// Calcula el sueldo neto mensual
	public double netoMensual (double irpf) {
		return sueldo - (sueldo * irpf); // Multiplicando el sueldo por el irpf (ya esta definido en 0.X para no dividir entre 100)
	}
	
	// Calcular sueldo neto anual
	public double netoAnual (double irpf, int meses) {
		return brutoAnual(meses) - (brutoAnual(meses) * irpf); // A partir del bruto anual (por si tiene bonus) le rstamos el irpf
	}
	
	// Bruto anual
	public double brutoAnual (int meses) {
		if (isBonus()) {
			return sueldo * meses + (sueldo * meses * 0.1); // // Simplemente el sueldo por el numeor de meses y el aumento del 10%
		}
		else {
			return sueldo * meses;// Simplemente el sueldo por el numeor de meses
		} 
	}
	
}
