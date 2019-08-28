package controlador.controlesInicio;

import java.awt.event.*;

import vista.ventanaInicio;

public class btnAdmin implements ActionListener{
	int control=0;
	@Override
	public void actionPerformed(ActionEvent e) {		
		
		control++;
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
