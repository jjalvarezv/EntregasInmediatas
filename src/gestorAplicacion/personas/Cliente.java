package gestorAplicacion.personas;
import java.util.*;

import Datos.Data;
import gestorAplicacion.gestion.Item;

public class Cliente extends UsuarioRegistrado{
	private ArrayList<gestorAplicacion.gestion.Pedido> pedidos;
	private String direccion;
	
	//public Cliente charles = new Cliente("charles10", "dt150", "Charles Mendez", (long)300988, pedido.pedido_1, "calle 2 #45-13");
	
	public Cliente() {}
	public Cliente(String userName, String pass, String nombre, Long cc, 
			gestorAplicacion.gestion.Pedido pedido, String direccion) {
		super(userName, pass, nombre, cc);
		this.pedidos.add(pedido);
		this.direccion = direccion;
		
	}
	public Cliente(String userName, String pass, String nombre, Long cc, String direccion) {
		super(userName, pass, nombre, cc);
		this.direccion = direccion;		
	}

	
	public String getDireccion() {
		return this.direccion;
	}
	/*public void solicitarPedido( int direcc, ArrayList<Item> itemsProductos ) {
		int tiempo_mayor= itemsProductos.get(0).getTiempo();		
		for(int x=0;x<itemsProductos.size();x++) {
			 if( itemsProductos.get(x).getTiempo() > tiempo_mayor) {
				 tiempo_mayor=  itemsProductos.get(x).getTiempo();
			 }
			}
		int tiempo_transporte= 40;
		String id= Long.toString(Cliente.super.getCedula());
		int tamaño= pedidos.size();
		id.concat(String.valueOf(tamaño));
		//Cliente clt, int IdPed, int direcc, int tiempo, ArrayList<Item> producto
		
		gestorAplicacion.gestion.Pedido pedido = new gestorAplicacion.gestion.Pedido(this, 0, direcc, tiempo_mayor + tiempo_transporte, itemsProductos  );
		HashMap<String, Domiciliario> domiciliarios  = Data.domiciliarios;
		
	
		boolean auxDomiciliarioPedido = false; 
		//recorremos la lista de domiciliarios para verificar cual domiciliario esta disponible
		for (String key : domiciliarios.keySet()) {
			Domiciliario domiciliario =   domiciliarios.get(key);
			
			// verificamos por estado de domiciliario cual tiene el estado disponible
			if (domiciliario.getEstado() == Domiciliario.ESTADO_DISPONIBLE  ) {
				
				//agregamos al objeto pédido el objeto doimiciliario
				pedido.setDomiciliario(domiciliario);
				
				// cambiamos el estado del domiciliario por un estado ocupado
				domiciliario.cambiarEstado(Domiciliario.ESTADO_OCUPADO);
				
				//cambiamos la variable auxiliar para que diga que diga si asiganamos domiciliario al pedido
				auxDomiciliarioPedido = true;
				break;
			}
		}
		
		if (auxDomiciliarioPedido) {
			this.pedidos.add(pedido);
		} else {
			
		}
		
	}*/
	
	/*public void cancelarPedido() {
		//this.pedido.clear();
		pedidos.get(pedidos.size()-1).setEstado(gestorAplicacion.gestion.Pedido.ESTADO_CANCELADO);// mejorar mañana 
	}*/
	
	public void cancelarDeuda() {
		//JOOOJOJJJOJOJOJOJOJOJOJOJOJOJ
	}
	
	public void logout() {
			
	}
}
