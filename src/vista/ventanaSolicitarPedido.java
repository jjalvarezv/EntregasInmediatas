package vista;

import java.awt.BorderLayout;
import java.awt.*;

import javax.swing.*;
import javax.swing.JPanel;

public class ventanaSolicitarPedido extends JPanel{
	
	public static JPanel panelAux;
		
	public ventanaSolicitarPedido() {	}
		
	public ventanaSolicitarPedido(String usuario) {
			
		this.setLayout(new BorderLayout());
		add(new JLabel("HOLAAAAA "+usuario), BorderLayout.NORTH);
		panelAux = new JPanel();
		panelAux.setLayout(new GridLayout(1,2,10,5));
		panelAux.add(new JButton("mierda1"));
		panelAux.add(new JButton("mierda2"));
		add(panelAux, BorderLayout.CENTER);
		
			
	}
		
}


