package controlador.controlesInicio;

import java.awt.event.ActionEvent;
import vista.*;
import java.awt.event.ActionListener;
import javax.swing.*;
import controlador.*;

import modelo.gestorAplicacion.personas.UsuarioRegistrado;
import java.awt.*;
import java.awt.event.*;

public class login implements ActionListener {
	private String tipo;
	private String usuario;
	private String password;
	public UsuarioRegistrado userSession;
	
	public void actionPerformed(ActionEvent e) {
		ventanaInicio panel =(ventanaInicio) ventanaApp.contenedorVentana.getComponent(0);
		usuario = panel.usuario.getText();
		password = panel.password.getText();
		boolean opc = UsuarioRegistrado.login(usuario, password);

		
		if	(opc == false) {
			new errorLogin();
		}else if (opc == true) {
			tipo = UsuarioRegistrado.TipoUser(usuario);
			userSession = UsuarioRegistrado.getUserByUsername(usuario);
			ventanaApp.barraDeMenu.removeAll();
			//Agrego el nuevo menu para el UsuarioRegistrado
			JMenu archivo = new JMenu("Archivo");
			JMenuItem user = new JMenuItem("Usuario");
			JMenuItem logout = new JMenuItem("Salir");		
			archivo.add(user);
			archivo.add(logout);
			ventanaApp.barraDeMenu.add(archivo);
			user.addActionListener(new infoUser());
			logout.addActionListener(new logout());
			
			
			
			JMenu opcionesUser = new JMenu("Procesos y Consultas");
			//Las opciones de usuarios se agregan en el if, depende de el tipo de user
			if (tipo.equals("cliente") == true) {
				
				JMenuItem hacerPedido = new JMenuItem("Solicitar Pedido");
				JMenuItem buscarRestaurante = new JMenuItem("Buscar Restaurante");
				JMenuItem listaDePedidos = new JMenuItem(" Mis pedidos");
				opcionesUser.add(hacerPedido);
				opcionesUser.add(buscarRestaurante);
				opcionesUser.add(listaDePedidos);
				hacerPedido.addActionListener(null);
				buscarRestaurante.addActionListener(null);
				listaDePedidos.addActionListener(null);
				ventanaApp.barraDeMenu.add(opcionesUser);
				
			}else if(tipo.equals("admin") == true) {
				JMenuItem agregarPropietario = new JMenuItem("Agregar Propietario");
				JMenuItem agregarAdmin = new JMenuItem("Agregar Admin");				
				opcionesUser.add(agregarPropietario);
				opcionesUser.add(agregarAdmin);			
				agregarPropietario.addActionListener(null);
				agregarAdmin.addActionListener(null);				
				ventanaApp.barraDeMenu.add(opcionesUser);
				
			}else if(tipo.equals("domiciliario") == true) {
				JMenuItem entregarPedido = new JMenuItem("Entregar Pedido");
				JMenuItem cambiarEstado = new JMenuItem("Cambiar Estado");				
				opcionesUser.add(entregarPedido);
				opcionesUser.add(cambiarEstado);			
				entregarPedido.addActionListener(null);
				cambiarEstado.addActionListener(null);				
				ventanaApp.barraDeMenu.add(opcionesUser);
				
			}else if(tipo.equals("propietario") == true) {
				JMenuItem agregarProducto = new JMenuItem("Agregar Producto");
				JMenuItem removerProducto = new JMenuItem("Remover Producto");				
				opcionesUser.add(agregarProducto);
				opcionesUser.add(removerProducto);			
				agregarProducto.addActionListener(null);
				removerProducto.addActionListener(null);				
				ventanaApp.barraDeMenu.add(opcionesUser);
				
			}else {
				System.out.print("bla");
			}	
			ventanaApp.barraDeMenu.add(opcionesUser);
			
			
			
			JMenuItem jelp = new JMenuItem("Ayuda");
			ventanaApp.barraDeMenu.add(jelp);
			
			//configuro el contenedor
			ventanaApp.contenedorVentana.removeAll();
			if (tipo.equals("cliente") == true) {
				ventanaApp.contenedorVentana.add(new ventanaCliente()); //Vista de un usuario cliente
				ventanaApp.ventanaAplicacion.pack();
			}else if(tipo.equals("admin") == true) {
				ventanaApp.contenedorVentana.add(new ventanaAdmin()); //Vista de un usuario Administrador
				ventanaApp.ventanaAplicacion.pack();
			}else if(tipo.equals("domiciliario") == true) {
				ventanaApp.contenedorVentana.add(new ventanaDomiciliario()); // Vista de un usuario Domiciliario
				ventanaApp.ventanaAplicacion.pack();
			}else if(tipo.equals("propietario") == true) {
				ventanaApp.contenedorVentana.add(new ventanaPropietario()); //vista de un usuario Propietario de restaurante
				ventanaApp.ventanaAplicacion.pack();
			}else {
				System.out.print("bla");
			}
			
		}
		
		System.out.println(usuario);
		System.out.println(password);
		
	}

}
