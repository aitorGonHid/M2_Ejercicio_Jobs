package Clases;
import java.text.DecimalFormat;
import java.util.HashMap;
import javax.swing.JOptionPane;

public class M2App {

	public static void main(String[] args) {
		
		// Se crea una estructura de datos donde se almacenaran los objetos de tipo Persona que formarán la plantilla
		HashMap <Integer, Person> plantilla = new HashMap<>();
		
		// Solicita la creacion del primer empleado
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		System.out.println("|  PLANTILLA  |");
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		
		String answer = JOptionPane.showInputDialog("Quieres añadir un nuevo empleado ? (si / no)").toLowerCase();
		boolean continuar = (answer.equals("si")) ? true : false;
		
		 while (continuar) {
			
			// Pregunta cual será el puesto del empleado para determinar que tipo de objeto se va a instanciar
			String puesto = JOptionPane.showInputDialog("Cual es el puesto del empleado ? \n"
					+ "Boss / Junior / Mid / Senior / Manager / Voluntario").toLowerCase();
			// Se solicitan los atributos del empleado
			String nombre = JOptionPane.showInputDialog("Como se llama el empleado? ").toLowerCase();
			String apellido = JOptionPane.showInputDialog("Cual es su apellido").toLowerCase();
			String sueldoInput = JOptionPane.showInputDialog("Cual será su sueldo").toLowerCase();
			double sueldo = Double.parseDouble(sueldoInput);
			// Crea una instancia de una de las subclases de persona segun el puesto que ocupará
			// Se verifica que el sueldo sea válido y se añade a la plantilla
			switch (puesto) {
			case ("boss"):
				Boss newBoss = new Boss(nombre, apellido, sueldo);
				if (newBoss.validarSueldo(Boss.SALARIO_MIN, 999)) {
					plantilla.put(newBoss.getId(), newBoss);
					printEmpleado(newBoss);
				} else {
					System.out.println("Empleado contratado y añadido a la plantilla: ");
				}
			break;
			case ("junior"):
				Junior newJunior = new Junior(nombre, apellido, sueldo);
				if (newJunior.validarSueldo(Boss.SALARIO_MIN, Junior.SALARIO_MAX)) {
					plantilla.put(newJunior.getId(), newJunior);
					System.out.println("Empleado contratado y añadido a la plantilla: ");
					printEmpleado(newJunior);
				} else {
 					System.out.println("El sueldo introducido no es válido");
 				}			
			break;
 			case ("mid"):
				Mid newMid = new Mid(nombre, apellido, sueldo);
 				if (newMid.validarSueldo(Mid.SALARIO_MIN,Mid.SALARIO_MAX)) {
 					plantilla.put(newMid.getId(), newMid);
 					printEmpleado(newMid);
 				} else {
 					System.out.println("El sueldo introducido no es válido");
 				}
 				
 			break;
			case ("senior"):
				Senior newSenior = new Senior(nombre, apellido, sueldo);
				if (newSenior.validarSueldo(Senior.SALARIO_MIN, Senior.SALARIO_MAX)) {
					plantilla.put(newSenior.getId(), newSenior);
					printEmpleado(newSenior);
				} else {
 					System.out.println("El sueldo introducido no es válido");
 				}
			break;
			case ("manager"):
				Manager newManager = new Manager(nombre, apellido, sueldo);
				if (newManager.validarSueldo(Manager.SALARIO_MIN, Manager.SALARIO_MAX)) {
					plantilla.put(newManager.getId(), newManager);
					printEmpleado(newManager);
				} else {
 					System.out.println("El sueldo introducido no es válido");
 				}
			break;
			default:
				Volunteer newVolunteer = new Volunteer(nombre, apellido, sueldo);
				if (newVolunteer.validarSueldo(Volunteer.SALARIO_MIN, Volunteer.SALARIO_MAX)) {
					plantilla.put(newVolunteer.getId(), newVolunteer);
					printEmpleado(newVolunteer);
				} else {
 					System.out.println("El sueldo introducido no es válido");
 				}
			break;
			}
			
			// Continuar añadiendo empleados
			answer = JOptionPane.showInputDialog("Continuar? (si / no)").toLowerCase();
			continuar = (answer.equals("si")) ? true : false;
		}
		
		
		
	}
	public static void printEmpleado(Person emp) {
		DecimalFormat df = new DecimalFormat("#.##");
		
		System.out.println("Id: "+emp.getId());
		System.out.println("Nombre  "+emp.getNombre());
		System.out.println("Apellido: "+emp.getApellido());		
		if (!(emp instanceof Volunteer)) {
			System.out.println("Sueldo bruto: "+ df.format(emp.getSueldo()));
			System.out.println("Aplica un IRPF del:" + emp.getIrpf());
			System.out.println("Sueldo anual bruto: "+ df.format(emp.brutoAnual(14)));
			System.out.println("Sueldo mensual neto: "+ df.format(emp.netoMensual()));
			System.out.println("Sueldo anual neto: "+ df.format(emp.netoAnual(14)));
		} else {
			Volunteer aux = (Volunteer) emp;
			System.out.println("Tiene una ayuda:" + aux.hasAyuda());
			// System.out.println("Tiene una ayuda:" + (Volunteer) emp.hasAyuda()); // el casteo no es correcto, preguntar
			System.out.println("Sueldo mensual neto: " + aux.getSueldo());
			System.out.println("Sueldo anual neto: " + aux.brutoAnual(14));
		}
	}
}
