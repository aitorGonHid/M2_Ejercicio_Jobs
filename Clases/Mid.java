package Clases;

public class Mid extends Employee{

	// Constante
	private final double REDU = 0.10;
	
	// Constructores	
	public Mid () {
		super ("Max", " Power", 0, 0);
		this.reduccion = REDU;
	}

	@Override
	public String toString() {
		return "Junior [getReduccion=" + getReduccion() + ", getNombre()=" + getNombre() + ", getApellido()=" + 
				getApellido() + ", getSueldo()=" + getSueldo() + ", getId()=" + getId() + "]";
	}
	
}