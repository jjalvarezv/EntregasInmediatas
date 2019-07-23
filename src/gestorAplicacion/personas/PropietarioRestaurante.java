package gestorAplicacion.personas;
import Datos.Data;
import gestorAplicacion.gestion.Producto;

public class PropietarioRestaurante extends UsuarioRegistrado{
	private gestorAplicacion.gestion.Restaurante restaurante;
	public PropietarioRestaurante jorge = new PropietarioRestaurante("rey_jorge", "xyz_rey", "Jorge Mario Paz", (long) 300250, restaurante.palitos);
	
	public PropietarioRestaurante(String userName, String pass, String nombre, Long cc, gestorAplicacion.gestion.Restaurante rest) {
		super(userName, pass, nombre, cc);
		restaurante = rest;
	}
	
	public PropietarioRestaurante(String userName, String pass, String nombre, Long cc) {
		super(userName, pass, nombre, cc);
	}
	
	public void agregarProductos(Producto producto) {
		Data.productos.put(producto.getId(), producto);
	}
	
	public void eliminarProductos() {
	
	}
	
	public void logout() {
		
	}

}
