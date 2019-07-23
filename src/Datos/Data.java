package Datos;
import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import gestorAplicacion.gestion.Pedido;
import gestorAplicacion.gestion.Restaurante;
import gestorAplicacion.personas.*;
import gestorAplicacion.personas.Admin;
import gestorAplicacion.personas.UsuarioRegistrado;
import uiMain.MenuConsola;
import uiMain.OpcionesMenu;

public class Data {
	public static HashMap<String, OpcionesMenu> operaciones = new HashMap<String, OpcionesMenu>();
	public static HashMap<String, MenuConsola> menus = new HashMap<String, MenuConsola>();
	public static HashMap<String, Cliente> usuarios = new HashMap<String, Cliente>();
	public static HashMap<String, PropietarioRestaurante> propietarios = new HashMap<String, PropietarioRestaurante>();
	public static HashMap<String, Restaurante> restaurantes = new HashMap<String, Restaurante>();
	public static HashMap<String, Admin> admins = new HashMap<String, Admin>();

	
	// hashmap de los domiciliarios que hay
	public static HashMap<String, Domiciliario> domiciliarios = new HashMap<String, Domiciliario>();
	
	// hashmap de los pedidos que hay
	public static HashMap<String, Pedido> pedidos = new HashMap<String, Pedido>();
	
	
	public static void cargarAdmin(String ruta) throws IOException {
		
		File archivo = new File(ruta);
		try {
			FileReader fr = new FileReader (archivo);
			BufferedReader br = new BufferedReader(fr);
			String linea;
			while((linea=br.readLine())!=null) {
				if (!linea.isEmpty()) {
            		String [] ADMIN = linea.split(";");
            		String username = ADMIN[0];
            		String pass = ADMIN[1];
            		String nombre = ADMIN[2];
            		String cc = ADMIN[3];
            		new Admin(username, pass, nombre, Long.parseLong(cc));
				} 
			}
			br.close();
		}
		catch (FileNotFoundException e) {
			System.err.println("No se encontró el archivo");
		}
	}
	
	public static void saveData() {
		createFilesAndDirs();
		String ruta = System.getProperty("user.dir")+"\\src\\temp\\";
		saveUsers(ruta);
		saveMenus(ruta);
	}
	
	//este metodo no tengo muy claro para que es .....
	private static void saveUsers(String ruta){
		try {
            FileWriter fw = new FileWriter(ruta+"users.txt");
            FileWriter fwAdmin = new FileWriter(ruta+"adminUsers.txt");
            PrintWriter pw = new PrintWriter(fw);
            PrintWriter pwAdmin = new PrintWriter(fwAdmin);
    		for (Map.Entry<String, User> user : users.entrySet()) {
    			User userObj = user.getValue();
    			String line = userObj.getUsername()+";";
    			line += userObj.getName()+";";
    			line += userObj.getEmail()+";";
    			line += userObj.getPassword();
    			if(userObj instanceof AdminUser) {
    				pwAdmin.println(line);
					
				}else {
					pw.println(line);
    			}
    		}
            pw.close();
            pwAdmin.close();
            
        } catch (IOException ioObj) {
        	//Ocurrio algo al guardar en txt los datos
        }
	}
	
	private static void saveMenus(String ruta){
		try {
            FileWriter fw = new FileWriter(ruta+"usersMenus.txt");
            PrintWriter pw = new PrintWriter(fw);
    		for (Map.Entry<String, MenuDeConsola> menu : menus.entrySet()) {
    			MenuDeConsola menuObj = menu.getValue();
    			String line = menuObj.getUser().getUsername()+";";
    			for (String  opt : menuObj.getOperations()) {
    				line += opt+";";
				}
    			//Correccion por el ; extra
    			pw.println(line.substring(0,(line.length()-1)));
    		}
            pw.close();
            
        } catch (IOException ioObj) {
        	//Ocurrio algo al guardar en txt los datos
        }
	}
	
	public static void loadData() {
		createFilesAndDirs();
		String ruta = System.getProperty("user.dir")+"\\src\\temp\\";
		loadUsers(ruta);
		loadAdminUsers(ruta);
		loadMenus(ruta);
	}
	
