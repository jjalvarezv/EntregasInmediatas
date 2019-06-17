package gestorAplicacion.personas;
import java.util.*;

public class Cliente extends UsuarioRegistrado{
	public ArrayList<gestorAplicacion.gestion.Pedido> pedido;
	public String direccion;
	
	public Cliente() {}
	public Cliente(String userName, String pass, String nombre, Long cc, 
			gestorAplicacion.gestion.Pedido pedido, String direccion) {
		super(userName, pass, nombre, cc);
		this.pedido.add(pedido);
		this.direccion = direccion;
		
	}
	
	public void solicitarPedido() {
		
	}
	
	public void cancelarPedido() {
		
	}
	
	public void cancelarDeuda() {
		//JOOOJOJJJOJOJOJOJOJOJOJOJOJOJ
	}
	
	public void logout() {
			
	}
}
