package Ejercicio_Bucles;

import java.util.Scanner;

public class Ejercicio_7 {
    public static void main(String[] args) {
        int negativo = 0;
        int positivo = 0;
        for (int contador = 0; contador < 101; contador++) {
            Scanner Entrada = new Scanner(System.in);
            System.out.println("Dime un numero: ");
            int numero = Entrada.nextInt();
            if (numero < 0) {
                negativo++;
            } else {
                positivo++;
            }
        }
        System.out.println("He leido " + negativo + "  numeros negativos. Y "+positivo+" numeros positivos.");


    }
}








