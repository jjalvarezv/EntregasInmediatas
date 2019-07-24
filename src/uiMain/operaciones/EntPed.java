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
		((Domiciliario)Main.user).cambiarEstado(0);
		System.out.println("Has entregado el pedido a "+ ((Domiciliario)Main.user).getPedido().getCedulaCliente());
	}
	
	public String toString() {
		return "Entregar pedido";
	}
}
