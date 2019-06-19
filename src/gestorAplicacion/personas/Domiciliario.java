package gestorAplicacion.personas;

public class Domiciliario extends UsuarioRegistrado{
	public gestorAplicacion.gestion.Pedido pedido;
	public String estado;
	
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
	
	public void metodoPrueba() {
		
	}
	public void logout(){
		
	}
	
}
