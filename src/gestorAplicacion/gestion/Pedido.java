package gestorAplicacion.gestion;
import gestorAplicacion.personas.*;
import java.util.*;

import Datos.Data;

public class Pedido {

	private ArrayList<Item> productos;
	private String cedulaCliente;
	private String userDomiciliario;
	private int codRestaurante;
	private String  direccion;
	private int tiempo_entrega;	
	private String IdPedido;
	private int estado;
	

	public static final int  ESTADO_PENDIENTE= 0;
	public static final int  ESTADO_CANCELADO= 1;
	public static final int  ESTADO_PAGADO = 2;
	
	public static final int  TIEMPO_TRANSPORTE = 40;
	
	public Pedido() {
		
	}
	
	
	/////
    // para pedir pedido despues del menu
	//Pedido pedido = new Pedido();
	//boolean pedidoSolicitado = pedido.solicitarPedido(cedulaCliente, codRestaurante, direcc, itemsProductos);
	//
	
	public boolean solicitarPedido(String cedulaCliente, int codRestaurante, String direcc,  ArrayList<Item> itemsProductos ) {

		this.cedulaCliente= cedulaCliente;
		this.codRestaurante= codRestaurante;
		this.direccion= direcc;
		this.productos= itemsProductos;
		this.estado= ESTADO_PENDIENTE;
		
		int tiempo_mayor= itemsProductos.get(0).getTiempo();		
		for(int x=0;x<itemsProductos.size();x++) {
			 if( itemsProductos.get(x).getTiempo() > tiempo_mayor) {
				 tiempo_mayor=  itemsProductos.get(x).getTiempo();
			 }
			}
		this.tiempo_entrega= tiempo_mayor;
		int tiempo_transporte= TIEMPO_TRANSPORTE;
		String id= cedulaCliente;
		int tamaño= Data.pedidos.size();
		id.concat(String.valueOf(tamaño));
		this.IdPedido  = id;
		//Cliente clt, int IdPed, int direcc, int tiempo, ArrayList<Item> producto
		
		HashMap<String, Domiciliario> domiciliarios  = Data.domiciliarios;
		
		/*variable auxiliar, para verificar si el pedido que acabamos de crear tiene un 
		 * domiciliario asignado
		*/
		
		boolean auxDomiciliarioPedido = false; 
		//recorremos la lista de domiciliarios para verificar cual domiciliario esta disponible
		for (String key : domiciliarios.keySet()) {
			Domiciliario domiciliario =   domiciliarios.get(key);
			
			// verificamos por estado de domiciliario cual tiene el estado disponible
			if (domiciliario.getEstado() == Domiciliario.ESTADO_DISPONIBLE  ) {
				
				//agregamos al objeto pédido el objeto doimiciliario
				this.userDomiciliario  = domiciliario.getUsername();
				
				// cambiamos el estado del domiciliario por un estado ocupado
				domiciliario.cambiarEstado(Domiciliario.ESTADO_OCUPADO);
				
				//cambiamos la variable auxiliar para que diga que diga si asiganamos domiciliario al pedido
				auxDomiciliarioPedido = true;
				break;
			}
		}
		
		if (auxDomiciliarioPedido) {
			Data.pedidos.put(IdPedido, this);
			return true;
		} else {
			return false;
		}
	}

	
	public ArrayList<Pedido> getPedidosByCliente(String cedulaCliente) {
		ArrayList<Pedido> pedidosEncontrados = new ArrayList<Pedido>();
		
		HashMap<String, Pedido> pedidos  = Data.pedidos;
		
		for (String key : pedidos.keySet()) {
			Pedido pedido =   pedidos.get(key);
			
			if (pedido.getCedulaCliente() == cedulaCliente  ) {
				
				pedidosEncontrados.add(pedido);
			}
		}

		return pedidosEncontrados;
		
	}
	
	
	public ArrayList<Pedido> getPedidosByRestaurante(int codRestuarante) {
		ArrayList<Pedido> pedidosEncontrados = new ArrayList<Pedido>();
		
		HashMap<String, Pedido> pedidos  = Data.pedidos;
		
		for (String key : pedidos.keySet()) {
			Pedido pedido =   pedidos.get(key);
			
			if (pedido.getCodRestaurante() == codRestuarante  ) {
				
				pedidosEncontrados.add(pedido);
			}
		}

		return pedidosEncontrados;
		
	}
	
	public ArrayList<Pedido> getPedidosByDomiciliario(String userDomiciliario) {
		ArrayList<Pedido> pedidosEncontrados = new ArrayList<Pedido>();
		
		HashMap<String, Pedido> pedidos  = Data.pedidos;
		
		for (String key : pedidos.keySet()) {
			Pedido pedido =   pedidos.get(key);
			
			if (pedido.getUserDomiciliario() == userDomiciliario  ) {
				
				pedidosEncontrados.add(pedido);
			}
		}

		return pedidosEncontrados;
		
	}
	

	public int getEstado() {
		return this.estado;
	}
	
	
	
	public void setEstado(int estado) {
		this.estado = estado;

	}
	
	public void cancelarPedido() {
		
	}
	
	public void confirmarPedido() {
		
	}
	
	public String getProductos() {
			for(Item it : productos){
				return it.getProducto().getNombreProducto();
			}
			return "";

		
	}
	
	public int getCantProdPedido() {
		return productos.size();
	}
	
	public String getCedulaCliente() {
		return this.cedulaCliente;
	}
	
	public String getUserDomiciliario() {
		return this.userDomiciliario;
	}
	
	public int getCodRestaurante() {
		return this.codRestaurante;
	}
	

	 public String  getIdPedido() {
		 return this.IdPedido;
	 }
	
	 public String getDireccion() {
		 return this.direccion;
	 }
	 
	 public int getTiempoDeEntrega() {
		 return this.tiempo_entrega;
	 }
	 public int calcularCostoPedido() {
		 int costo=0;
		
		 for (int i=0;i<this.productos.size();i++ ) {
			costo= costo+ productos.get(i).getTotal();
			 
		 }
		
		 return 5000+costo;
	 }
	 
	
}
