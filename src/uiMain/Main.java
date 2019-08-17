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
				// objData es un objeto para invocar a los metodos de Data.java
				Data objData = new Data();
				objData.saveData();
				
				System.out.println(" Suerte, te esperamos gg ");
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
		
		//Operaciones de mis usuarios/clientes
		Data.operaciones.put("5", new SignOut("5"));
		Data.operaciones.put("6", new BusRest("6"));
		Data.operaciones.put("12", new SolicitarPedido("12"));
		
		//Operaciones de los domiciliarios
		Data.operaciones.put("7", new EntPed("7"));
		Data.operaciones.put("8", new CambEst("8"));
		
		Data.operaciones.put("9", new NewDom("9"));
		Data.operaciones.put("10", new NewProp("10"));
		Data.operaciones.put("11", new NewAdmin("11"));
		
		Data.operaciones.put("13", new AddProducto("13"));
		Data.operaciones.put("14", new RemoveProd("14"));
		

		
		//Cargar los datos
		// objData es un objeto para invocar a los metodos de Data.java
		Data objData = new Data();
		objData.CargarData();
		
		
		//Menu por defecto----Invitado
		//Operaciones de mi usuario por defecto
		@SuppressWarnings("serial")
		ArrayList<OpcionesMenu> guestOptions = new ArrayList<OpcionesMenu>(){
			{
				add(new Login());
				add(new SignUp());
				add(new BusRest());
			}
		};
		Main.menuGuestUser = new MenuConsola(guestOptions);
	}
}
