package uiMain.operaciones;
import uiMain.Main;
import gestorAplicacion.personas.*;
import uiMain.OpcionesMenu;

public class EntPed extends OpcionesMenu {
	
	public EntPed(String key) {
		super(key);
	}
	
	public void ejecutar() {
		((Domiciliario)Main.user).getPedido().setEstado(2);
	}
	
	public String toString() {
		return "Entregar pedido";
	}
}
