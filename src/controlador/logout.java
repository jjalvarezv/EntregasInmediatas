package controlador;

import java.awt.*;
import java.awt.event.*;

import vista.ventanaApp;
import vista.ventanaInicio;


public class logout implements ActionListener{
	public void actionPerformed(ActionEvent e) {
		ventanaApp.barraDeMenu.removeAll();
		
		ventanaApp.contenedorVentana.removeAll();
		ventanaApp.contenedorVentana.add(new ventanaInicio());
		ventanaApp.ventanaAplicacion.pack();
		
	}
}
