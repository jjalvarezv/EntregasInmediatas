package gestorAplicacion.personas;

import java.util.*;

import Datos.Data;
import gestorAplicacion.gestion.Item;

public class Admin extends UsuarioRegistrado  implements CalcularGanancias{
	
	private ArrayList<Admin> listaAdmin;
	
	
	public Admin() {}
	public Admin(String userName, String pass, String nombre, Long cc) {
		super(userName, pass, nombre, cc);
		listaAdmin.add(this);
	}
	
	public void aggAdmin(String userName, String pass, String nombre, Long cc) {
		Admin admin1 = new Admin(userName, pass, nombre, cc);
		listaAdmin.add(admin1);
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
	
}
