package gestorAplicacion.gestion;
import gestorAplicacion.personas.*;
import java.util.*;

public class Pedido {

	private ArrayList<Item> producto;
	private Cliente cliente;
	private Domiciliario domicilio;
	private int  direccion, tiempo_entrega;	
	private long IdPedido;
	private int estado;
	
<<<<<<< HEAD
	public static final int  ESTADO_PENDIENTE= 0;
	public static final int  ESTADO_CANCELADO= 1;
	public static final int  ESTADO_ELIMINADO= 2;
	
	public Pedido() {
		
	}
	public Pedido(Cliente clt, long IdPed, int direcc, int tiempo, ArrayList<Item> producto ) {
=======
	public Pedido(Cliente clt, int IdPed, int direcc, int tiempo, ArrayList<Item> producto ) {
>>>>>>> 77efca06310b7746c76ae7042a26045c90d6baea
		this.cliente= clt;
		this.IdPedido= IdPed;
		this.direccion= direcc;
		this.tiempo_entrega=tiempo;
		this.producto= producto;
<<<<<<< HEAD
		this.estado= ESTADO_PENDIENTE;
=======
>>>>>>> 77efca06310b7746c76ae7042a26045c90d6baea
	}
	public void modificarPedido(ArrayList<Item> nuevoProducto) {
		this.producto= nuevoProducto;
	}
	public void modificarPedido(int nuevoTiempo) {
		this.tiempo_entrega= nuevoTiempo;
<<<<<<< HEAD
	}
	public int getEstado() {
		return this.estado;
	}
	public void setEstado(int i) {
		this.estado = i;
=======
>>>>>>> 77efca06310b7746c76ae7042a26045c90d6baea
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
	
	 public long  getIdPedido() {
		 return this.IdPedido;
	 }
	
	 public int getDireccion() {
		 return this.direccion;
	 }
	 
	 public int getTiempoDeEntrega() {
		 return this.tiempo_entrega;
	 }
	
}
