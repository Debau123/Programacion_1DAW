import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio_2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        while (true) {
            System.out.println("Introduce la ruta del archivo o directorio (Enter para salir):");
            String input = entrada.nextLine().trim();

            if (input.isEmpty()) {
                System.out.println("Saliendo del programa...");
                break;
            }

            try {
                File ruta = new File(input);
                if (!ruta.exists()) {
                    throw new FileNotFoundException("La ruta especificada no existe.");
                }
                mostraInfoRuta(ruta);
            } catch (FileNotFoundException | SecurityException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        entrada.close();
    }

    public static void mostraInfoRuta(File ruta) {

        if (ruta.isDirectory()) {
            System.out.println("[D] " + ruta.getName() + " (Directorio)");

            File[] archivos = ruta.listFiles();
            Arrays.sort(archivos);


            for (File archivo : archivos) {
                if (archivo.isDirectory()) {
                    System.out.println("[D] " + archivo.getName() + " (Directorio) pesa : "+ archivo.length()+" y su ultima modificacion fue creado  "+ archivo.lastModified() );

                }
                if (archivo.isFile()) {
                    System.out.println("[A]" + archivo.getName() + "( Archivo) pesa : "+ archivo.length()+" y su ultima modificacion fue creadp "+ archivo.lastModified());
                }

            /* String []archivos = ruta.list();
            for(String archivo:archivos){
                System.out.println( archivo);
            }*/
            }
            if (ruta.isFile()) {
                System.out.println("[A]" + ruta.getName() + "( Archivo)");
            }
        }
    }}
