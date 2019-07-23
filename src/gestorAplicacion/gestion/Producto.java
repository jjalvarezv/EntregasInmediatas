package gestorAplicacion.gestion;

public class Producto {
	
	private String id_prod;
	private int codigo_rest;
	private String nombre_producto;
	private int  valor_unidadad ;
	private int tiempo_de_preparacion;
	
	public Producto(String id, int codigo_rest, String nombre, int valor, int tiempo) {
		this.id_prod=id;
		this.codigo_rest= codigo_rest;
		this.nombre_producto= nombre;
		this.valor_unidadad= valor;
		this.tiempo_de_preparacion= tiempo;
	}
	public void  setValorUnidad(int nuevo_valor) {
		this.valor_unidadad= nuevo_valor;
	}
	public int getCodigoRestaurante() {
		return this.codigo_rest;
				
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
	public String getId() {
		return this.id_prod;
	}
}
