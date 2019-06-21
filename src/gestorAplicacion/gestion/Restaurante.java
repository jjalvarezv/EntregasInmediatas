package gestorAplicacion.gestion;
import gestorAplicacion.personas.PropietarioRestaurante;
import java.util.*;

public class Restaurante {

	private int codigo;
	private String direccion;
	private PropietarioRestaurante propietario;
	private long telefono;
	private ArrayList<Producto> Carta;
	
	public Restaurante(int cod, String direcc, PropietarioRestaurante prop, long tel) {
		this.codigo= cod;
		this.direccion= direcc;
		this.propietario= prop;
		this.telefono= tel;
	}
	public void agregarProducto(Producto producto) {
		Carta.add(producto);
	}
	public void eliminarProducto(Producto producto) {
		Carta.remove(producto);
	}
	public void calcularGanancias() {
		
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
	 public PropietarioRestaurante getPropietario() {
		 return this.propietario;
	 }
	 public long getTelefono() {
		 return this.telefono;
	 }
	 public ArrayList<Producto> getCarta(){
		 return this.Carta;
	 }
}
