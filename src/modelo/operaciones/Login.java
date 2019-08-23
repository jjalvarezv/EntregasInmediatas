package modelo.operaciones;
import java.util.Scanner;
import modelo.gestorAplicacion.personas.UsuarioRegistrado;
//import uiMain.Main;
import uiMain.OpcionesMenu;

public class Login extends OpcionesMenu {
	@Override
	public void ejecutar() {
		Scanner lectura = new Scanner(System.in);
		System.out.println("Usuario: ");
		String userName = lectura.next();
		System.out.println("Contraseña: ");
		String pass = lectura.next();
		
		System.out.println(UsuarioRegistrado.login(userName, pass));
		
		//lectura.close();
	}
	 public String toString() {
		 return "Iniciar Sesion";
	 }

}
