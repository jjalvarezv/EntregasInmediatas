package vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ventanaDomiciliario extends JPanel{

	public ventanaDomiciliario(){
		
	}
	public ventanaDomiciliario(String usuario){
		this.setLayout(new BorderLayout());
		add(new JLabel("BIENVENIDO "+usuario), BorderLayout.NORTH);
		add(new JLabel(""), BorderLayout.WEST);
		add(new JLabel(""), BorderLayout.EAST);
	}
	
}
