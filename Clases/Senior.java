package Clases;

public class Senior extends Employee{

	// Constante
	private final double REDU = 0.10;
	
	// Constructores	
	public Senior () {
		super ("Max", " Power", 0, 0);
		this.reduccion = REDU;
	}

	@Override
	public String toString() {
		return "Junior [getReduccion=" + getReduccion() + ", getNombre()=" + getNombre() + ", getApellido()=" + 
				getApellido() + ", getSueldo()=" + getSueldo() + ", getId()=" + getId() + "]";
	}
	
}