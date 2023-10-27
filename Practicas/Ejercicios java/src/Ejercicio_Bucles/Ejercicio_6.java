package Ejercicio_Bucles;

import java.util.Scanner;

public class Ejercicio_6 {
    public static void main(String[] args) {
        int negativo = 0;
        for (int contador = 1; contador < 101; contador++) {
            Scanner Entrada = new Scanner(System.in);
            System.out.println("Dime un numero: ");
            int numero = Entrada.nextInt();
            if (numero < 0) {
                negativo++;
            }
        }
        System.out.println("He leido " + negativo + "  numeros negativos");


    }
}
