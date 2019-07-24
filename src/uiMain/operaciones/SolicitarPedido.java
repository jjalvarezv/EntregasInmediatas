package uiMain.operaciones;
import uiMain.Main;
import uiMain.OpcionesMenu;

import java.util.ArrayList;
import java.util.Scanner;

import Datos.Data;
import gestorAplicacion.gestion.*;
import gestorAplicacion.personas.Cliente;
import gestorAplicacion.personas.UsuarioRegistrado;

public class SolicitarPedido extends OpcionesMenu {

	@Override
	public void ejecutar() {
		// TODO Auto-generated method stub
		
		Pedido miPedido= new Pedido();
		ArrayList<Item> itemsProductos = new ArrayList<Item>();
		System.out.println("Arma tu pedido: ");
		//Data.operaciones.get("6").ejecutar();
		System.out.println(" Elige el restaurante");
		for (String key : Data.restaurantes.keySet() ) {
			System.out.println(Data.restaurantes.get(key).toString());
			System.out.println();
		}
		Scanner leerRestaurante = new Scanner(System.in);
		System.out.println("Escoger codigo Restaurante: ");
		String lect = leerRestaurante.next();
		Restaurante rest = Data.restaurantes.get(lect);
		System.out.println("1) Agregar Productos");
		System.out.println("2) Confirmar Pedido");	
		Scanner leerOpcion = new Scanner(System.in);		
		int a = leerOpcion.nextInt();		
		UsuarioRegistrado cliente = Main.user;	
		
		while(a!= 2) {
				System.out.println("Mira nuestra oferta de Productos");
				for(int x=0;x<rest.getCarta().size();x++) {
					  System.out.println(rest.getCarta().get(x).toString());
					}
				if (cliente instanceof Cliente) {
					System.out.println("Elige un producto");
					Scanner leerProducto = new Scanner (System.in);
					String nombreProducto =leerProducto.next();
					System.out.println("Elige las unidades de este producto");
				}
				System.out.println("1) Agregar Productos");
				System.out.println("2) Confirmar Pedido");	
				
			}
				
		
			
			
		
		
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Solicitar Pedido";
	}

}
