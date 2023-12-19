package Ejercicio_Bucles;

import java.util.Scanner;

public class Ejercicio_12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Dime el número");
        int numero = entrada.nextInt();
        int n = numero;
        System.out.println("Dime a qué potencia quieres elevar tu número");
        int potencia = entrada.nextInt();
        int resultado = 1;
        for (int bucle = 0; bucle < potencia; bucle++) {
            resultado *= n;
        }
        System.out.println(numero + " elevado a la " + potencia + " es igual a " + resultado);
    }
}

