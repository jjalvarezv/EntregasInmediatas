package gestorAplicacion.personas;
import java.util.*;

import gestorAplicacion.gestion.Item;

public class Cliente extends UsuarioRegistrado{
	private ArrayList<gestorAplicacion.gestion.Pedido> pedido;
	private String direccion;
	
	public Cliente() {}
	public Cliente(String userName, String pass, String nombre, Long cc, 
			gestorAplicacion.gestion.Pedido pedido, String direccion) {
		super(userName, pass, nombre, cc);
		this.pedido.add(pedido);
		this.direccion = direccion;
		
	}
	public Cliente(String userName, String pass, String nombre, Long cc, String direccion) {
		super(userName, pass, nombre, cc);
		this.direccion = direccion;		
	}
	
	public void solicitarPedido( int direcc, ArrayList<Item> producto ) {
		int tiempo_mayor= producto.get(0).getTiempo();		
		for(int x=0;x<producto.size();x++) {
			 if( producto.get(x).getTiempo() > tiempo_mayor) {
				 tiempo_mayor=  producto.get(x).getTiempo();
			 }
			}
		int tiempo_transporte= 20;
		String id= Long.toString(Cliente.super.getCedula());
		int tamaño= pedido.size();
		id.concat(String.valueOf(tamaño));
		//Cliente clt, int IdPed, int direcc, int tiempo, ArrayList<Item> producto
		
		gestorAplicacion.gestion.Pedido pedido = new gestorAplicacion.gestion.Pedido(this, 0, direcc, tiempo_mayor + tiempo_transporte, producto  );
		this.pedido.add(pedido);
	}
	
	public void cancelarPedido() {
		//this.pedido.clear();
		pedido.get(pedido.size()-1).setEstado(gestorAplicacion.gestion.Pedido.ESTADO_CANCELADO);// mejorar mañana 
	}
	
	public void cancelarDeuda() {
		//JOOOJOJJJOJOJOJOJOJOJOJOJOJOJ
	}
	
	public void logout() {
			
	}
}
