

import java.util.Scanner;
import java.util.Random;

public class Ejercicio4_Ejemplo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        try {
            int N = random.nextInt(100) + 1;
            int[] vector = new int[N];

            // Omplim el vector amb valors aleatoris entre 1 i 10
            for (int i = 0; i < N; i++) {
                vector[i] = random.nextInt(10) + 1;
            }

            System.out.println("S'ha creat un vector d'enters amb mida " + N);

            // Bucle per preguntar a l'usuari quina posició vol mostrar
            while (true) {
                System.out.print("Introdueix una posició (0 - " + (N - 1) + ") per mostrar el valor (introdueix un valor negatiu per sortir): ");
                int posicio = sc.nextInt();

                // Comprovem si l'usuari vol sortir del programa
                if (posicio < 0) {
                    System.out.println("Adéu!");
                    break; // Sortim del bucle si l'usuari introdueix un valor negatiu
                }

                // Mostrem el valor de la posició especificada
                if (posicio >= 0 && posicio < N) {
                    System.out.println("Valor a la posició " + posicio + ": " + vector[posicio]);
                } else {
                    System.out.println("Posició fora de l'abast del vector. Introdueix una posició vàlida.");
                }
            }

        } catch (NegativeArraySizeException e) {
            System.out.println("Error: La mida del vector és negativa.");
        } catch (OutOfMemoryError e) {
            System.out.println("Error: No hi ha prou memòria per crear el vector.");
        } catch (Exception e) {
            System.out.println("Error inesperat: " + e.getMessage());
        } finally {
            // Tanquem el scanner al final
            if (sc != null) {
                sc.close();
            }
        }
    }
}
