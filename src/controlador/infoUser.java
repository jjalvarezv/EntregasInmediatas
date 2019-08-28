package controlador;

import javax.swing.*;

import controlador.controlesInicio.*;
import modelo.gestorAplicacion.personas.*;

import java.awt.*;
import java.awt.event.*;

public class infoUser implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {

		login lg = new login();
		UsuarioRegistrado usuarioActual = lg.userSession;
		Long cc = usuarioActual.getCedula();
		String nombre = usuarioActual.getNom();
		String dir;
		int cod;
		int estado;
		
		//El if es para hacer el cast a la instancia del objeto y asi acceder a los atributos de los usuarios
		if (usuarioActual instanceof Cliente) {
			dir = ((Cliente) usuarioActual).getDireccion();
			JOptionPane.showMessageDialog(null,"Nombre: "+nombre+"\nCedula: "+cc+
					"\nDirecci�n: "+dir
					,"Informaci�n de Cliente", JOptionPane.INFORMATION_MESSAGE);
			
		}else if(usuarioActual instanceof PropietarioRestaurante) {
			cod = ((PropietarioRestaurante) usuarioActual).getCodigo();
			JOptionPane.showMessageDialog(null,"Nombre: "+nombre+"\nCedula: "+cc+
					"\nCodigo de Restaurante: "+cod
					,"Informaci�n de Propietario", JOptionPane.INFORMATION_MESSAGE);
			
		}else if(usuarioActual instanceof Domiciliario) {
			estado = ((Domiciliario)usuarioActual).getEstado();
			String est;
			if (estado==0) {
				est = "Disponible";
			}else if(estado == 1) {
				est = "Ocupado";
			}else {
				est = "OFF-LINE";
			}
			JOptionPane.showMessageDialog(null,"Nombre: "+nombre+"\nCedula: "+cc+
					"\nEstado: "+est
					,"Informaci�n de Domiciliario", JOptionPane.INFORMATION_MESSAGE);
			
		}else if (usuarioActual instanceof Admin) {
			JOptionPane.showMessageDialog(null,"Nombre: "+nombre+"\nCedula: "+cc
					,"Informaci�n de Administrador", JOptionPane.INFORMATION_MESSAGE);
		}
		
	}

}
