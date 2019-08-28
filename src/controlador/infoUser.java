package controlador;

import javax.swing.*;

import controlador.controlesInicio.*;
import modelo.Datos.Data;
import modelo.gestorAplicacion.personas.*;

import java.awt.*;
import java.awt.event.*;

public class infoUser implements ActionListener{
	private UsuarioRegistrado usuarioActual; 
	public infoUser(String user) {
		this.usuarioActual = Data.usuariosRegistrados.get(user);
	}
	public infoUser() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public void actionPerformed(ActionEvent e) {

		long cc;
		String nombre; 
		String dir;
		int cod;
		int estado;
		
		//El if es para hacer el cast a la instancia del objeto y asi acceder a los atributos de los usuarios
		if (usuarioActual instanceof Cliente) {
			dir = ((Cliente) usuarioActual).getDireccion();
			nombre = ((Cliente) usuarioActual).getNom();
			cc = ((Cliente) usuarioActual).getCedula();
			JOptionPane.showMessageDialog(null,"Nombre: "+nombre+"\nCedula: "+cc+
					"\nDirecci�n: "+dir
					,"Informaci�n de Cliente", JOptionPane.INFORMATION_MESSAGE);
			
		}else if(usuarioActual instanceof PropietarioRestaurante) {
			cod = ((PropietarioRestaurante) usuarioActual).getCodigo();
			nombre = ((PropietarioRestaurante) usuarioActual).getNom();
			cc = ((PropietarioRestaurante) usuarioActual).getCedula();
			JOptionPane.showMessageDialog(null,"Nombre: "+nombre+"\nCedula: "+cc+"\nCodigo de Restaurante: "+cod
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
			nombre = ((Domiciliario)usuarioActual).getNom();
			cc = ((Domiciliario)usuarioActual).getCedula();
			JOptionPane.showMessageDialog(null,"Nombre: "+nombre+"\nCedula: "+cc+
					"\nEstado: "+est
					,"Informaci�n de Domiciliario", JOptionPane.INFORMATION_MESSAGE);
			
		}else if (usuarioActual instanceof Admin) {
			nombre = ((Admin)usuarioActual).getNom();
			cc = ((Admin)usuarioActual).getCedula();
			JOptionPane.showMessageDialog(null,"Nombre: "+nombre+"\nCedula: "+cc
					,"Informaci�n de Administrador", JOptionPane.INFORMATION_MESSAGE);
		}else {
			JOptionPane.showMessageDialog(null,"Asco");
		}
		
		
		
		//JptionPane.showMessageDialog(null,"Nombre: "+nombre+"\nCedula: "+cc
			//	,"Informaci�n de Administrador", JOptionPane.INFORMATION_MESSAGE);
	}

}
