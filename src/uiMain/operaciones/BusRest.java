package uiMain.operaciones;
import uiMain.OpcionesMenu;
import java.util.*;

import Datos.Data;
import gestorAplicacion.gestion.Producto;
import gestorAplicacion.gestion.Restaurante;


public class BusRest extends OpcionesMenu {
	
	public BusRest() {
		
	}
	public BusRest(String key) {
		super(key);
	}

	@Override
	public void ejecutar(){
		int a = 1;
		for (String key : Data.restaurantes.keySet() ) {
			System.out.println(a + ") " + Data.restaurantes.get(key).toString());
			System.out.println();
			a++;
		}
		Scanner leer = new Scanner(System.in);
		System.out.println("Escoger Restaurante: ");
		String lect = leer.next();
		Restaurante rest = Data.restaurantes.get(lect);
		if (rest != null) {
			System.out.println(rest.toString());
			System.out.println("PRODUCTOS");
			int i = 1;
			for (Producto p : rest.getCarta()) {
				System.out.println(i+") "+p.toString());
				System.out.println();
				
			}
		}
		leer.close();
	}
	
	public String toString() {
		return "Buscar Restaurantes";
		
	}

}
