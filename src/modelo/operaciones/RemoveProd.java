package modelo.operaciones;
//import uiMain.Main;
import uiMain.OpcionesMenu;
import modelo.gestorAplicacion.personas.*;

import java.util.Scanner;

import modelo.Datos.Data;
import modelo.gestorAplicacion.gestion.*;

public class RemoveProd extends OpcionesMenu {
	public RemoveProd(String key) {
		super(key);
	}
	@Override
	public void ejecutar(){
		//int c = ((PropietarioRestaurante)Main.user).getCodigo();
		//Restaurante rest = Data.restaurantes.get(Integer.toString(c));
		int i = 0;
		//for (Producto p : rest.getCarta()) {
		//	System.out.println(i+") "+p.toString());
		//	System.out.println();
		//}
		Scanner leer = new Scanner(System.in);
		System.out.println("Escoja producto a remover: ");
		int index = leer.nextInt();
		//rest.getCarta().remove(index-1);
	}
	
	public String toString() {
		return "Quitar productos";
	}

}
