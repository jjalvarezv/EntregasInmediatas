package controlador.controlesInicio;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import vista.*;

public class moverRatonBienvenida implements MouseListener{
	public void mouseEntered(MouseEvent e) {
		vista.ventanaInicio.labelBienvenida.setForeground(Color.blue);
	}
	public void mouseExited(MouseEvent e) {
		vista.ventanaInicio.labelBienvenida.setForeground(Color.black);
	}
	public void mousePressed(MouseEvent e) {
		vista.ventanaInicio.labelBienvenida.setForeground(Color.blue);
	}
	public void mouseReleased(MouseEvent e) {
		
	}
	public void mouseClicked(MouseEvent e) {
		vista.ventanaInicio.labelBienvenida.setForeground(Color.blue);
	}
}