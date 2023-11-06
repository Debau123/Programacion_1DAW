package Ejercicio_Bucles;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ejercicio_21 {
    public static void main(String[] args) {
        System.out.println("Dime dos numero A y B. Te dire los numeros que hay entre ellos y cuales son pares");
        System.out.println("El numero A tiene que ser mayor al numero B");
        Scanner Entrada = new Scanner(System.in);
        System.out.println("Dime el numero A");
        int A = Entrada.nextInt();
        System.out.println("Dime un numero B");
        int B = Entrada.nextInt();
        int Pares = 0;
        int L = A;
        if (A < B) {
            for (int i = 0; i <= (B - A); i++) {
                System.out.print(L + " ");

                if (L % 2 == 0) {
                    Pares++;
                    L++;
                } else {
                    L++;
                }
            }
            System.out.println();
            System.out.println("La cantidad de numeros pares es " + Pares);
        } else {
            System.out.println("Introduce un numero A que sea menor que B");
        }
    }
}
