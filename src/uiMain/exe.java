package uiMain;
import java.io.*;
import gestorAplicacion.personas.*;
import gestorAplicacion.gestion.*;

public class exe {
	public static void main(String[] args) throws IOException {
		System.out.println("puto el que lo lea");
		
		File archivo = new File("C:\\Users\\USUARIO\\Desktop\\datos.txt");
		try {
			FileReader fr = new FileReader (archivo);
			BufferedReader br = new BufferedReader(fr);
			String linea;
			while((linea=br.readLine())!=null)
	            System.out.println(linea);
			
		} catch (FileNotFoundException e) {
			System.err.println("No se encontr� el archivo");
		}
		
	}
}

