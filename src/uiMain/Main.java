package uiMain;
import java.util.ArrayList;
import Datos.Data;
import gestorAplicacion.personas.UsuarioRegistrado;

import uiMain.operaciones.*;

public class Main {
	public static UsuarioRegistrado user;
	public static MenuConsola menuGuestUser;
	
	public static void main(String[] args) {
		Main.iniConfigs();
		while(true) {
			
			try {
				if(Main.user != null) {
					Main.user.getMenu().lanzarMenu();
				}else {
					Main.menuGuestUser.lanzarMenu();
				}
			
			}
			catch(Exception e){
				//Si ocurre una excepcion al ejecutar el programa, lo terminara.
				
				//Al terminar el programa ejecutara el guardado
				Data.saveData();
				
				System.out.println("Adios"+e.getMessage());
				System.exit(0);
			}
		}
	}
	
	public static void iniConfigs() {
		//Cargar las opciones del programa primero
		
		//Operaciones administrativas
		Data.operaciones.put("1", new VerOpt("1"));
		Data.operaciones.put("2", new AddOpt("2"));
		Data.operaciones.put("3", new DelOpt("3"));
		Data.operaciones.put("4", new NewAdmin("4"));
		
		//Operaciones de mis usuarios
		Data.operaciones.put("5", new SignOut("5"));
		Data.operaciones.put("6", new BusRest("6"));
		
		//Cargar los datos
		Data.CargarData();
		
		
		//Menu por defecto----Invitado
		//Operaciones de mi usuario por defecto
		@SuppressWarnings("serial")
		ArrayList<OpcionesMenu> guestOptions = new ArrayList<OpcionesMenu>(){
			{
				add(new Login());
				add(new SignUp());
			}
		};
		Main.menuGuestUser = new MenuConsola(guestOptions);
	}
}
