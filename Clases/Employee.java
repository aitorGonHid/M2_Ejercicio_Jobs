package Clases;

public abstract class Employee extends Person {
	
	// Atributos
	protected double reduccion;
	// Constante
	final private double REDU = 0.15;
	// Construcotres
	public Employee (String nombre, String apellido, double sueldo, int id) {
		super ("Max", " Power", 0, 0);
		this.reduccion = REDU;
	}
	
	// Getters y setters
	public double getReduccion() {
		return reduccion;
	}
	public void setReduccion(double reduccion) {
		this.reduccion = reduccion;
	}	
	
}
