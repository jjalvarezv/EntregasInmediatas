package uiMain.operaciones;
import java.util.Scanner;
import gestorAplicacion.personas.UsuarioRegistrado;
import uiMain.OpcionesMenu;

public class Login extends OpcionesMenu {
	@Override
	public void ejecutar() {
		Scanner lectura = new Scanner(System.in);
		System.out.println("Usuario: ");
		String userName = lectura.next();
		System.out.println("Contraseņa: ");
		String pass = lectura.next();
		
		System.out.println(UsuarioRegistrado.login(userName, pass));
		lectura.close();
	}
	 public String toString() {
		 return "Iniciar Sesion";
	 }

}
