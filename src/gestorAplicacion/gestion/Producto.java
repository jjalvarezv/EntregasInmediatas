package gestorAplicacion.gestion;

public class Producto {

	private Restaurante restaurante;
	private String nombre_producto;
	private int  valor_unidadad ;
	private int tiempo_de_preparacion;
	
	public Producto(Restaurante rest, String nombre, int valor, int tiempo) {
		this.restaurante= rest;
		this.nombre_producto= nombre;
		this.valor_unidadad= valor;
		this.tiempo_de_preparacion= tiempo;
	}
	public void  setValorUnidad(int nuevo_valor) {
		this.valor_unidadad= nuevo_valor;
	}
	public Restaurante   getRestaurante() {
		return this.restaurante;
				
	}
	public String getNombreProducto() {
		return this.nombre_producto;
	}
	public int getValorUnidad() {
		return this.valor_unidadad;
	}
	public int getTiempoDePreparacion() {
		return this.tiempo_de_preparacion;
	}
}
