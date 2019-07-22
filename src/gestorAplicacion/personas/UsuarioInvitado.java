package gestorAplicacion.personas;

public class UsuarioInvitado {
	public void RegistrarseCliente(String userName, String pass, String nombre, Long cc, String direccion) {
		//String userName, String pass, String nombre, Long cc, String direccion
		Cliente nuevoCliente = new Cliente(userName, pass, nombre, cc, direccion);
	}
	

}
