package Ejercicio_Bucles;

import java.util.Scanner;

public class Ejercicio_17 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("El programa trata de que me des un numero cada vez mas grande que el anterior. Se apagara con 0");
        System.out.println("Dame el numero inicial");
        int n = entrada.nextInt();
        System.out.println("Dame un numero:");
        int m = entrada.nextInt();
        int total = 1;
        int fallos = 0;

        do {
            if (m > n) {
                System.out.println("Dame un numero:");
                total++;
                n = m;
                m = entrada.nextInt();
            } else {
                System.out.println("Fallo es menor.");
                total++;
                fallos++;
                System.out.println("Dime un numero:");
                m = entrada.nextInt();
            }
        } while (m != 0);
        System.out.println("Total de numeros introducidos : " + total);
        System.out.println("Numeros fallados: " + fallos);
    }
}



