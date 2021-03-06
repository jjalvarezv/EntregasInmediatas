package modelo.gestorAplicacion.personas;


import modelo.Datos.Data;
import modelo.gestorAplicacion.personas.UsuarioRegistrado;

public abstract class UsuarioRegistrado {
	private String userName;
	private String pass;
	private String nombre;
	private Long cedula;
	//private MenuConsola menu;
	//public String rol;-----DUDA----
	
	public UsuarioRegistrado() {}
	public UsuarioRegistrado(String userName, String pass, String nombre, Long cc) {
		this.userName = userName;
		this.pass = pass;
		this.nombre = nombre;
		this.cedula = cc;
		
	}
	
	public abstract void logout();
	
	public static boolean login(String username, String pass) {
		UsuarioRegistrado us = Data.usuariosRegistrados.get(username);
		if (us != null) {
			if(us.getPassword().equals(pass)) {
				return true;
			}
			else {
				return false;
				
			}
		}
		else {
			return false;
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

	public void setCedula(Long cc) {
		this.cedula = cc;
	}
	
	public long getCedula() {
		return cedula;
	}
	
	public static String newCliente(String username, String password, String name, Long cc, String direccion){
		Cliente user = new Cliente();
		//Validaciones de cada parametro
		user.setNom(name);
		user.setUsername(username);
		user.setCedula(cc);
		user.setPassword(password);
		user.setDireccion(direccion);
		
		//Menu por defecto al crear un nuevo usuario
		String [] operations = {"5","6", "12", "12"};
		//MenuConsola.newMenu(user, operations);
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
			//MenuConsola.newMenu(dom, operations);
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
			//MenuConsola.newMenu(prop, operations);
			return "Ha sido creado";
		}
		else {
			return "No ha sido creado";
		}
	}
	
	//Este metodo retorna el tipo de usuario que se esta loggeando
	public static String TipoUser(String user) {

		UsuarioRegistrado u =Data.usuariosRegistrados.get(user);
		if (u instanceof Cliente == true) {
			return "cliente";
		}else if(u instanceof Admin == true) {
			return "admin";
		}else if(u instanceof PropietarioRestaurante == true) {
			return "propietario";
		}else if(u instanceof Domiciliario == true) {
			return "domiciliario";
		}else {
			return "no";
		}
	}
	
	
}
