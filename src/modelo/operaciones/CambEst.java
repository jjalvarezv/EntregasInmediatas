package modelo.operaciones;
import java.util.Scanner;
import modelo.gestorAplicacion.personas.*;

//import uiMain.Main;
import uiMain.OpcionesMenu;

public class CambEst extends OpcionesMenu {
	public CambEst(String key) {
		super(key);
	}

	@Override
	public void ejecutar() {
		System.out.println("1) Estado Disponible");
		System.out.println("2) Estado Ocupado");
		System.out.println("3) Estado Offline");
		Scanner leer = new Scanner(System.in);
		System.out.println("Escoger estado: ");
		int a = leer.nextInt();
		//UsuarioRegistrado dom = Main.user;
		//if (dom instanceof Domiciliario) {
			//((Domiciliario) dom).cambiarEstado(a-1);
		//}
	}
	
	public String toString() {
		return "Cambiar estado";
	}
	
}
