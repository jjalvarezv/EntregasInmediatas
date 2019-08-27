package controlador;

import javax.swing.*;

import controlador.controlesInicio.*;
import modelo.gestorAplicacion.personas.UsuarioRegistrado;

import java.awt.*;
import java.awt.event.*;

public class infoUser implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {

		login lg = new login();
		UsuarioRegistrado usuarioActual = lg.userSession;
		usuarioActual.getCedula();
		usuarioActual.getNom();
		//usuarioActual.get
		//JOptionPane.showMessageDialog(null,"","", JOptionPane.INFORMATION_MESSAGE);
	}

}
