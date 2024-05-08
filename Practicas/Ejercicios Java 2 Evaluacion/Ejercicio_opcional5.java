import java.util.Scanner;

public class Ejercicio_opcional5 {


        public static void main(String[] args) {
            System.out.println("Dime qué frase o palabra contaremos las vocales");
            Scanner entrada = new Scanner(System.in);
            String frase = entrada.nextLine();
            Contador(frase);
        }

        public static void Contador(String frase) {
            int contadorVocales = 0;
            for (int i = 0; i < frase.length(); i++) {
                char letra = Character.toLowerCase(frase.charAt(i));
                if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                    contadorVocales++;
                }
            }
            System.out.println("El número de vocales en la frase o palabra es: " + contadorVocales);
        }
    }














