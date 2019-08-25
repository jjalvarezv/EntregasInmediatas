package vista;

import controlador.*;
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
	private JLabel labelBienvenida;
	private JButton botonImagenes;
	private JTextArea textoDescripcion;
	private JButton botonAdmin;
	private JButton botonUser;
	private JLabel labelIngreso;
	private JLabel labelUser;
	private JLabel labelPass;
	private JTextField usuario;
	private JPasswordField password;
	private JButton salir;
	
	public ventanaInicio() {
		
		this.setLayout(new GridLayout(1,2,10,5));
		
		P1 = new JPanel();
		P1.setLayout(new GridLayout(2,1,1,1));
		
		//--------codigo para editar el panel P1-----------
		
		P3 = new JPanel();
		labelBienvenida = new JLabel("HOLA BIENVENIDO AL SISTEMA", SwingConstants.CENTER);
		labelBienvenida.setFont(new Font("Helvetica", Font.BOLD,22));
		labelBienvenida.addMouseListener(new moverRatonBienvenida());
		P1.add(P3.add(labelBienvenida)); //agrego mensaje de bienvenida
		
		P4 = new JPanel();
		botonImagenes = new JButton(new ImageIcon("src/temp/mensajeFotos.jpg"));
		botonImagenes.addActionListener(new botonRostros()); //FALTA IMPLEMENTAR PARA IMAGENES
		P1.add(P4.add(botonImagenes));
		
		add(P1);
		
		//-----------AHORA P2-------------------
		
		P2 = new JPanel();
		P2.setLayout(new GridLayout(2,1,10,5));
		
		P5 = new JPanel();
		textoDescripcion = new JTextArea("esto es una prueba, adefjaoshdfjah sdofhapsjdfhapjsdfahs dfohasodfhao psdhfouashdfoahsmas nos se como hacer la barra");
		textoDescripcion.setLineWrap(true);
		textoDescripcion.setWrapStyleWord(true);
		textoDescripcion.setEditable(false);
		JScrollPane scroll = new JScrollPane(textoDescripcion);
		scroll.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		//agrego descripcion del proyecto
		P2.add(P5.add(scroll)); 
		
		P6 = new JPanel();
		P6.setLayout(new GridLayout(4,1));
		JPanel botones = new JPanel();
		botones.setLayout(new GridLayout(1,2,5,5));
		botonAdmin = new JButton("ADMINISTRADOR");
		botonUser = new JButton("USUARIO COMÚN");
		botones.add(botonAdmin);
		botones.add(botonUser);
		P6.add(botones);
		
		
		labelIngreso = new JLabel("Ingrese su Usuario y Contraseña", SwingConstants.CENTER);
		labelIngreso.setFont(new Font("Helvetica", Font.BOLD,16));
		labelIngreso.setVisible(true);
		P6.add(labelIngreso);
		
		JPanel login = new JPanel();
		login.setLayout(new GridLayout(2,2,5,5));
		labelUser = new JLabel("Ingrese Usuario:", SwingConstants.CENTER);
		labelUser.setFont(new Font("Helvetica", Font.BOLD,12));
		labelUser.setVisible(true);
		
		labelPass = new JLabel("Ingrese Contraseña:", SwingConstants.CENTER);
		labelPass.setFont(new Font("Helvetica", Font.BOLD,12));
		labelPass.setVisible(true);
		
		usuario = new JTextField("us");
		usuario.setVisible(true);
		password = new JPasswordField("pass");
		password.setVisible(true);
		
		login.add(labelUser);
		login.add(usuario);
		login.add(labelPass);
		login.add(password);
		P6.add(login);
		
		salir = new JButton("Salir del Sistema");
		salir.addActionListener(new controlSalida());
		P6.add(salir);
		
		P2.add(P6);

		
		
		add(P2);
		
	}
	
	public class moverRatonBienvenida implements MouseListener{
		public void mouseEntered(MouseEvent e) {
			labelBienvenida.setForeground(Color.blue);
		}
		public void mouseExited(MouseEvent e) {
			labelBienvenida.setForeground(Color.black);
		}
		public void mousePressed(MouseEvent e) {
			labelBienvenida.setForeground(Color.blue);
		}
		public void mouseReleased(MouseEvent e) {
			
		}
		public void mouseClicked(MouseEvent e) {
			labelBienvenida.setForeground(Color.blue);
		}
	}
	
	public class botonRostros implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			
		}
	}
	
}
