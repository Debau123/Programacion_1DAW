import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ejemplo_leerbuffer {
    public static void main(String[] args) {
        String fichero = "Documentos/frase.txt";


        try {
            FileReader fileReader = new FileReader(fichero);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String linea;
            while ((linea = bufferedReader.readLine()) != null) {

                System.out.print(linea);
            }
            fileReader.close();
            bufferedReader.close();
        } catch (IOException ioe) {
            System.out.println("Error al leer el archivo: " + ioe.getMessage());
        }

    }
}
