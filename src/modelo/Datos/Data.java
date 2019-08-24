package modelo.Datos;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


import modelo.gestorAplicacion.gestion.Pedido;
import modelo.gestorAplicacion.gestion.Producto;
import modelo.gestorAplicacion.gestion.Restaurante;
import modelo.gestorAplicacion.personas.*;
import modelo.gestorAplicacion.personas.Admin;
import modelo.gestorAplicacion.personas.UsuarioRegistrado;
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
	
	//Guardar los datos para cerrar el proyecto
	public void saveData() {
		createFilesAndDirs();
		String ruta = System.getProperty("user.dir")+"\\src\\temp\\";
		GuardarUsuarios(ruta);
		//GuardarMenus(ruta);
		GuardarRestaurantes(ruta);
		GuardarPedidos(ruta);
	}
	
	private void GuardarPedidos(String ruta) {
		try {
			PrintWriter writer = new PrintWriter(ruta+"pedidos.txt"); 
			for (Map.Entry<String, Pedido> entry:pedidos.entrySet()) {
				Pedido ped = entry.getValue();
				writer.print(ped.getProductos()+";"+ped.getCedulaCliente()+";"+ped.getUserDomiciliario()+";"+ped.getCodRestaurante()+";"+ped.getDireccion());
				
			}
			writer.close();
		}catch (IOException e){
			System.out.print("Error al guardar pedidos");
		}
	}
	
	
	//este metodo es para guardar los usuarios de cualquier tipo en el txt
	private void GuardarUsuarios(String ruta){
		try {
            FileWriter fwCl = new FileWriter(ruta+"clientes.txt");
            FileWriter fwAd = new FileWriter(ruta+"admin.txt");
            FileWriter fwDom = new FileWriter(ruta+"domiciliarios.txt");
            FileWriter fwPro = new FileWriter(ruta+"propietarioRestaurante.txt");
            
            PrintWriter pwCl = new PrintWriter(fwCl);
            PrintWriter pwAd = new PrintWriter(fwAd);
            PrintWriter pwDom = new PrintWriter(fwDom);
            PrintWriter pwPro = new PrintWriter(fwPro);
            
    		for (Map.Entry<String, UsuarioRegistrado> user : Data.usuariosRegistrados.entrySet()) {
    			UsuarioRegistrado userObj = user.getValue();
    			String line = userObj.getUsername()+";"+userObj.getPassword()+";"+userObj.getNom()+";"+userObj.getCedula();
    			/*line += userObj.getPassword()+";";
    			line += userObj.getNom()+";";
    			line += userObj.getCedula();*/
    			
    			if(userObj instanceof Admin) {
    				pwAd.println(line);
				}
    			else if(userObj instanceof Domiciliario) {
					pwDom.println(line);
    			}
    			else if(userObj instanceof PropietarioRestaurante) {
					pwPro.println(line);
    			}
    			else if(userObj instanceof Cliente){
    				Cliente cl = (Cliente)userObj;
    				pwCl.println(userObj.getUsername()+";"+userObj.getPassword()+";"+userObj.getNom()+";"+userObj.getCedula()+";"+cl.getDireccion());
    			}
    		}
            pwCl.close();
            pwAd.close();
            pwDom.close();
            pwPro.close();
            
        } catch (IOException ioObj) {

        	System.out.print("Ocurrio algo al guardar en txt los datos    "+ioObj);

        	

        }
	}
	
	//Este metodo guarda lo menus de cada usuario, muestra los numeros de cada opcion de menu separando todo con ;
	/*private void GuardarMenus(String ruta){
		try {
            FileWriter fw = new FileWriter(ruta+"MenusDeUsuarios.txt");
            PrintWriter pw = new PrintWriter(fw);
    		for (Map.Entry<String, MenuConsola> menu : menus.entrySet()) {
    			MenuConsola menuObj = menu.getValue();
    			//String line = menuObj.getUser().getUsername()+";";
    			//for (String  opt : menuObj.getOperations()) {
    			//	line += opt+";";
				//}
    			//Correccion por el ; extra
    			//pw.println(line.substring(0,(line.length()-1)));
    		}
    		
            pw.close();
            
        } catch (IOException ioObj) {
        	System.out.print("Ocurrio algo al guardar en txt los datos");
        }
	}*/
	
	//Este metodo guarda los restaurantes en el txt restaurantes.txt
	private void GuardarRestaurantes(String ruta){
		try {
            FileWriter fw = new FileWriter(ruta+"restaurantes.txt");
            PrintWriter pw = new PrintWriter(fw);
    		for (Map.Entry<String, Restaurante> rest : restaurantes.entrySet()) {
    			Restaurante restObj = rest.getValue();
    			String line = restObj.getNombre()+";"+restObj.getCodigo()+";"+restObj.getDireccion()+";"+restObj.getCedulaPropietario()+";"+restObj.getTelefono();
    			pw.println(line);
    			//Correccion por el ; extra
    		}
            pw.close();
            
        } catch (IOException ioObj) {
        	System.out.print("Ocurrio algo al guardar en txt los datos de los restaurantes");
        }
	}
	
	//cargar datos de el sistema
	public void CargarData() {
		createFilesAndDirs();
		String ruta = System.getProperty("user.dir")+"\\src\\temp\\";
		CargarAdmin(ruta);
		CargarClientes(ruta);
		CargarDomiciliarios(ruta);
		CargarPropetarioRestaurante(ruta);
		CargarRestaurantes(ruta);
		CargarProductos(ruta);
	}
	
	/*
	private static void loadMenus(String ruta) {
		try{
            FileReader fr = new FileReader(ruta+"MenusDeUsuarios.txt");
            BufferedReader br = new BufferedReader(fr);
            String line;
            while((line = br.readLine()) != null){
            	if (!line.isEmpty()) {
            		String [] menu = line.split(";");
            		UsuarioRegistrado user = UsuarioRegistrado.getUserByUsername(menu[0]);
            		
            		String[] operations = Arrays.copyOfRange(menu, 1, menu.length);
            		//MenuConsola.newMenu(user, operations);
            	}
            }
            br.close();			
        }catch(Exception e){
        	System.out.print("Error al leer");
        }
	}
	*/
	
	//este metodo carga los administradores del txt
	private void CargarAdmin(String ruta) {
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
            PrintWriter writer = new PrintWriter(ruta+"admin.txt"); writer.print(""); writer.close(); 
		}catch(IndexOutOfBoundsException e) {
			System.out.print("Error de numberformatException\n");
        }catch(Exception e){
            System.out.print("Error al cargar admins\n");
        }
	}
	
	//metodo para cargar clientes
	private void CargarClientes(String ruta) {
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
            PrintWriter writer = new PrintWriter(ruta+"clientes.txt"); writer.print(""); writer.close(); 
        }
		catch(Exception e){
			System.out.print("Error al cargar clientes     "+e);
        }
	}
	
	//metodo que carga clientes
	private void CargarDomiciliarios(String ruta) {
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
            PrintWriter writer = new PrintWriter(ruta+"domiciliarios.txt"); writer.print(""); writer.close(); 
        }
		catch(Exception e){
			System.out.print("Error al cargar domiciliarios\n");
        }
	}
	
	//metodo que carga propietarios de Restaurante
	private void CargarPropetarioRestaurante(String ruta) {
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
            //PrintWriter writer = new PrintWriter(ruta+"propietarioRestaurante.txt"); writer.print(""); writer.close(); 
        }catch(Exception e){
			System.out.print("Error al cargar Propietarios de Restaurante\n");
        }
	}
	
	//metodo que carga los restaurantes
	private void CargarRestaurantes(String ruta) {
		try{
			FileReader fr = new FileReader(ruta+"restaurantes.txt");
            BufferedReader br = new BufferedReader(fr);
            String line;
            while((line = br.readLine()) != null){
            	if (!line.isEmpty()) {
            		String [] rest = line.split(";");
            		String nombre = rest[0];
            		String codigo = rest[1];
            		String direccion = rest[2];
            		String cedula = rest[3];
            		String telefono = rest[4];
            		Restaurante restaurante = new Restaurante(nombre,Integer.parseInt(codigo), direccion,Long.parseLong(cedula),Long.parseLong(telefono));
            		Data.restaurantes.put(codigo,restaurante);
            	}
            }
            br.close();
           // PrintWriter writer = new PrintWriter(ruta+"restaurantes.txt"); writer.print(""); writer.close(); 
        }
		catch(Exception e){
			System.out.print("Error al cargar domiciliarios\n");
        }
	}
	
	//metodo que carga Productos
	private void CargarProductos(String ruta) {
		try{
			FileReader fr = new FileReader(ruta+"productos.txt");
            BufferedReader br = new BufferedReader(fr);
            String line;

            ArrayList<Producto> ll = new ArrayList<Producto>();

            while((line = br.readLine()) != null){
            	if (!line.isEmpty()) {
            		String [] rest = line.split(";");
            		String id = rest[0];
            		String codigoRestaurante = rest[1];
            		String nombre = rest[2];
            		String valor = rest[3];
            		String tiempo = rest[4];
            		Producto prod = new Producto(id,Integer.parseInt(codigoRestaurante),nombre, Integer.parseInt(valor) ,Integer.parseInt(tiempo));
            		Data.restaurantes.get(codigoRestaurante).agregarProducto(prod);
            	}
            }
            //Data.restaurantes.get(001).setCarta(ll);
            br.close();
            //PrintWriter writer = new PrintWriter(ruta+"restaurantes.txt"); writer.print(""); writer.close(); 
        }
		catch(Exception e){
			System.out.print("Error al cargar CargarProductos\n");
        }
	}
	
	private void createFilesAndDirs() {
		try {
		String ruta = System.getProperty("user.dir")+"\\src\\temp\\";
		File directory = new File(ruta);
	    if (! directory.exists()){
	        directory.mkdir();
	    }
		File usuariosRegistradosFile = new File(ruta+"clientes.txt");
		File usuariosAdminFile = new File(ruta+"admin.txt");
		File usuariosMenus = new File(ruta+"MenusDeUsuarios.txt");

		}
		catch(Exception e){
			//Ocurrio algo al crear las carpetas y los archivos
		}
	}
}


//"C:\\Users\\USUARIO\\Desktop\\datos.txt"