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
	
	public void actionPerformed(ActionEvent e) {
		ventanaInicio panel =(ventanaInicio) ventanaApp.contenedorVentana.getComponent(0);
		usuario = panel.usuario.getText();
		password = panel.password.getText();
		boolean opc = UsuarioRegistrado.login(usuario, password);

		
		if	(opc == false) {
			new errorLogin();
		}else if (opc == true) {
			tipo = UsuarioRegistrado.TipoUser(usuario);
			ventanaApp.barraDeMenu.removeAll();
			//Agrego el nuevo menu para el UsuarioRegistrado
			JMenu archivo = new JMenu("Archivo");
			JMenuItem user = new JMenuItem("Usuario");
			JMenuItem logout = new JMenuItem("Salir");		
			archivo.add(user);
			archivo.add(logout);
			ventanaApp.barraDeMenu.add(archivo);
			//user.addActionListener(new infoUser());
			logout.addActionListener(new logout());
			
			
			
			JMenu opcionesUser = new JMenu("Procesos y Consultas");
			//Las opciones de usuarios se agregan en el if, depende de el tipo de user
			if (tipo.equals("cliente") == true) {
				
			}else if(tipo.equals("admin") == true) {
				
			}else if(tipo.equals("domiciliario") == true) {
				
			}else if(tipo.equals("propietario") == true) {
				
			}else {
				System.out.print("bla");
			}	
			ventanaApp.barraDeMenu.add(opcionesUser);
			
			
			
			JMenuItem jelp = new JMenuItem("Ayuda");
			ventanaApp.barraDeMenu.add(jelp);
			
			//configuro el contenedor
			ventanaApp.contenedorVentana.removeAll();
			if (tipo.equals("cliente") == true) {
				ventanaApp.contenedorVentana.add(new ventanaCliente());
				ventanaApp.ventanaAplicacion.pack();
			}else if(tipo.equals("admin") == true) {
				
			}else if(tipo.equals("domiciliario") == true) {
				
			}else if(tipo.equals("propietario") == true) {
				
			}else {
				System.out.print("bla");
			}
			
		}
		
		System.out.println(usuario);
		System.out.println(password);
		
	}

}
