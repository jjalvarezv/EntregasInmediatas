package gestorAplicacion.personas;

public class PropietarioRestaurante extends UsuarioRegistrado{
	public gestorAplicacion.gestion.Restaurante restaurante;
	
	public PropietarioRestaurante(String userName, String pass, String nombre, Long cc, gestorAplicacion.gestion.Restaurante rest) {
		super(userName, pass, nombre, cc);
		restaurante = rest;
	}
	
	public void modificarProductos() {
		
	}
	
	public void logout() {
		
	}
}
