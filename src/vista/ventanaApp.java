package vista;

import java.awt.*;
import javax.swing.*;

public class ventanaApp extends JFrame{
	
	public static Container contenedorVentana;
	public static JFrame ventanaAplicacion;
	public static JMenuBar barraDeMenu = new JMenuBar();
	
	public ventanaApp() {
		
		super("Entregas Inmediatas");
		ventanaAplicacion = this;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//agrega Barra de menu a la ventana
		setJMenuBar(barraDeMenu);
		
		contenedorVentana = this.getContentPane();
		//contenedorVentana.setLayout(new GridLayout(1,2,10,5));
		//agregar componentes con contenedor.add(claseDeLaVista a agregar)
		contenedorVentana.add(new ventanaInicio());
		
		
		this.setPreferredSize(new Dimension(800, 550));
		
	}
	
	public void start() {
			pack();// coloca los componentes
			setLocationRelativeTo(null);// centra la ventana en la pantalla
			setVisible(true);// visualiza la ventana
	
	}
	
}
