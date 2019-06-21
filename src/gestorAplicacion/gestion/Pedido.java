package gestorAplicacion.gestion;
import gestorAplicacion.personas.*;
import java.util.*;

public class Pedido {

	private ArrayList<Item> producto;
	private Cliente cliente;
	private Domiciliario domicilio;
	private int IdPedido, direccion, tiempo_entrega;
	
	public Pedido(Cliente clt, int IdPed, int direcc, int tiempo) {
		this.cliente= clt;
		this.IdPedido= IdPed;
		this.direccion= direcc;
		this.tiempo_entrega=tiempo;
	}
	public void modificarPedido() {
		
	}
	
	public void cancelarPedido() {
		
	}
	
	public void confirmarPedido() {
		
	}
	
	public ArrayList<Item> getProducto() {
		return this.producto;
	}
	
	public Cliente getCliente() {
		return this.cliente;
	}
	
	public Domiciliario getDomicilio() {
		return this.domicilio;
	}
	
	 public int getIdPedido() {
		 return this.IdPedido;
	 }
	
	 public int getDireccion() {
		 return this.direccion;
	 }
	 
	 public int getTiempoDeEntrega() {
		 return this.tiempo_entrega;
	 }
	
}
