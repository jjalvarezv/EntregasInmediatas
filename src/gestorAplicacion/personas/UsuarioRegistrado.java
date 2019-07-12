package gestorAplicacion.personas;
import uiMain.Main;
import Datos.Data;

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
		Data.Usuarios.put(userName, this);
		
	}
	public String getPass() {
		return this.pass;
	}
	
	public abstract void logout();
	
	public static String login(String username, String pass) {
		UsuarioRegistrado us = Data.Usuarios.get(username);
		if (us != null) {
			if(us.getPass().equals(pass)) {
				Main.usuario = us;
				return "Bienvenido" + username;
			}
			else {
				return "Contraseña invalida";
			}
		}
		else {
			return "Usuario no encontrado";
		}
	}
	
}
