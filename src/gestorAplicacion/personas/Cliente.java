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
	
	public void setDireccion(String dir) {
		this.direccion = dir;
	}
	
	public String getDireccion() {
		return this.direccion;
	}
	
	public void cancelarDeuda() {
		//JOOOJOJJJOJOJOJOJOJOJOJOJOJOJ
	}
	
	public void logout() {
			
	}
}
