package uiMain.operaciones;

import java.util.Scanner;
import gestorAplicacion.personas.UsuarioRegistrado;
import uiMain.OpcionesMenu;

public class VerOpt extends OpcionesMenu{
	public VerOpt(String key){
		super(key);
	}
	
	public void ejecutar() {
		Scanner leer = new Scanner(System.in);
		System.out.print("Ingrese el nombre de usuario: ");
		String username = leer.next();
		UsuarioRegistrado user = UsuarioRegistrado.getUserByUsername(username);
		user.getMenu().seeOpt();
<<<<<<< HEAD
=======
		leer.close();
>>>>>>> 77efca06310b7746c76ae7042a26045c90d6baea
	}

	public String toString() {
		return "ver funciones de un usuario";
	}
}
