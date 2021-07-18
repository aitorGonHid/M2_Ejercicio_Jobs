package Clases;

public abstract class Person implements BonusSueldo {
	
	//Atributos
	private String nombre;
	private String apellido;
	private double sueldo;
	private int id;
	private double irpf;
	private boolean ayuda;
	private static int nextId = 1;
	
	//Constructores
	public Person () {
		this("Invalid", " Worker", 0);
	}
	
	public Person(String nombre, String apellido, double sueldo) {
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
	
	public boolean hasAyuda() {
		return ayuda;
	}

	public void setAyuda(boolean ayuda) {
		this.ayuda = ayuda;
	}

	// Metodos
	public double extraSueldo(double porcentaje) {
		// Si es una reduccion
		if (porcentaje < 0) return getSueldo() * (1 - porcentaje);
		// Si es un aumento
		return getSueldo() * (1 + porcentaje);
	}
	
	// Validar sueldo llamará a una funcion concreta dependiendo del tipo de la instancia que llama a la funcion
	public boolean validarSueldo (double min, double max) {
		// De la clase boos solo valida que tenga un sueldo superior al mínimo
		if (this instanceof Boss) {				
			return this.validarSueldoMin(min);
		// De la clase Volunteer valida que si tiene una ayuda, el sueldo sea de 300 y si no tiene sea de 0;
		} else if (this instanceof Volunteer) {
			if (this.hasAyuda() && this.getSueldo() == 300)	return true;
			if (!(this.hasAyuda()) && this.getSueldo() == 0) return true;
			return false;
		// El resto de clases deben tener un sueldo dentro de un rango determinado para cada clase
		} else {
			return this.validarSueldoMinMax(min, max);
		}
	}
		
	public boolean validarSueldoMinMax (double min, double max) {
		// Comprueba si el sueldo esta dentro del rango pasado como parametro
		boolean valid = (sueldo >= min && sueldo <= max) ? true : false;
		return valid;
	}
	
	public boolean validarSueldoMin (double min) {
		// Comprueba si el sueldo es igual o superior al valor mínimo
		boolean valid = (sueldo >= min) ? true : false;
		return valid;
	}
	
	// Calcula el sueldo neto mensual
	public double netoMensual () {
		return getSueldo() - (getSueldo() * getIrpf()); // Multiplicando el sueldo por el irpf (ya esta definido en 0.X para no dividir entre 100)
	}
	
	// Calcular sueldo neto anual
	public double netoAnual (int meses) {
		return netoMensual() * meses; // A partir del neto mensual multiplicamos por los meses (por si hay mas pagas o no)
	}
	
	// Bruto anual
	public double brutoAnual (int meses) {
		return getSueldo() * meses; // Simplemente el sueldo por el numeor de meses (por si hay mas pagas o no)
	}
	
	public double getBonus() {
		// Si el trabajador es voluntario no tendrá bonus de sueldo
		if (this instanceof Volunteer) return 0;
		// El resto de trabajadores pueden recibir un bono del 10% del sueldo anual
		return brutoAnual(14)*0.1;
	}
	
}
