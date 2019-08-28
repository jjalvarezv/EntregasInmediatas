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
		textoDescripcion = new JTextArea("¿Quién en el siglo XXI no pide un domicilio? Con éste programa tratamos de desarrollar una tienda virtual netamente de domicilios, en donde podemos hacer un pedido a un restaurante y esperar en nuestro hogar, trabajo o en el lugar donde nos encontremos por medio de nuestros domiciliarios los cuales hacen efectivo el domicilio.\r\n" + 
				"Para ello entonces como cualquier negocio se va a tener un administrador por defecto que será como el dueño de la aplicación y podrá crear otros admins, así mismo crear los domiciliarios, registrar propietarios de restaurantes con su respectivo restaurante; pero los movimientos y operaciones en los que se involucra el restaurante serán administradas por su propietario, puesto que éste será el encargado de agregar productos y eliminarlos; y para ello se usará la lista de productos que tiene ese restaurante. Como cualquier otra aplicación de comidas se manejarán los clientes, pero como esta aplicación es virtual así mismo habrán usuarios invitados que podrán ver la carta, entonces se le mostrará la lista de productos con su respectivo restaurante asociado, pero para poder hacer pedidos se deberán registrar y manejarsen ahora sí como clientes. Como se mencionó al principio se tendrán domiciliarios los cuales harán efectivo el pedido. También se podrá ver los distintos pedidos que hizo un cliente, los asociados a un restaurante y los que el domiciliario entregó exitosamente.\r\n" + 
				"");
		textoDescripcion.setLineWrap(true);
		textoDescripcion.setWrapStyleWord(true);
		textoDescripcion.setFont(new Font("Arial", Font.PLAIN, 16));
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
