import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ejercico2 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
             String archivito = "sentences.txt";

            File existe = new File(archivito);
            if (existe.exists()) {
                existe.delete();
                System.out.println("Archivo existente eliminado.");
            }


            try {
                System.out.println("Introduce oraciones. Escribe una cadena vacía para terminar.");

                try (FileWriter writer = new FileWriter(archivito)) {
                    String input = scanner.nextLine();
                    while (!input.isEmpty()) {
                        writer.write(input + "\n");
                        System.out.print("Introduce otra oración (o deja vacío para terminar): ");
                        input = scanner.nextLine();
                    }
                }

                System.out.println("Oraciones good.");
            } catch (IOException e) {
                System.out.println("Error fracase: " + e.getMessage());
            } finally {
                scanner.close();
            }
        }
}


