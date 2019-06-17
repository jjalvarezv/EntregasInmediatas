package gestorAplicacion.personas;

public abstract class UsuarioRegistrado {
	public String userName;
	public String pass;
	public String nombre;
	public Long cedula;
	//public String rol;-----DUDA----
	
	public UsuarioRegistrado() {}
	public UsuarioRegistrado(String userName, String pass, String nombre, Long cc) {
		this.userName = userName;
		this.pass = pass;
		this.nombre = nombre;
		this.cedula = cc;
	}
	
	public abstract void logout();
	
	
	
}
