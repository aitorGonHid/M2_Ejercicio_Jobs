package Clases;

public abstract class Person {
	
	//Atributos
	private String nombre;
	private String apellido;
	private double sueldo;
	private int id;
	private static int nextId = 1;
	
	//Constructores
	public Person () {
		this("Max", " Power", 0, 0);
	}
	
	public Person(String nombre, String apellido, double sueldo, int id) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.sueldo = sueldo;
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
	
	public double extraSueldo(double sueldo, double porcentaje) {
		// Si es una reduccion
		if (porcentaje < 0) return getSueldo() * (1 - porcentaje);
		// Si es un aumento
		return getSueldo() * (1 + porcentaje);
	}
	
}
