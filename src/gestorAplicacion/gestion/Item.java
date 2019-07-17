package gestorAplicacion.gestion;

public class Item {
	private int costo, cantidad, total;	
	private Producto producto;
	
	
	public static Item it= new Item();///prueba
	
	public Item() {
		
	}
	public Item( int cantidad, Producto prod, int total) {
		
		this.cantidad= cantidad;
		this.producto= prod;
		this.total= total;
	}
	public int  getTiempo() {
		return producto.getTiempoDePreparacion();
	}
	public void  calcularTotal() {
		costo= cantidad* producto.getValorUnidad(); // el costo es la cantidad de productos, por el precio de cada uno
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
