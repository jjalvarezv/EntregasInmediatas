package uiMain.operaciones;

import uiMain.OpcionesMenu;
import uiMain.Main;

public class SignOut extends OpcionesMenu{

	public SignOut(String key){
		super(key);
	}
	
	@Override
	public void ejecutar() {
		System.out.println("Byeee...");
		Main.user = null;
		
	}

	@Override
	public String toString() {
		return "Cerrar Sesión";
	}
	
}
