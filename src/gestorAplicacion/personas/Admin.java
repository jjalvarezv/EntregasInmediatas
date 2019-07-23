package gestorAplicacion.personas;

import java.util.*;

import Datos.Data;
import gestorAplicacion.gestion.Item;
import gestorAplicacion.personas.Admin;
import uiMain.MenuConsola;
import uiMain.MenuConsola;

public class Admin extends UsuarioRegistrado  implements CalcularGanancias{
	
	private ArrayList<Admin> listaAdmin;
	
	
	public Admin() {}
	public Admin(String userName, String pass, String nombre, Long cc) {
		super(userName, pass, nombre, cc);
		listaAdmin.add(this);
	}
	
	
	public void aggDomiciliario(Domiciliario domi1) {
		Data.domiciliarios.put(domi1.getUsername(), domi1);
	}
	public void aggCliente() {
		
	}
	public void aggPropietario() {
		
	}
	@Override
	public int calcular_Ganancias() {
		return (int) (Item.it.getTotal() * 0.45);
	}
	
	public ArrayList<Admin> getAdmin() {
		return listaAdmin;
	}
	
	public void logout() {
		
	}
	
	public static String newAdmin(String username, String password, String name, Long cc){
		Admin user = new Admin();
		//Validaciones de cada parametro
		user.setNom(name);
		user.setUsername(username);
		user.setCedula(cc);
		user.setPassword(password);
		
		//Menu por defecto al crear un nuevo usuario administrador
		String [] operations = {"1","2","3","4","5"};
		MenuConsola.newMenu(user, operations);
		if(true){
			Data.admins.put(username,user);
			return "Se creo el administrador";
		}else{
			return "No se pudo crear el administrador...";
		}
	}
	
}
