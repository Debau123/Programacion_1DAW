import java.io.FileReader;
import java.io.IOException;

public class Ejemplo_leer {

    public static void main(String[] args) {
        String fichero = "Documentos/frase.txt";

        try {
            FileReader fileReader = new FileReader(fichero);

            int caracter;
            while ((caracter = fileReader.read()) != -1) {
                char letra = (char) caracter;
                System.out.print(letra);
            }
            fileReader.close();
        } catch (IOException ioe) {
            System.out.println("Error al leer el archivo: " + ioe.getMessage());
        }
    }
}
