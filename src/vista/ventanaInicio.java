package vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ventanaInicio extends JPanel{

	private JPanel P1;
	private JPanel P2;
	private JPanel P3;
	private JPanel P4;
	private JPanel P5;
	private JPanel P6;
	private JLabel L1;
	private JButton B1;
	private JTextArea T1;
	
	public ventanaInicio() {
		
		this.setLayout(new GridLayout(1,2,10,5));
		
		P1 = new JPanel();
		P1.setLayout(new GridLayout(2,1,1,1));
		
		//--------codigo para editar el panel P1-----------
		
		P3 = new JPanel();
		L1 = new JLabel("HOLA BIENVENIDO AL SISTEMA", SwingConstants.CENTER);
		L1.setFont(new Font("Helvetica", Font.BOLD,22));
		L1.addMouseListener(new moverRatonBienvenida());
		P1.add(P3.add(L1)); //agrego mensaje de bienvenida
		
		P4 = new JPanel();
		B1 = new JButton(new ImageIcon("src/temp/mensajeFotos.jpg"));
		B1.addActionListener(new botonRostros()); //FALTA IMPLEMENTAR PARA IMAGENES
		P1.add(P4.add(B1));
		
		add(P1);
		
		//-----------AHORA P2-------------------
		
		P2 = new JPanel();
		P2.setLayout(new GridLayout(2,1,10,5));
		
		P5 = new JPanel();
		T1 = new JTextArea("esto es una prueba, adefjaoshdfjah sdofhapsjdfhapjsdfahs dfohasodfhao psdhfouashdfoahsmas nos se como hacer la barra");
		T1.setLineWrap(true);
		T1.setWrapStyleWord(true);
		T1.setEditable(false);
		JScrollPane scroll = new JScrollPane(T1);
		scroll.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);;
		scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		P2.add(P5.add(scroll)); //agrego descripcion del proyecto
		
		P6 = new JPanel();
		
		
		
		add(P2);
		
	}
	
	public class moverRatonBienvenida implements MouseListener{
		public void mouseEntered(MouseEvent e) {
			L1.setForeground(Color.blue);
		}
		public void mouseExited(MouseEvent e) {
			L1.setForeground(Color.black);
		}
		public void mousePressed(MouseEvent e) {
			L1.setForeground(Color.blue);
		}
		public void mouseReleased(MouseEvent e) {
			
		}
		public void mouseClicked(MouseEvent e) {
			L1.setForeground(Color.blue);
		}
	}
	
	public class botonRostros implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			
		}
	}
	
}
