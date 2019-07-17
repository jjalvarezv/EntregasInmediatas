package uiMain;

import java.util.ArrayList;
import java.util.Scanner;

import Datos.Data;
import gestorAplicacion.personas.UsuarioRegistrado;

public class MenuConsola {
	private UsuarioRegistrado user;
	private ArrayList<OpcionesMenu> options = new ArrayList<OpcionesMenu> ();
	
	public MenuConsola(ArrayList<OpcionesMenu> options){
		this.options = options;
	}
	
	public MenuConsola(UsuarioRegistrado user, ArrayList<OpcionesMenu> options){
		this.user = user;
		this.options = options;
	}
	
	public UsuarioRegistrado getUser() {
		return user;
	}

	public void setUser(UsuarioRegistrado user) {
		this.user = user;
	}
	
	public ArrayList<OpcionesMenu> getOptions() {
		return options;
	}

	public void setOptions(ArrayList<OpcionesMenu> options) {
		this.options = options;
	}
	
	public String[] getOperations() {
		String [] opt = new String[options.size()];
		int i = 0;
		for (OpcionesMenu opcionDeMenu : options) {
			opt[i] = opcionDeMenu.getKey();
			i++;
		}
		return opt;
	}

	public void lanzarMenu(){
		Scanner leer = new Scanner(System.in);
		
		System.out.println();
		int i = 1;
		for (OpcionesMenu option : options) {
			
			System.out.println(i+" "+option);
			i++;
		}
		//Opcion para terminar el programa, hecho con un try catch.
		System.out.println(i+" Terminar programa");
		
		System.out.print("Ingrese la opcion: ");
		int opt = leer.nextInt();
		options.get((opt-1)).ejecutar();
		
	}
	
	public static void newMenu(UsuarioRegistrado user, String [] operations) {
		ArrayList<OpcionesMenu> operationsMenu = new ArrayList<OpcionesMenu>();
		for (String opt : operations) {
			operationsMenu.add(Data.operaciones.get(opt));
		}
		MenuConsola menu = new MenuConsola(user, operationsMenu);
		user.setMenu(menu);
		Data.menus.put(user.getUsername(), menu);
	}
	
	public void seeOpt() {
		int i = 1;
		for (OpcionesMenu opcionDeMenu : options) {
			System.out.println(i + " "+opcionDeMenu);
			i++;
		}
	}
	
	public void delOpt(int index) {
		options.remove(index-1);
	}
	
	public void añadirOpcion(String opt) {
		options.add(Data.operaciones.get(opt));
	}
}
