package gestorAplicacion.personas;

import java.util.*;

public class Admin extends UsuarioRegistrado{
	
	private ArrayList<Admin> listaAdmin;
	
	public Admin() {}
	public Admin(String userName, String pass, String nombre, Long cc) {
		super(userName, pass, nombre, cc);
		listaAdmin.add(this);
	}
	
	public void aggAdmin(String userName, String pass, String nombre, Long cc) {
		Admin a1 = new Admin(userName, pass, nombre, cc);
		listaAdmin.add(a1);
	}
	
	public void aggDomiciliario() {
		
	}
	public void aggCliente() {
		
	}
	public void aggPropietario() {
		
	}
	public void calcularGanancias() {
		
	}
	
	public ArrayList<Admin> getAdmin() {
		return listaAdmin;
	}
	
	public void logout() {
		
	}
}
