package Clases;

public abstract class WorkerFactory {
	
	
	/**
	 * Crea un objeto de tipo persona y lo castea a la clase correcta
	 * @param puesto: Puesto del empleado - Definirá que tipo de instancia se crea
	 * @param nombre: Nombre del empleado
	 * @param apellido: Apellido del empleado
	 * @param sueldo: Sueldo del empleado
	 * @return instancia de trabajador de la categoria definida por el parametro puesto
	 */
	public static Person nuevo(String puesto, String nombre, String apellido, double sueldo) {
		// Si no se le pasa un puesto devolverá una referencia vacia
		// En caso de que el puesto especificado no coincida con uno  valido, se creará un Volunteer
		if (puesto == null) {
			return null;
		}
		switch (puesto.toLowerCase()) {
		case ("boss"):
			return new Boss(nombre, apellido, sueldo);
		case ("junior"):
			return  new Junior(nombre, apellido, sueldo);
		case ("mid"):
			return   new Mid(nombre, apellido, sueldo);
		case ("senior"):
			return  (Senior) new Senior(nombre, apellido, sueldo);
		case ("manager"):
			return  new Manager(nombre, apellido, sueldo);
		default:
			return  new Volunteer(nombre, apellido, sueldo);
		}
	}
}
