package modelo.operaciones;

import java.util.Scanner;

import modelo.gestorAplicacion.personas.UsuarioRegistrado;
import uiMain.OpcionesMenu;

public class AddOpt extends OpcionesMenu{
	
	public AddOpt(String key){
		super(key);
	}
	
	@Override
	public void ejecutar() {
		Scanner leer = new Scanner(System.in);
		System.out.print("Ingrese el nombre de usuario: ");
		String username = leer.next();
		UsuarioRegistrado user = UsuarioRegistrado.getUserByUsername(username);
		OpcionesMenu.seeAllOperations();
		System.out.print("Ingrese el numero de la funcionalidad a a�adir: ");
		String opt = leer.next();
		user.getMenu().a�adirOpcion(opt);
	}

	@Override
	public String toString() {
		return "A�adir funcionalidades a un usuario";
	}
	
}
