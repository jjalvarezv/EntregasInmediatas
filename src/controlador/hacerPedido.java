package controlador;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import modelo.gestorAplicacion.gestion.*;
import modelo.gestorAplicacion.personas.*;

import vista.*;

public class hacerPedido implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Pedido miPedido= new Pedido();
		ventanaApp.contenedorVentana.removeAll();
		ventanaApp.contenedorVentana.add(new ventanaSolicitarPedido());
		ventanaApp.ventanaAplicacion.pack();
	}

}
