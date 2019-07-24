package gestorAplicacion.personas;
import gestorAplicacion.gestion.Item;
import gestorAplicacion.gestion.Pedido;

public class Domiciliario extends UsuarioRegistrado implements CalcularGanancias{
	private gestorAplicacion.gestion.Pedido pedido;
	private int estado;
	
	
	// Constantes de estado para domiciliario
	public static final int  ESTADO_DISPONIBLE= 0;
	public static final int  ESTADO_OCUPADO= 1;
	public static final int  ESTADO_OFFLINE= 2;
	
	public Domiciliario() {}
	public Domiciliario(String userName, String pass, String nombre, Long cc,
			gestorAplicacion.gestion.Pedido pedido, int estado) {
		super(userName, pass, nombre, cc);
		this.pedido = pedido;
		this.estado = estado;
	}
	public Domiciliario(String userName, String pass, String nombre, Long cc) {
		super(userName, pass, nombre, cc);
		this.estado = ESTADO_DISPONIBLE;
	}
	
	public void asignarPedido(gestorAplicacion.gestion.Pedido pedido) {
		this.pedido= pedido;
	}
	
	@Override
	public int calcular_Ganancias() {
		return (int) (Item.it.getTotal() * 0.45);
	}

	public void cambiarEstado(int nuevoEstado) {
		this.estado = nuevoEstado;
		
	}
	
	public void logout(){
		
	}
	
	public int getEstado() {
		return this.estado;
	}
	
	public Pedido getPedido() {
		return this.pedido;
	}
	
	public void ToString() {
		System.out.println("esto es una prueba");
	}
}
