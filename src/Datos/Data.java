package Datos;
import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import gestorAplicacion.gestion.Pedido;
import gestorAplicacion.gestion.Producto;
import gestorAplicacion.gestion.Restaurante;
import gestorAplicacion.personas.*;
import gestorAplicacion.personas.Admin;
import gestorAplicacion.personas.UsuarioRegistrado;
import uiMain.MenuConsola;
import uiMain.OpcionesMenu;

public class Data {
	public static HashMap<String, UsuarioRegistrado> usuariosRegistrados = new HashMap<String, UsuarioRegistrado>();
	public static HashMap<String, OpcionesMenu> operaciones = new HashMap<String, OpcionesMenu>();
	public static HashMap<String, MenuConsola> menus = new HashMap<String, MenuConsola>();
	public static HashMap<String, Cliente> clientes = new HashMap<String, Cliente>();
	public static HashMap<String, PropietarioRestaurante> propietarios = new HashMap<String, PropietarioRestaurante>();
	public static HashMap<String, Restaurante> restaurantes = new HashMap<String, Restaurante>();
	public static HashMap<String, Admin> admins = new HashMap<String, Admin>();
	public static HashMap<String, Producto> productos = new HashMap<String, Producto>();


	
	// hashmap de los domiciliarios que hay
	public static HashMap<String, Domiciliario> domiciliarios = new HashMap<String, Domiciliario>();
	
	// hashmap de los pedidos que hay
	public static HashMap<String, Pedido> pedidos = new HashMap<String, Pedido>();
	
	
	public static void saveData() {
		createFilesAndDirs();
		String ruta = System.getProperty("user.dir")+"\\src\\temp\\";
		//GuardarUsuarios(ruta);
		//saveMenus(ruta);
	}
	
	//este metodo es para guardar los usuarios de cualquier tipo en el txt
	private static void GuardarUsuarios(String ruta){
		try {
            FileWriter fwCl = new FileWriter(ruta+"clientes.txt");
            FileWriter fwAd = new FileWriter(ruta+"admin.txt");
            FileWriter fwDom = new FileWriter(ruta+"domiciliarios.txt");
            FileWriter fwPro = new FileWriter(ruta+"propietarioRestaurante.txt");
            
            PrintWriter pwCl = new PrintWriter(fwCl);
            PrintWriter pwAd = new PrintWriter(fwAd);
            PrintWriter pwDom = new PrintWriter(fwDom);
            PrintWriter pwPro = new PrintWriter(fwPro);
    		for (Map.Entry<String, UsuarioRegistrado> user : usuariosRegistrados.entrySet()) {
    			UsuarioRegistrado userObj = user.getValue();
    			String line = userObj.getUsername()+";";
    			line += userObj.getPassword()+";";
    			line += userObj.getNom()+";";
    			line += userObj.getCedula();
    			if(userObj instanceof Admin) {
    				pwAd.println(line);
					
				}
    			else if(userObj instanceof Domiciliario) {
					pwDom.println(line);
    			}
    			else if(userObj instanceof PropietarioRestaurante) {
					pwPro.println(line);
    			}
    			else {
    				pwCl.println(line);
    			}
    		}
            pwCl.close();
            pwAd.close();
            pwDom.close();
            pwPro.close();
            
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
	
	public static void CargarData() {
		createFilesAndDirs();
		String ruta = System.getProperty("user.dir")+"\\src\\textos\\";
		CargarAdmin(ruta);
		CargarClientes(ruta);
		CargarDomiciliarios(ruta);
		CargarPropetarioRestaurante(ruta);
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
	private static void CargarAdmin(String ruta) {
		try{
            FileReader fr = new FileReader(ruta+"admin.txt");
            BufferedReader br = new BufferedReader(fr);
            String line;
            while((line = br.readLine()) != null){
            	if (!line.isEmpty()) {
            		String [] user = line.split(";");
            		String username = user[0];
            		String password = user[1];
            		String name = user[2];
            		String cc = user[3];
            		Admin admin = new Admin(username, password, name, Long.parseLong(cc));
            		Data.admins.put(username,admin);
            		Data.usuariosRegistrados.put(username, admin);
            	}
            }
            br.close();
		}catch(IndexOutOfBoundsException e) {
			System.out.print("Error de numberformatException\n");
        }catch(Exception e){
            System.out.print("Error al cargar admins\n");
        }
	}
	private static void CargarClientes(String ruta) {
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
            		Data.clientes.put(username,cliente);
            		Data.usuariosRegistrados.put(username, cliente);
            	}
            }
            br.close();
        }
		catch(Exception e){
			System.out.print("Error al cargar clientes\n");
        }
	}
	private static void CargarDomiciliarios(String ruta) {
		try{
			FileReader fr = new FileReader(ruta+"domiciliarios.txt");
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
            		Data.usuariosRegistrados.put(username, dom);
            	}
            }
            br.close();
        }
		catch(Exception e){
			System.out.print("Error al cargar domiciliarios\n");
        }
	}
	private static void CargarPropetarioRestaurante(String ruta) {
		try{
            FileReader fr = new FileReader(ruta+"propietarioRestaurante.txt");
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
            		Data.usuariosRegistrados.put(username, pr);
            		}
            }
            br.close();
		}catch(NumberFormatException e) {
			System.out.print("Error de numberformatException\n");
		}catch(IndexOutOfBoundsException e) {
			System.out.print("Error de index\n");
        }catch(Exception e){
			System.out.print("Error al cargar Propietarios de Restaurante\n");
        }
	}
	
	private static void createFilesAndDirs() {
		try {
		String ruta = System.getProperty("user.dir")+"\\src\\textos\\";
		File directory = new File(ruta);
	    if (! directory.exists()){
	        directory.mkdir();
	    }
		File usuariosRegistradosFile = new File(ruta+"clientes.txt");
		File usuariosAdminFile = new File(ruta+"admins.txt");
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