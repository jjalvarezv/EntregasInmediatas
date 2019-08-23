package modelo.operaciones;

import uiMain.OpcionesMenu;
import java.util.Scanner;
import modelo.gestorAplicacion.*;
import modelo.gestorAplicacion.personas.UsuarioRegistrado;

public class DelOpt extends OpcionesMenu{

	public DelOpt(String key){
		super(key);
	}
	
	@Override
	public void ejecutar() {
		Scanner leer = new Scanner(System.in);
		System.out.print("Ingrese el nombre de usuario: ");
		String username = leer.next();
		UsuarioRegistrado user = UsuarioRegistrado.getUserByUsername(username);
		user.getMenu().seeOpt();
		System.out.print("Ingrese el numero de la funcionalidad a remover: ");
		int index = leer.nextInt();
		user.getMenu().delOpt(index);
	}

	@Override
	public String toString() {
		return "Quitar funcionalidades de un usuario";
	}
	
}
