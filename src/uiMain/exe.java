package uiMain;
import gestorAplicacion.personas.*;
import gestorAplicacion.gestion.*;

public class exe {
	public static void main(String[] args) {
		System.out.println("puto el que lo lea");
		Admin a= new Admin();
		
		a.aggAdmin("jj", "321", "juan",(long)123);
		a.getAdmin().toString();
	}
}
