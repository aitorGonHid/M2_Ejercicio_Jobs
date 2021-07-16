package Clases;

public class Junior extends Employee{

	// Constante
	private final double REDU = 0.15;
	
	// Constructores	
	public Junior () {
		super ("Max", " Power", 0, 0);
		this.reduccion = REDU;
	}

	@Override
	public String toString() {
		return "Junior [getReduccion=" + getReduccion() + ", getNombre()=" + getNombre() + ", getApellido()=" + 
				getApellido() + ", getSueldo()=" + getSueldo() + ", getId()=" + getId() + "]";
	}
	
}
