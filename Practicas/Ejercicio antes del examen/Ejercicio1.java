
import java.io.*;
import java.util.*;



    public class Ejercicio1 {

        public static void main(String[] args) {
            try {
                // Abrir el archivo de entrada
                File archivo = new File("numeros.txt");
                if (!archivo.exists()) {
                    archivo.createNewFile();
                    System.out.println("El archivo 'numeros.txt' no existía y ha sido creado.");
                    return;
                }

                // Leer los números del archivo
                Scanner scanner = new Scanner(archivo);
                List<Integer> numeros = new ArrayList<>();
                while (scanner.hasNextInt()) {
                    numeros.add(scanner.nextInt());
                }
                scanner.close();

                int maximo = Integer.MIN_VALUE;
                int minimo = Integer.MAX_VALUE;
                for (int numero : numeros) {
                    if (numero > maximo) {
                        maximo = numero;
                    }
                    if (numero < minimo) {
                        minimo = numero;
                    }
                }

                // Mostrar los valores máximo y mínimo por pantalla
                System.out.println("El valor máximo en el archivo 'numeros.txt' es: " + maximo);
                System.out.println("El valor mínimo en el archivo 'numeros.txt' es: " + minimo);

            } catch (IOException e) {
                System.out.println("Error al procesar el archivo: " + e.getMessage());
            }
        }
    }


