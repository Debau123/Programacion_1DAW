import java.io.*;
import java.util.*;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        File archivoNombres = new File("usa_noms.txt");
        File archivoCognoms = new File("usa_cognoms.txt");

        try {

            if (!archivoNombres.exists()) {
                crearArchivo(archivoNombres, Arrays.asList("Juan", "María", "Carlos", "Ana", "Pedro"));
            }
            if (!archivoCognoms.exists()) {
                crearArchivo(archivoCognoms, Arrays.asList("García", "Martínez", "López", "González", "Rodríguez"));
            }


            List<String> nombres = leerArchivo(archivoNombres);
            List<String> apellidos = leerArchivo(archivoCognoms);


            System.out.println("¿Cuántos nombres de persona desea generar?");
            int cantidadNombres = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea pendiente después de nextInt()


            System.out.println("Ingrese el nombre del archivo donde desea guardar los nombres generados:");
            String nombreArchivoSalida = scanner.nextLine();

         
            generarNombresPersona(nombres, apellidos, cantidadNombres, nombreArchivoSalida);

            System.out.println("Se han generado y guardado correctamente los nombres de persona.");

        } catch (IOException e) {
            System.out.println("Error al leer o escribir en el archivo: " + e.getMessage());
        }
    }

    public static List<String> leerArchivo(File archivo) throws IOException {
        List<String> contenido = new ArrayList<>();
        BufferedReader lector = new BufferedReader(new FileReader(archivo));
        String linea;
        while ((linea = lector.readLine()) != null) {
            contenido.add(linea.trim());
        }
        lector.close();
        return contenido;
    }

    public static void crearArchivo(File archivo, List<String> contenido) throws IOException {
        FileWriter escritor = new FileWriter(archivo);
        BufferedWriter bufferEscritor = new BufferedWriter(escritor);
        for (String linea : contenido) {
            bufferEscritor.write(linea);
            bufferEscritor.newLine();
        }
        bufferEscritor.close();
    }

    public static void generarNombresPersona(List<String> nombres, List<String> apellidos, int cantidadNombres, String nombreArchivo) throws IOException {
        Random random = new Random();
        FileWriter escritor = new FileWriter(nombreArchivo, true);
        BufferedWriter bufferEscritor = new BufferedWriter(escritor);

        for (int i = 0; i < cantidadNombres; i++) {
            String nombre = nombres.get(random.nextInt(nombres.size()));
            String apellido = apellidos.get(random.nextInt(apellidos.size()));
            String nombreCompleto = nombre + " " + apellido;
            bufferEscritor.write(nombreCompleto);
            bufferEscritor.newLine();
        }

        bufferEscritor.close();
    }
}

