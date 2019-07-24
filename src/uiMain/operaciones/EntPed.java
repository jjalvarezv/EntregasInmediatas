package uiMain.operaciones;
import uiMain.Main;

import java.util.ArrayList;
import java.util.HashMap;

import Datos.Data;
import gestorAplicacion.gestion.Pedido;
import gestorAplicacion.personas.*;
import uiMain.OpcionesMenu;

public class EntPed extends OpcionesMenu {
	
	public EntPed(String key) {
		super(key);
	}
	
	public void ejecutar() {
		
		
		((Domiciliario)Main.user).cambiarEstado(Domiciliario.ESTADO_DISPONIBLE);
		
		HashMap<String, Pedido> pedidos  = Data.pedidos;
		
		for (String key : pedidos.keySet()) {
			Pedido pedido =   pedidos.get(key);
			
			if (pedido.getUserDomiciliario() == Main.user.getUsername() && pedido.getEstado() == Pedido.ESTADO_PENDIENTE ) {
				
				Data.pedidos.get(key).setEstado( Pedido.ESTADO_PAGADO);
				System.out.println("Has entregado el pedido a "+ pedido.getCedulaCliente());

			}
		}

	}
	
	public String toString() {
		return "Entregar pedido";
	}
}
