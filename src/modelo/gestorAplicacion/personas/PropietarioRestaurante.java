package modelo.gestorAplicacion.personas;

import modelo.gestorAplicacion.gestion.Producto;

public class PropietarioRestaurante extends UsuarioRegistrado{
	//private gestorAplicacion.gestion.Restaurante restaurante;
	private int codigoRestaurante; 
	//public PropietarioRestaurante jorge = new PropietarioRestaurante("rey_jorge", "xyz_rey", "Jorge Mario Paz", (long) 300250, restaurante.palitos);
	
	public PropietarioRestaurante(String userName, String pass, String nombre, Long cc, int CodRest) {
		super(userName, pass, nombre, cc);
		this.codigoRestaurante= CodRest;
		
	}
	public PropietarioRestaurante() {}
	
	public PropietarioRestaurante(String userName, String pass, String nombre, Long cc) {
		super(userName, pass, nombre, cc);
		
		
	}
	
	/*public void agregarProductos(Producto producto) {
		//Data.productos.put(producto.getId(), producto);
	}
	
	public void eliminarProductos() {
	
	}
	*/
	
	
	public void logout() {
		
	}
	
	public int getCodigo() {
		return this.codigoRestaurante;
	}

}
