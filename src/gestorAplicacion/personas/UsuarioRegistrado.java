package gestorAplicacion.personas;
import uiMain.Main;
import uiMain.MenuConsola;
import uiMain.MenuDeConsola;
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
	
	public abstract void logout();
	
	public static String login(String username, String pass) {
		UsuarioRegistrado us = Data.usuarios.get(username);
		if (us != null) {
			if(us.getPassword().equals(pass)) {
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

	
	public static UsuarioRegistrado getUserByUsername(String username){
		return Data.usuarios.get(username);
    }
	
	public String getNom() {
		return nombre;
	}

	public void setNom(String name) {
		this.nombre = name;
	}

	public String getUsername() {
		return userName;
	}

	public void setUsername(String username) {
		this.userName = username;
	}

	public String getPassword() {
		return pass;
	}

	public void setPassword(String password) {
		this.pass = password;
	}
	
	public MenuConsola getMenu() {
		return menu;
	}

	public void setMenu(MenuConsola menu) {
		this.menu = menu;
	}
	
	public void setCedula(Long cc) {
		this.cedula = cc;
	}
	
	public long getCedula() {
		return cedula;
	}
	
}
