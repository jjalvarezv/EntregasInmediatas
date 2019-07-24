package uiMain.operaciones;
import java.util.Scanner;

import gestorAplicacion.personas.UsuarioRegistrado;
import uiMain.OpcionesMenu;

public class NewProp extends OpcionesMenu {
	public NewProp(String key) {
		super(key);
	}
	public void ejecutar() {
		Scanner leer = new Scanner(System.in);
		System.out.print("Ingrese nombre del Propietario: ");
		String name = leer.next();
		System.out.print("Ingrese usuario: ");
		String username = leer.next();
		System.out.print("Ingrese contraseña: ");
		String password = leer.next();
		System.out.print("Ingrese numero de identificacion: ");
		Long cc = leer.nextLong();
		UsuarioRegistrado.newPropietario(username, password, name, cc);
	}
	public String toString() {
		return "Nuevo propietario";
	}
}
