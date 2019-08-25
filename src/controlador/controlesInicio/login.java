package controlador.controlesInicio;

import java.awt.event.ActionEvent;
import vista.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import modelo.gestorAplicacion.personas.UsuarioRegistrado;

public class login implements ActionListener {
	
	public void actionPerformed(ActionEvent e) {
		ventanaInicio panel =(ventanaInicio) ventanaApp.contenedorVentana.getComponent(0);
		
		String usuario = panel.usuario.getText();
		String password = panel.password.getText();
		UsuarioRegistrado.login(usuario, password);

		
		
	}

}
