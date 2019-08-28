package modelo.operaciones;
//import uiMain.Main;
import modelo.uiMain.OpcionesMenu;

import java.util.ArrayList;
import java.util.Scanner;

import modelo.Datos.Data;
import modelo.gestorAplicacion.gestion.*;
import modelo.gestorAplicacion.personas.Cliente;
import modelo.gestorAplicacion.personas.UsuarioRegistrado;

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
			System.out.println("Codigo: "+Data.restaurantes.get(key).getCodigo()+" Nombre Restaurante: "+Data.restaurantes.get(key).getNombre());
			System.out.println();
		}
		Scanner leerRestaurante = new Scanner(System.in);
		System.out.println("Escoger codigo Restaurante: ");
		String lect = leerRestaurante.next();
		Restaurante rest = Data.restaurantes.get(lect);
		System.out.println("1) Agregar Productos (presione 1) ");
			
		Scanner leerOpcion = new Scanner(System.in);		
		int a = leerOpcion.nextInt();		
		//UsuarioRegistrado cliente = Main.user;	
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
			//boolean auxPedidoSucces = miPedido.solicitarPedido(Long.toString(cliente.getCedula()), rest.getCodigo(), ((Cliente) cliente).getDireccion(), item); 
		
			//if(auxPedidoSucces) {
			//	System.out.println("Tu pedido ha sido asignado \n" );
			//	System.out.println("El domiciliario encargado es: " + miPedido.getUserDomiciliario());
			//	System.out.println("\n Tu pedido tendrá un costo de : "+ miPedido.calcularCostoPedido());
			//	System.out.println("\n Tu pedido se demorará:  "+ miPedido.getTiempoDeEntrega());
			//}else {
			//	System.out.println("intenta el pedido más tarde");
			//}
			
		
		
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Solicitar Pedido";
	}

}
