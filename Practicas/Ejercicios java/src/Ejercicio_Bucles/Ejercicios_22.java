package Ejercicio_Bucles;  // Asegúrate de que el paquete esté definido correctamente si es necesario.

import java.util.Scanner;

public class Ejercicios_22 {
    public static void piramide(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        System.out.print("Introduce un número para la altura de la pirámide: ");
        int n = Entrada.nextInt();
        piramide(n);
    }
}

