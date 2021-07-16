package Clases;

public abstract class Person implements BonusSueldo {
	
	//Atributos
	private String nombre;
	private String apellido;
	private double sueldo;
	private int id;
	private double irpf;
	private static int nextId = 1;
	
	//Constructores
	public Person () {
		this("Max", " Power", 0, 0);
	}
	
	public Person(String nombre, String apellido, double sueldo, int id) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.sueldo = sueldo;
		this.irpf = 0;
		setId();
	}

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
		incNextId();
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

	// Metodos
	public double extraSueldo(double sueldo, double porcentaje) {
		// Si es una reduccion
		if (porcentaje < 0) return sueldo * (1 - porcentaje);
		// Si es un aumento
		return sueldo * (1 + porcentaje);
	}
	
	public boolean validarSueldo (double min, double max) {
		// Comprueba si el sueldo esta dentro del rango pasado como parametro
		boolean valid = (sueldo >= min && sueldo <= max) ? true : false;
		return valid;
	}
	
	public boolean validarSueldo (double min) {
		// Comprueba si el sueldo es igual o superior al valor mínimo
		boolean valid = (sueldo >= min) ? true : false;
		return valid;
	}
	
	// Calcula el sueldo neto mensual
	public double netoMensual () {
		return sueldo - (sueldo * getIrpf()); // Multiplicando el sueldo por el irpf (ya esta definido en 0.X para no dividir entre 100)
	}
	
	// Calcular sueldo neto anual
	public double netoAnual (double irpf, int meses) {
		return netoMensual() * meses; // A partir del neto mensual multiplicamos por los meses (por si hay mas pagas o no)
	}
	
	// Bruto anual
	public double brutoAnual (int meses) {
		return sueldo * meses; // Simplemente el sueldo por el numeor de meses (por si hay mas pagas o no)
	}
	
	public double getBonus() {
		// Si el trabajador es voluntario no tendrá bonus de sueldo
		if (this instanceof Volunteer) return 0;
		// El resto de trabajadores pueden recibir un bono del 10% del sueldo anual
		return brutoAnual(14)*0.1;
	}
	
}
