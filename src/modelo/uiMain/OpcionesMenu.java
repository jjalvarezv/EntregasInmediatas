package modelo.uiMain;
import java.util.Map;
import modelo.Datos.Data;

public abstract class OpcionesMenu {
	
	private String key;
	
	protected OpcionesMenu() {
	}
	
	protected OpcionesMenu(String key){
		this.key = key;
	}
	
	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public abstract void ejecutar ();
	
	public abstract String toString ();
	
	public static void seeAllOperations() {
		int i = 1;
		//for (Map.Entry<String, OpcionesMenu> opcionDeMenu : Data.operaciones.entrySet()) {
			//System.out.println(i + " "+opcionDeMenu.getValue());
			//i++;
		}
	}


