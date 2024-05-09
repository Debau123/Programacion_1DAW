import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class palindormo {

    public static boolean esPalindrom(String frase, String fraseAlReves) {
        frase = frase.replaceAll(" ", "");
        return frase.equals(fraseAlReves);

    }
    public static String escribirAlReves(String frase) {
        frase = frase.replaceAll(" ", "");
        String fraseAlReves = "";
        for (int i = frase.length() - 1; i >= 0; i--) {
            fraseAlReves += frase.charAt(i);
        }
        return fraseAlReves;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introdueix una frase: ");
        String frase = scanner.nextLine();
        String fraseAlReves = escribirAlReves(frase);
        System.out.println("La frase al revés és: " + fraseAlReves);

        if (esPalindrom(frase, fraseAlReves)) {
            System.out.println("La frase és un Palindrome.");
        } else {
            System.out.println("La frase NO ÉS un Palindrome.");
        }

        try {
            FileWriter writer = new FileWriter("frase_al_reves.txt", true);
            writer.write(fraseAlReves);
            writer.close();
        } catch (IOException e) {
            System.out.println("Error al escriure en el fitxer.");
            e.printStackTrace();
        }
    }
}

