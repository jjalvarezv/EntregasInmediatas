package controlador;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.*;

import modelo.Datos.Data;
import modelo.gestorAplicacion.gestion.Producto;
import modelo.gestorAplicacion.gestion.Restaurante;

public class OyenteItem implements ItemListener {
	public static String [] nombreColumnas = {"Codigo", "Nombre", "Precio", "Pedir"};
	public static Object [][] datos;
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		String s = (String)  e.getItem();
		Restaurante rest = 	Data.restaurantes.get(s);
		
		datos = new Object [rest.getCarta().size()][nombreColumnas.length];
	    for (int i=0; i < rest.getCarta().size(); i++) {
	    	datos[i][0] = rest.getCarta().get(i).getId();
	    	datos[i][0] = rest.getCarta().get(i).getNombreProducto();
	    	datos[i][0] = rest.getCarta().get(i).getValorUnidad();
	    	datos[i][0] = "Pedir";
	    }

	}

}
