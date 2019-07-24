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

	public SolicitarPedido(String key) {
		super(key);
	}

	@Override
	public void ejecutar() {
		// TODO Auto-generated method stub
		
		Pedido miPedido= new Pedido();
		ArrayList<Item> item = new ArrayList<Item>();
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
		System.out.println("1) Agregar Productos (presione 1) ");
			
		Scanner leerOpcion = new Scanner(System.in);		
		int a = leerOpcion.nextInt();		
		UsuarioRegistrado cliente = Main.user;	
		int indexProducto=0;
		while(a==1) {
				System.out.println("Mira nuestra oferta de Productos");
				for(int x=0;x<rest.getCarta().size();x++) {
					  System.out.println((x+1) +" " +rest.getCarta().get(x).toString());
					}			
					System.out.println("Elige un producto ( NUMERO )");
					Scanner leerProducto = new Scanner (System.in);
					Integer numeroProducto =leerProducto.nextInt();
					System.out.println( " Elige unidades de este producto: ");					
					Integer cantidad =leerProducto.nextInt();
					
					item.add(indexProducto, new Item( cantidad, rest.getCarta().get(numeroProducto-1)));
				
				System.out.println("1) Agregar Productos");
				System.out.println("2) Confirmar Pedido");	
				 a = leerOpcion.nextInt();	
				indexProducto++;
			}
				miPedido.solicitarPedido(Long.toString(cliente.getCedula()), rest.getCodigo(), ((Cliente) cliente).getDireccion(), item); 
		
			
			
		
		
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Solicitar Pedido";
	}

}
