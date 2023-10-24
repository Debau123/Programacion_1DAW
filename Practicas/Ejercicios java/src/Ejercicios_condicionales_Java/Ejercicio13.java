package Ejercicios_condicionales_Java;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        System.out.println("Dame un numero");
        int Primer_numero = Entrada.nextInt();

        if (Primer_numero > 0) {
            System.out.println("El numero dado es positivo ");
        } else {
            System.out.println("El numero dado es negativo  ");
        }
    }
}
