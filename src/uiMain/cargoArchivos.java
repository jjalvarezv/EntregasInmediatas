package uiMain;
import java.io.*;
public class cargoArchivos {
	public static void main(String[] args) throws IOException {
		
		File archivo = new File("C:\\Users\\USUARIO\\Desktop\\datos.txt");
		try {
			FileReader fr = new FileReader (archivo);
			BufferedReader br = new BufferedReader(fr);
			String linea;
			while((linea=br.readLine())!=null)
	            System.out.println(linea);
			
		} 
		catch (FileNotFoundException e) {
			System.err.println("No se encontró el archivo");
		}
			
	}
}


