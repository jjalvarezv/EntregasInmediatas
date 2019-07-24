package gestorAplicacion.personas;
import uiMain.Main;
import uiMain.MenuConsola;
import Datos.Data;
import gestorAplicacion.personas.UsuarioRegistrado;

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
		
	}
	
	public abstract void logout();
	
	public static String login(String username, String pass) {
		UsuarioRegistrado us = Data.usuariosRegistrados.get(username);
		if (us != null) {
			if(us.getPassword().equals(pass)) {
				Main.user = us;
				return "Bienvenido " + username;
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
		return Data.usuariosRegistrados.get(username);
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
	
	public static String newCliente(String username, String password, String name, Long cc, String direccion){
		Cliente user = new Cliente();// ya si la puedo hace ggg....NO PUEDO HACER ESTA MIERDDDAAAAAAAAAAAAAAAAAAA
		//Validaciones de cada parametro
		user.setNom(name);
		user.setUsername(username);
		user.setCedula(cc);
		user.setPassword(password);
		user.setDireccion(direccion);
		
		//Menu por defecto al crear un nuevo usuario
		String [] operations = {"5","6", "12", "12"};
		MenuConsola.newMenu(user, operations);
		if(true){
			Data.usuariosRegistrados.put(username,user);
			return "Ha sido creado";
		}else{
			return "No ha sido creado...";
		}
	}
	
	public static String newDomiciliario(String username, String password, String nombre, Long cc) {
		Domiciliario dom = new Domiciliario();
		if (Data.usuariosRegistrados.get(username) == null) {
			dom.setUsername(username);
			dom.setPassword(password);
			dom.setNom(nombre);
			dom.setCedula(cc);
			String [] operations = {"5","7","8"};
			MenuConsola.newMenu(dom, operations);
			return "Ha sido creado";
		}
		else {
			return "No ha sido creado";
		}
	}
	public static String newPropietario(String username, String password, String nombre, Long cc) {
		PropietarioRestaurante prop = new PropietarioRestaurante();
		if (Data.usuariosRegistrados.get(username) == null) {
			prop.setUsername(username);
			prop.setPassword(password);
			prop.setNom(nombre);
			prop.setCedula(cc);
			String [] operations = {"5","13","14"};
			MenuConsola.newMenu(prop, operations);
			return "Ha sido creado";
		}
		else {
			return "No ha sido creado";
		}
	}
}
