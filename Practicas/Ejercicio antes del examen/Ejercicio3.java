import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el nombre del archivo de entrada:");
        String nombreArchivoEntrada = scanner.nextLine();

        System.out.println("Introduce el nombre del archivo de salida:");
        String nombreArchivoSalida = scanner.nextLine();

        try {
            File archivoEntrada = new File(nombreArchivoEntrada);
            if (!archivoEntrada.exists()) {
                archivoEntrada.createNewFile();
                System.out.println("El archivo de entrada no existía y ha sido creado.");
            }


            FileReader archivoLectura = new FileReader(archivoEntrada);
            BufferedReader lector = new BufferedReader(archivoLectura);


            List<String> lineas = new ArrayList<>();
            String linea;
            while ((linea = lector.readLine()) != null) {
                lineas.add(linea);
            }


            Collections.sort(lineas);


            File archivoSalida = new File(nombreArchivoSalida);
            if (!archivoSalida.exists()) {
                archivoSalida.createNewFile();
                System.out.println("El archivo de salida no existía y ha sido creado.");
            }


            FileWriter archivoEscritura = new FileWriter(archivoSalida);
            BufferedWriter escritor = new BufferedWriter(archivoEscritura);


            for (String lineaOrdenada : lineas) {
                escritor.write(lineaOrdenada);
                escritor.newLine();
            }

            //

            System.out.println("El contenido ha sido ordenado y guardado en el archivo de salida.");

        } catch (IOException e) {
            System.out.println("Error al procesar los archivos: " + e.getMessage());
        }
    }
}
