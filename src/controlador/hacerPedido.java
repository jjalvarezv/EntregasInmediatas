package controlador;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import modelo.gestorAplicacion.gestion.*;
import modelo.gestorAplicacion.personas.*;

import vista.*;

public class hacerPedido implements ActionListener{
	String usuario;
	public hacerPedido() {}
	
	public hacerPedido(String user) {
		usuario = user;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		ventanaApp.contenedorVentana.removeAll();
		ventanaApp.contenedorVentana.add(new ventanaSolicitarPedido(usuario));
		ventanaApp.ventanaAplicacion.pack();
	}

}
