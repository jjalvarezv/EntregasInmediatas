package vista;

import javax.swing.*;
import java.awt.*;

public class ventanaCliente extends JPanel{
	
	JPanel panelAux;
	
	public ventanaCliente() {
		
	}
	
	public ventanaCliente(String usuario) {
		
		
		this.setLayout(new BorderLayout());
		add(new JLabel("BIENVENIDO "+usuario), BorderLayout.NORTH);
		add(new JLabel(""), BorderLayout.WEST);
		add(new JLabel(""), BorderLayout.EAST);
		
	}
}
	

