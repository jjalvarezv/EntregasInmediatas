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
		System.out.println("1) Agregar Productos");
		System.out.println("2) Confirmar Pedido");		
		Scanner leer = new Scanner(System.in);		
		int a = leer.nextInt();		
		UsuarioRegistrado cliente = Main.user;
		if(a==1) {
			
		}
		if (cliente instanceof Cliente) {
			//gestorAplicacion.gestion.Pedido(cliente.getCedula(),)
		}
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Solicitar Pedido";
	}

}
