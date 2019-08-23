package modelo.operaciones;
import uiMain.OpcionesMenu;
import java.util.Scanner;

import modelo.gestorAplicacion.personas.UsuarioRegistrado;

public class NewDom extends OpcionesMenu {
	public NewDom(String key) {
		super(key);
	}
	@Override
	public void ejecutar() {
		Scanner leer = new Scanner(System.in);
		System.out.print("Ingrese nombre del domiciliario: ");
		String name = leer.next();
		System.out.print("Ingrese usuario: ");
		String username = leer.next();
		System.out.print("Ingrese contraseña: ");
		String password = leer.next();
		System.out.print("Ingrese numero de identificacion: ");
		Long cc = leer.nextLong();
		UsuarioRegistrado.newDomiciliario(username, password, name, cc);
	}
	public String toString(){
		return "Nuevo domiciliario";
	}

}
