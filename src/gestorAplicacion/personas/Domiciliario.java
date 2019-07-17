package gestorAplicacion.personas;
import gestorAplicacion.gestion.Item;

public class Domiciliario extends UsuarioRegistrado implements CalcularGanancias{
	private gestorAplicacion.gestion.Pedido pedido;
	private String estado;
	
	public Domiciliario() {}
	public Domiciliario(String userName, String pass, String nombre, Long cc,
			gestorAplicacion.gestion.Pedido pedido, String estado) {
		super(userName, pass, nombre, cc);
		this.pedido = pedido;
		this.estado = estado;
	}
	public Domiciliario(String userName, String pass, String nombre, Long cc) {
		super(userName, pass, nombre, cc);
	}
	
	public void asignarPedido(gestorAplicacion.gestion.Pedido pedido) {
		this.pedido= pedido;
	}
	
	@Override
	public int calcular_Ganancias() {
		return (int) (Item.it.getTotal() * 0.45);
	}

	public void cambiarEstado() {
		
	}
	
	public void logout(){
		
	}
	
	public void ToString() {
		System.out.println("esto es una prueba");
	}
}
