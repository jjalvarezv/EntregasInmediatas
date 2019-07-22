package Datos;
import java.io.*;
import java.util.HashMap;
import gestorAplicacion.gestion.Restaurante;
import gestorAplicacion.personas.*;
import uiMain.MenuConsola;

import uiMain.OpcionesMenu;

public class Data {
	public static HashMap<String, OpcionesMenu> operaciones = new HashMap<String, OpcionesMenu>();
	public static HashMap<String, MenuConsola> menus = new HashMap<String, MenuConsola>();
	public static HashMap<String, UsuarioRegistrado> usuarios = new HashMap<String, UsuarioRegistrado>();

	public static HashMap<String, Restaurante> restaurantes = new HashMap<String, Restaurante>();

	
	// hashmap de los domiciliarios que hay
	public static HashMap<String, Domiciliario> domiciliarios = new HashMap<String, Domiciliario>();
	
	
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
	
	public static void loadData() {
		createFilesAndDirs();
		String ruta = System.getProperty("user.dir")+"\\src\\temp\\";
		loadUsers(ruta);
		loadAdminUsers(ruta);
		loadMenus(ruta);
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