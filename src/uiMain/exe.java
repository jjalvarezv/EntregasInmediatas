package uiMain;
import gestorAplicacion.personas.*;
import gestorAplicacion.gestion.*;

public class exe {
	public static void main(String[] args) {
		System.out.println("puto el que lo lea");
		Admin admin1 = new Admin("chimbo","1234","jj",54321L);
		admin1.aggAdmin("culo", "134651321", "jj2", 458485L);
		System.out.println(admin1.getAdmin());
	}
}
