package gestorAplicacion.gestion;

public class Item {
	private int costo, cantidad, total;	
	private Producto producto;
	
	
	public static Item it= new Item();///prueba
	
	public Item() {
		
	}
	public Item( int cantidad, Producto prod) {
		
		this.cantidad= cantidad;
		this.producto= prod;
		this.total= cantidad*prod.getValorUnidad();
	}
	public int  getTiempo() {
		return producto.getTiempoDePreparacion();
	}

	public int getCosto() {
		return this.costo;
	}
	public int getCantidad() {
		return this.cantidad;
	}
	public int getTotal() {
		return this.total;
	}
	public Producto getProducto() {
		return this.producto;
	}

}
