package gestorAplicacion.gestion;
import gestorAplicacion.personas.PropietarioRestaurante;
import gestorAplicacion.personas.CalcularGanancias;
import java.util.*;

public class Restaurante implements CalcularGanancias{

	private int codigo;
	private String direccion;
	//private PropietarioRestaurante propietario;
	private long telefono, cedulaPropietario;
	private ArrayList<Producto> Carta;
	//public Restaurante palitos= new Restaurante(1234, "calle 98 #30-20", propietario.jorge, (long)4452347);
	
	public Restaurante(int cod, String direcc, long cedulaPropietario, long tel) {
		this.codigo= cod;
		this.direccion= direcc;
		this.cedulaPropietario= cedulaPropietario;
		this.telefono= tel;
	}
	public Restaurante(int cod, String direcc, long tel){
		this.codigo= cod;
		this.direccion= direcc;
		//this.cedulaPropietario= cedulaPropietario;
		this.telefono= tel;
		
	}
	public void agregarProducto(Producto producto, long CedulaPropietario) {
		if (CedulaPropietario == this.cedulaPropietario) {
			Carta.add(producto);
		}		
	}
	public void eliminarProducto(Producto producto, long cedulaPropietario) {
		if (cedulaPropietario == this.cedulaPropietario) {
		 Carta.remove(producto);
		}
	}
	@Override
	public int calcular_Ganancias() {
		return (int) (Item.it.getTotal() * 0.45);
	}
	public void setDireccion(String nueva_direccion) {
		this.direccion= nueva_direccion;		
	}
	public void setTelefono(long nuevo_tel) {
		this.telefono= nuevo_tel;
	}
	 public int  getCodigo() {
		 return this.codigo;		 
	 }
	 public String getDireccion() {
		 return this.direccion;
	 } 
	 public long getCedulaPropietario() {
		 return this.cedulaPropietario;
	 }
	 public void setCedulaPropietario(long cc) {
		
			 this.cedulaPropietario = cc;
	
			 
	 }
	
	 public long getTelefono() {
		 return this.telefono;
	 }
	 public ArrayList<Producto> getCarta(){
		 return this.Carta;
	 }
	 
	
}
