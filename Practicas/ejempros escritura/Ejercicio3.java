import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio3 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String archivito = "annotations.txt";

            try {
                System.out.println("Introduce oraciones. Escribe una cadena vacía para terminar.");

                try (FileWriter writer = new FileWriter(archivito, true)) {
                    String input = scanner.nextLine();
                    while (!input.isEmpty()) {
                        writer.write(input + "\n");
                        System.out.print("Introduce otra oración (o deja vacío para terminar): ");
                        input = scanner.nextLine();
                    }


                System.out.println("Oraciones escritas correctamente en el archivo.");}
            } catch (IOException e) {
                System.out.println("Error al escribir en el archivo: " + e.getMessage());
            } finally {
                scanner.close();
            }
        }
    }


