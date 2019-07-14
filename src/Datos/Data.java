package Datos;
import java.io.*;
import java.util.HashMap;
import gestorAplicacion.personas.*;
import uiMain.MenuConsola;
import uiMain.MenuConsola;
import uiMain.OpcionesMenu;

public class Data {
	public static HashMap<String, OpcionesMenu> operaciones = new HashMap<String, OpcionesMenu>();
	public static HashMap<String, MenuConsola> menus = new HashMap<String, MenuConsola>();
	public static HashMap<String, UsuarioRegistrado> usuarios = new HashMap<String, UsuarioRegistrado>();
	
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
}


//"C:\\Users\\USUARIO\\Desktop\\datos.txt"