	private static void loadMenus(String ruta) {
		try{
            FileReader fr = new FileReader(ruta+"usersMenus.txt");
            BufferedReader br = new BufferedReader(fr);
            String line;
            while((line = br.readLine()) != null){
            	if (!line.isEmpty()) {
            		String [] menu = line.split(";");
            		User user = User.getUserByUsername(menu[0]);
            		//slice de arrays
            		String[] operations = Arrays.copyOfRange(menu, 1, menu.length);
            		MenuDeConsola.newMenu(user, operations);
            	}
            }
            br.close();
        }catch(Exception e){
        	//Error al leer
        }
	}
	
	private static void loadUsers(String ruta) {
		try{
            FileReader fr = new FileReader(ruta+"clientes.txt");
            BufferedReader br = new BufferedReader(fr);
            String line;
            while((line = br.readLine()) != null){
            	if (!line.isEmpty()) {
            		String [] user = line.split(";");
            		String username = user[0];
            		String password = user[1];
            		String name = user[2];
            		String cc = user[3];
            		String direccion = user[4];
            		Cliente cliente = new Cliente(username, password, name, Long.parseLong(cc),direccion);
            		Data.usuarios.put(username,cliente);
            	}
            }
            br.close();
        }catch(Exception e){
            //Error al leer
        }
		
		try{
            FileReader fr = new FileReader(ruta+"Domiciliario.txt");
            BufferedReader br = new BufferedReader(fr);
            String line;
            while((line = br.readLine()) != null){
            	if (!line.isEmpty()) {
            		String [] user = line.split(";");
            		String username = user[0];
            		String password = user[1];
            		String name = user[2];
            		String cc = user[3];
            		Domiciliario dom = new Domiciliario(username, password, name, Long.parseLong(cc));
            		Data.domiciliarios.put(username,dom);
            	}
            }
            br.close();
        }catch(Exception e){
            //Error al leer
        }
		
		try{
            FileReader fr = new FileReader(ruta+"PropietarioRestaurantes.txt");
            BufferedReader br = new BufferedReader(fr);
            String line;
            while((line = br.readLine()) != null){
            	if (!line.isEmpty()) {
            		String [] user = line.split(";");
            		String username = user[0];
            		String password = user[1];
            		String name = user[2];
            		String cc = user[3];
            		PropietarioRestaurante pr = new PropietarioRestaurante(username, password, name, Long.parseLong(cc));
            		Data.propietarios.put(username,pr);
            		}
            }
            br.close();
        }catch(Exception e){
            //Error al leer
        }
	}
	
	private static void loadAdminUsers(String ruta) {
		try{
            FileReader fr = new FileReader(ruta+"admins.txt");
            BufferedReader br = new BufferedReader(fr);
            String line;
            while((line = br.readLine()) != null){
            	if (!line.isEmpty()) {
            		String [] user = line.split(";");
            		String username = user[0];
            		String password = user[1];
            		String name = user[2];
            		String cc = user[3];
            		Admin ad = new Admin(username, password, name, Long.parseLong(cc));
            		Data.admins.put(username,ad);
            	}
            }
            br.close();
        }catch(Exception e){
        	//Error al leer
        }
	}
	
	
	private static void createFilesAndDirs() {
		try {
		String ruta = System.getProperty("user.dir")+"\\src\\temp\\";
		File directory = new File(ruta);
	    if (! directory.exists()){
	        directory.mkdir();
	    }
		File usuariosRegistradosFile = new File(ruta+"users.txt");
		File usuariosAdminFile = new File(ruta+"adminUsers.txt");
		File usuariosMenus = new File(ruta+"usersMenus.txt");
		usuariosRegistradosFile.createNewFile();
		usuariosAdminFile.createNewFile();
		}
		catch(IOException e){
			//Ocurrio algo al crear las carpetas y los archivos
		}
	}
}


//"C:\\Users\\USUARIO\\Desktop\\datos.txt"