package modelo.operaciones;
//import uiMain.Main;
import modelo.uiMain.OpcionesMenu;
import modelo.gestorAplicacion.personas.*;

import java.util.Scanner;

import modelo.Datos.Data;
import modelo.gestorAplicacion.gestion.*;

public class AddProducto extends OpcionesMenu {
	public AddProducto(String key) {
		super(key);
	}
	@Override
	public void ejecutar(){
		//int c = ((PropietarioRestaurante)Main.user).getCodigo();
		//Restaurante rest = Data.restaurantes.get(Integer.toString(c));
		Scanner leer = new Scanner(System.in);
		System.out.print("Ingrese el id: ");
		String id = leer.next();
		System.out.print("Ingrese el nombre: ");
		String nombre = leer.next();
		System.out.print("Ingrese valor unitario: ");
		int valor = leer.nextInt();
		System.out.print("Ingrese tiempo de preparacion: ");
		int tiempo = leer.nextInt();
		//Producto p = new Producto(id,c,nombre,valor,tiempo);
		//rest.getCarta().add(p);
	}
	
	public String toString() {
		return "Agregar productos";
	}
}
