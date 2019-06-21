package gestorAplicacion.gestion;

public class Item {
	private int costo, cantidad, total;	
	private Producto producto;
	
	public Item() {
		
	}
	public Item(int costo, int cantidad, Producto prod, int total) {
		this.costo= costo;
		this.cantidad= cantidad;
		this.producto= prod;
		this.total= total;
	}
	public void  calcularTotal() {
		
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
