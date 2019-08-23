package vista;

import javax.swing.*;
import java.awt.*;

public class ventanaInicio extends JPanel{

	private JPanel P1;
	private JPanel P2;
	private JPanel P3;
	private JPanel P4;
	private JPanel P5;
	private JPanel P6;
	
	public ventanaInicio() {
		
		this.setLayout(new GridLayout(1,2,10,5));
		P1 = new JPanel();
		JTextArea oe = new JTextArea("panel1");
		P1.add(oe);
		P2 = new JPanel();
		JTextArea oe2 = new JTextArea("panel2");
		P2.add(oe2);
		
	}
	
}
