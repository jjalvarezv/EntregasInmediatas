package controlador;

import java.awt.*;
import java.awt.event.*;
import modelo.Datos.*;


public class controlSalida implements ActionListener{
	public void actionPerformed(ActionEvent e) {
		Data objData = new Data();
		objData.saveData();
		System.exit(0);
	}
}
