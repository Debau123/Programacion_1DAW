package Ejercicios_Classe;

import java.util.Scanner;

public class Prueba_String {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Dime una frase y te contare cuantas vocales tiene");
        String frase = entrada.nextLine();
        int cuenta = 0;
        for (int i = 0; i < frase.length(); i++) {
            //Comprobar si es vocal
            if (frase.charAt(i) == 'a' || frase.charAt(i) == 'A') {
                cuenta++;
            } else if (frase.charAt(i) == 'e' || frase.charAt(i) == 'E') {
                cuenta++;
            } else if (frase.charAt(i) == 'e' || frase.charAt(i) == 'E') {
                cuenta++;
            } else if (frase.charAt(i) == 'i' || frase.charAt(i) == 'I') {
                cuenta++;
            } else if (frase.charAt(i) == 'o' || frase.charAt(i) == 'O') {
                cuenta++;
            } else if (frase.charAt(i) == 'u' || frase.charAt(i) == 'U') {
                cuenta++;
            } else {
            }

        }
        System.out.println("Hay " + cuenta + " vocales en la frase");

    }

}

