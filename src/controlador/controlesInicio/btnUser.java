package controlador.controlesInicio;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.ventanaInicio;

public class btnUser implements ActionListener{
	int control=0;
	@Override
	public void actionPerformed(ActionEvent e) {
		control ++;
		if(control == 1) {
			ventanaInicio.labelIngreso.setVisible(true);
			ventanaInicio.Panellogin.setVisible(true);
			ventanaInicio.login.setVisible(true);
		}else {
			control =0;
			ventanaInicio.labelIngreso.setVisible(false);
			ventanaInicio.Panellogin.setVisible(false);
			ventanaInicio.login.setVisible(false);
		
		}
		
	}

}
