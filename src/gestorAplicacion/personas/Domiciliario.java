package gestorAplicacion.personas;

public class Domiciliario extends UsuarioRegistrado{
	private gestorAplicacion.gestion.Pedido pedido;
	private String estado;
	
	public Domiciliario() {}
	public Domiciliario(String userName, String pass, String nombre, Long cc,
			gestorAplicacion.gestion.Pedido pedido, String estado) {
		super(userName, pass, nombre, cc);
		this.pedido = pedido;
		this.estado = estado;
	}
	
	public void asignarPedido() {
		
	}
	
	public void cambiarEstado() {
		
	}
	
	public void logout(){
		
	}
	
	public void ToString() {
		System.out.println("esto es una prueba");
	}
}
