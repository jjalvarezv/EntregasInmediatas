package controlador.controlesInicio;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import vista.*;

public class botonRostros implements ActionListener{
	int control = 0;
	public void actionPerformed(ActionEvent e) {
		control++;
		if (control == 1) {
			ImageIcon imagen = new ImageIcon("src/temp/img1.jpeg");
			ventanaInicio.botonImagenes.setIcon(imagen);
		}else if (control == 2) {
			ImageIcon imagen = new ImageIcon("src/temp/img2.jpeg");
			ventanaInicio.botonImagenes.setIcon(imagen);
		}else {
			control = 0;
			ImageIcon imagen = new ImageIcon("src/temp/mensajeFotos.jpg");
			ventanaInicio.botonImagenes.setIcon(imagen);
		}
		
		
	}
}
