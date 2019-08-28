package vista;

import java.util.HashMap;
import java.awt.*;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import controlador.OyenteItem;
import modelo.Datos.*;
import modelo.gestorAplicacion.gestion.Pedido;
import modelo.gestorAplicacion.gestion.Restaurante;


public class ventanaSolicitarPedido extends JPanel{
	
	public static JPanel panelAux;
     JComboBox  ComboBoxRestaurantes = new JComboBox();
     JTable table;
     
	public ventanaSolicitarPedido() {	}
		
	public ventanaSolicitarPedido(String usuario) {
	    
		for (String key : Data.restaurantes.keySet() ) {
			String nom = Data.restaurantes.get(key).getNombre();
			ComboBoxRestaurantes.addItem(nom);
		}
	
		this.setLayout(new BorderLayout());
		add(new JLabel("BIENVENIDA "+usuario), BorderLayout.NORTH);
		panelAux = new JPanel();
		panelAux.setLayout(new GridLayout(1,2,10,5));
		
		panelAux.add( ComboBoxRestaurantes);
		table = new JTable(new DefaultTableModel(OyenteItem.datos, OyenteItem.nombreColumnas));
		ComboBoxRestaurantes.addItemListener(new OyenteItem());
		panelAux.add(table);
		add(panelAux, BorderLayout.CENTER);
		
			
	}
		
}


