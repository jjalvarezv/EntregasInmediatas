package vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ventanaPropietario extends JPanel{
	
	
	public ventanaPropietario(){
		
	}
	public ventanaPropietario (String usuario){
		this.setLayout(new BorderLayout());
		add(new JLabel("BIENVENIDO "+usuario), BorderLayout.NORTH);
		add(new JLabel(""), BorderLayout.WEST);
		add(new JLabel(""), BorderLayout.EAST);
	}
}
