package Clases;

public class M2App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	/**
	 * Crea un objeto de tipo persona y lo castea a la clase correcta
	 * @param puesto: Puesto del empleado - Definirá que tipo de instancia se crea
	 * @param nombre: Nombre del empleado
	 * @param apellido: Apellido del empleado
	 * @param sueldo: Sueldo del empleado
	 * @param ayuda: Si/no recibe ayuda (solo los voluntarios)
	 * @return
	 */
	public static Person createPerson (String puesto, String nombre, String apellido, double sueldo, boolean ayuda) {
		// Crea una referencia de tipo person
		Person p;
		switch(puesto) {
			// Segun puesto pasado por parametro instancia una subclase
			// Castea la subclase para tener el mismo typo dinamico y estatico
	        case ("Boss"):
	        	p = new Boss(nombre, apellido, sueldo);
	        	return (Boss) p;
	        case ("Junior"):
	        	p = new Junior(nombre, apellido, sueldo);
	        	return (Junior) p;	
	        case ("Mid"):
	        	p = new Mid(nombre, apellido, sueldo);
	        	return (Mid) p;
	        case ("Senior"):
	        	p = new Senior(nombre, apellido, sueldo);
	        	return (Senior) p;
	        case ("Manager"):
	        	p = new Manager(nombre, apellido, sueldo);
	        	return (Manager) p;
	        default:
	        	p = new Volunteer(nombre, apellido, sueldo, ayuda);
	        	return (Volunteer) p;
	    }
	}
}
