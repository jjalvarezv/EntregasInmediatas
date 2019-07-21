package gestorAplicacion.gestion;
import gestorAplicacion.personas.*;
import java.util.*;

public class Pedido {

	private ArrayList<Item> producto;
	private Cliente cliente;
	private Domiciliario domiciliario;
	private int  direccion, tiempo_entrega;	
	private long IdPedido;
	private int estado;
	

	public static final int  ESTADO_PENDIENTE= 0;
	public static final int  ESTADO_CANCELADO= 1;
	public static final int  ESTADO_ELIMINADO= 2;
	
	public Pedido() {
		
	}
	

	
	public Pedido(Cliente clt, int IdPed, int direcc, int tiempo, ArrayList<Item> producto ) {

		this.cliente= clt;
		this.IdPedido= IdPed;
		this.direccion= direcc;
		this.tiempo_entrega=tiempo;
		this.producto= producto;
		this.estado= ESTADO_PENDIENTE;

	}
	public void modificarPedido(ArrayList<Item> nuevoProducto) {
		this.producto= nuevoProducto;
	}
	public void modificarPedido(int nuevoTiempo) {
		this.tiempo_entrega= nuevoTiempo;

	}
	public int getEstado() {
		return this.estado;
	}
	public void setEstado(int i) {
		this.estado = i;

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
	
	public Domiciliario getDomiciliario() {
		return this.domiciliario;
	}
	
	public void setDomiciliario(Domiciliario domiciliario) {
		this.domiciliario = domiciliario;
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
