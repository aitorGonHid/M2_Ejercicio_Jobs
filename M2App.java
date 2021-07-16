import javax.swing.JOptionPane;

import Clases.Boss;
import Clases.Junior;
import Clases.Manager;
import Clases.Mid;
import Clases.Person;
import Clases.Senior;
import Clases.Volunteer;

public class M2App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nombre, apellido, puesto, num, bonus;
		int sueldo, numPagas;
		boolean salir = false, paga;
		
		do {
			// Pedimos los datos al trabajador
			nombre = JOptionPane.showInputDialog("Como te llamas?");
			apellido = JOptionPane.showInputDialog("Tu apellido?");
			num = JOptionPane.showInputDialog("Cual es tu sueldo mensual?");
			sueldo = Integer.parseInt(num);
			num = JOptionPane.showInputDialog("Numero de pagas totales?");
			numPagas = Integer.parseInt(num);
			puesto = JOptionPane.showInputDialog("Cual es tu puesto? (Boss/Manager/Senior/Mid/Junior/Volunteer)").toLowerCase();
			bonus = JOptionPane.showInputDialog("Tienes bonus? (si/no)").toLowerCase();
		
			
			if (puesto.equals("boss")) {
				Boss emp = new Boss(nombre, apellido, sueldo);
				if (emp.validarSueldo(emp.getSalarioMin())) {
					System.out.println("Salario bruto mensual: " + sueldo);
					System.out.println("Salario neto mensual: " + emp.netoMensual(emp.getIrpfBoss()));
					System.out.println("Salario bruto anual: " + emp.brutoAnual(numPagas));
					System.out.println("Salario neto anual: " + emp.netoAnual(emp.getIrpfBoss(), numPagas));
				}
				else {
					System.out.println("No te corresponde ese salario");
				}
			}
			else if (puesto.equals("manager")) {
				Manager emp2 = new Manager(nombre, apellido, sueldo);
				if (emp2.validarSueldo(emp2.getSalarioMin(), emp2.getSalarioMax())) {
					System.out.println("Salario bruto mensual: " + sueldo);
					System.out.println("Salario neto mensual: " + emp2.netoMensual(emp2.getIrpfManager()));
					System.out.println("Salario bruto anual: " + emp2.brutoAnual(numPagas));
					System.out.println("Salario neto anual: " + emp2.netoAnual(emp2.getIrpfManager(), numPagas));
				}
				else {
					System.out.println("No te corresponde ese salario");
				}
				
			}
			else if (puesto.equals("senior")) {
				Senior emp3 = new Senior(nombre, apellido, sueldo);
				if (emp3.validarSueldo(emp3.getSalarioMin(), emp3.getSalarioMax())) {
					System.out.println("Salario bruto mensual: " + sueldo);
					System.out.println("Salario neto mensual: " + emp3.netoMensual(emp3.getIrpfSenior()));
					System.out.println("Salario bruto anual: " + emp3.brutoAnual(numPagas));
					System.out.println("Salario neto anual: " + emp3.netoAnual(emp3.getIrpfSenior(), numPagas));
				}
				else {
					System.out.println("No te corresponde ese salario");
				}
			}
			else if (puesto.equals("mid")) {
				Mid emp4 = new Mid(nombre, apellido, sueldo);
				if (emp4.validarSueldo(emp4.getSalarioMin(), emp4.getSalarioMax())) {
					System.out.println("Salario bruto mensual: " + sueldo);
					System.out.println("Salario neto mensual: " + emp4.netoMensual(emp4.getIrpfMid()));
					System.out.println("Salario bruto anual: " + emp4.brutoAnual(numPagas));
					System.out.println("Salario neto anual: " + emp4.netoAnual(emp4.getIrpfMid(), numPagas));
				}
				else {
					System.out.println("No te corresponde ese salario");
				}
			}
			else if (puesto.equals("junior")) {
				Junior emp5 = new Junior(nombre, apellido, sueldo);
				if (emp5.validarSueldo(emp5.getSalarioMin(), emp5.getSalarioMax())) {
					System.out.println("Salario bruto mensual: " + emp5.getSueldo());
					System.out.println("Salario neto mensual: " + emp5.netoMensual(emp5.getIrpfJunior()));
					System.out.println("Salario bruto anual: " + emp5.brutoAnual(numPagas));
					System.out.println("Salario neto anual: " + emp5.netoAnual(emp5.getIrpfJunior(), numPagas));
				}
				else {
					System.out.println("No te corresponde ese salario");
				}
			}
			else if (puesto.equals("volunteer")) {
				if (sueldo == 0) {
					num = JOptionPane.showInputDialog("Tienes ayuda? (true/false)").toLowerCase();
					paga = Boolean.parseBoolean(num);
					Volunteer emp5 = new Volunteer(nombre, apellido, sueldo, paga);
					System.out.println("Tu sueldo mensual es de " + emp5.getSueldo());
					System.out.println("Tu sueldo anual es de " + (emp5.getSueldo() * numPagas));
				}
				else {
					System.out.println("No te corresponde ese salario");
				}
				
				
			}
			else {
				System.out.println("Error al introducir los datos");
			}
			
		} while(salir);
	}

}
