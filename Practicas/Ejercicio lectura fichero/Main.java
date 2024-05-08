import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        File documento = new File("Documentos/Libros/coplas_manrique.txt");

        try (BufferedReader br = new BufferedReader(new FileReader(documento)))
        {
            String primeraFrase = br.readLine();
            System.out.println("Primera frase: " + primeraFrase);

        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }


        try  {
            FileReader fileReader = new FileReader(documento);
            BufferedReader br = new BufferedReader( fileReader);
            String linea;
            int contadorPalabras = 0;

            while ((linea = br.readLine()) != null) {
                String[] palabras = linea.split("\\s+");
                contadorPalabras += palabras.length;
            }
            System.out.println("El texto tiene " + contadorPalabras + " palabras.");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try   (BufferedReader br = new BufferedReader(new FileReader(documento))){
            String frase;
            int contadorLinea = 0;

            while ((frase = br.readLine()) != null) {
                System.out.println(frase);
                contadorLinea++;

                // Si se han mostrado 25 líneas, pausar y esperar a que el usuario presione Enter
                if (contadorLinea % 25 == 0) {
                    System.out.println("\nPresiona Enter para continuar...");
                    // Esperar a que el usuario presione Enter
                    System.in.read();
                }
            }
        }

        catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
        try  {

            Scanner entrada = new Scanner(System.in);
            String archivo = entrada.nextLine();
            File documento2 = new File("archivo");
            FileReader fileReader = new FileReader(documento2);
            BufferedReader br = new BufferedReader( fileReader);
            System.out.println("Dime la palabra que buscar");
            String palabra = entrada.nextLine();
            int contadorLinea = 0;

            while ((palabra = br.readLine()) != null) {
                contadorLinea++;

                // Si se han mostrado 25 líneas, pausar y esperar a que el usuario presione Enter
                if (palabra.equals(palabra)) {
                    System.out.println("Esta palabra" +
                            "");
                }
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }



    }
    }