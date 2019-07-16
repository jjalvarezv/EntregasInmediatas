package uiMain.operaciones;
import uiMain.OpcionesMenu;
import java.util.*;

import Datos.Data;
import gestorAplicacion.gestion.Producto;
import gestorAplicacion.gestion.Restaurante;


public class BusRest extends OpcionesMenu {
	
	@Override
	public void ejecutar() {
		Scanner leer = new Scanner(System.in);
		System.out.println("Ingrese nombre del Restaurante: ");
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
