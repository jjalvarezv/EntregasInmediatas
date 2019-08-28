package vista;

import controlador.*;
import controlador.controlesInicio.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ventanaInicio extends JPanel{

	public static JPanel P1;
	public static JPanel P2;
	public static JPanel P3;
	public static JPanel P4;
	public static JPanel P5;
	public static JPanel P6;
	public static JLabel labelBienvenida;
	public static JButton botonImagenes;
	public static JTextArea textoDescripcion;
	public static JLabel labelIngreso;
	public static JButton botonAdmin;
	public static JButton botonUser;
	public static JButton salir;
	public static JPanel Panellogin;
	public static JLabel labelUser;
	public static JLabel labelPass;
	public JTextField usuario;
	public JPasswordField password;
	public static JButton login;
	
	
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
		P6.setLayout(new GridLayout(5,1));
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
		
		Panellogin = new JPanel();
		Panellogin.setLayout(new GridLayout(2,2,5,5));
		labelUser = new JLabel("Ingrese Usuario:", SwingConstants.CENTER);
		labelUser.setFont(new Font("Helvetica", Font.BOLD,12));
		labelUser.setVisible(true);
		
		labelPass = new JLabel("Ingrese Contraseña:", SwingConstants.CENTER);
		labelPass.setFont(new Font("Helvetica", Font.BOLD,12));
		labelPass.setVisible(true);
		
		usuario = new JTextField("");
		usuario.setVisible(true);
		password = new JPasswordField("");
		password.setVisible(true);
		login = new JButton("Login");
		login.addActionListener(new login());
		
		Panellogin.add(labelUser);
		Panellogin.add(usuario);
		Panellogin.add(labelPass);
		Panellogin.add(password);
		
		P6.add(Panellogin);
		P6.add(login);
		
		//boton de salir del sistema
		salir = new JButton("Salir del Sistema");
		salir.addActionListener(new controlSalida());
		P6.add(salir);
		
		P2.add(P6);

		
		
		add(P2);
		
	}
	
}
