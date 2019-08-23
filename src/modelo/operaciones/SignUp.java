package modelo.operaciones;

import java.util.Scanner;
import uiMain.OpcionesMenu;
import modelo.gestorAplicacion.personas.UsuarioRegistrado;

public class SignUp extends OpcionesMenu{

	@Override
	public void ejecutar() {
		Scanner leer = new Scanner(System.in);
		System.out.print("Ingrese su nombre: ");
		String name = leer.next();
		System.out.print("Ingrese su nombre de usuario: ");
		String username = leer.next();
		System.out.print("Ingrese su contraseña: ");
		String password = leer.next();
		System.out.print("Ingrese numero de identificacion ");
		Long cc = leer.nextLong();
		System.out.print("Ingrese la direccion ");
		String dir = leer.next();
		UsuarioRegistrado.newCliente(username, password, name, cc, dir);
	}

	@Override
	public String toString() {
		return "Registrarse";
	}
	
}
