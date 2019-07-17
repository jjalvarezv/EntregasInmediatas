package gestorAplicacion.personas;
import uiMain.Main;
import uiMain.MenuConsola;
import Datos.Data;

public abstract class UsuarioRegistrado {
	private String userName;
	private String pass;
	private String nombre;
	private Long cedula;
	private MenuConsola menu;
	//public String rol;-----DUDA----
	
	public UsuarioRegistrado() {}
	public UsuarioRegistrado(String userName, String pass, String nombre, Long cc) {
		this.userName = userName;
		this.pass = pass;
		this.nombre = nombre;
		this.cedula = cc;
		Data.usuarios.put(userName, this);
		
	}
	public String getPass() {
		return this.pass;
	}
<<<<<<< HEAD
	public long getCedula() {
		return this.cedula;
	}
=======
>>>>>>> 77efca06310b7746c76ae7042a26045c90d6baea
	
	public MenuConsola getMenu() {
		return menu;
	}
	
	public abstract void logout();
	
	public static String login(String username, String pass) {
		UsuarioRegistrado us = Data.usuarios.get(username);
		if (us != null) {
			if(us.getPass().equals(pass)) {
				Main.user = us;
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
<<<<<<< HEAD
	
	public static UsuarioRegistrado getUserByUsername(String username){
		return Data.usuarios.get(username);
    }
	
	public void setMenu(MenuConsola menu) {
		this.menu = menu;
	}
	
=======
	
	public static UsuarioRegistrado getUserByUsername(String username){
		return Data.usuarios.get(username);
    }
	
	public void setMenu(MenuConsola menu) {
		this.menu = menu;
	}
	
>>>>>>> 77efca06310b7746c76ae7042a26045c90d6baea
	public String getUsername() {
		return userName;
	}
	
}
