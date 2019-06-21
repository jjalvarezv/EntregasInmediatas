package gestorAplicacion.personas;

public abstract class UsuarioRegistrado {
	private String userName;
	private String pass;
	private String nombre;
	private Long cedula;
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
