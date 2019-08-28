package modelo.operaciones;

import java.util.Scanner;
import modelo.uiMain.OpcionesMenu;
import modelo.gestorAplicacion.personas.Admin;

public class NewAdmin extends OpcionesMenu{

	public NewAdmin(String key){
		super(key);
	}
	
	@Override
	public void ejecutar() {
		Scanner leer = new Scanner(System.in);
		System.out.print("Ingrese su nombre: ");
		String name = leer.next();
		System.out.print("Ingrese su nombre de usuario: ");
		String username = leer.next();
		System.out.print("Ingrese su contraseña: ");
		String password = leer.next();
		System.out.print("Ingrese su numero de identificación: ");
		Long cc = leer.nextLong();
		Admin.newAdmin(username, password, name,cc);
	}

	@Override
	public String toString() {
		return "Crear nuevo usuario admin";
	}
	
}
