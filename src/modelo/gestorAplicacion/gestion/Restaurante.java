package modelo.gestorAplicacion.gestion;
import modelo.gestorAplicacion.personas.PropietarioRestaurante;
import modelo.gestorAplicacion.personas.CalcularGanancias;
import java.util.*;
import modelo.Datos.Data;

public class Restaurante implements CalcularGanancias{
	
    private String nombre;
	private int codigo;
	private String direccion;
	//private PropietarioRestaurante propietario;
	private long telefono, cedulaPropietario;
	private ArrayList<Producto> Carta;
	//public Restaurante palitos= new Restaurante(1234, "calle 98 #30-20", propietario.jorge, (long)4452347);
	
	public Restaurante(String nombre, int cod, String direcc, long cedulaPropietario, long tel) {
		this.nombre = nombre;
		this.codigo= cod;
		this.direccion= direcc;
		this.cedulaPropietario= cedulaPropietario;
		this.telefono= tel;
		//Data.restaurantes.put(Integer.toString(cod), this);
		Carta = new ArrayList<Producto>();

	}
	public void agregarProducto(Producto producto) {
			Carta.add(producto);	
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
	
	public void setCarta(ArrayList<Producto> carta) {
		this.Carta = carta;
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
	 public String getNombre() {
		 return this.nombre;
	 }
	 public void setNombre(String nombre) {
		 this.nombre= nombre;
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
	 public String toString() {
		 return getNombre();
	 }
	 
	
}
