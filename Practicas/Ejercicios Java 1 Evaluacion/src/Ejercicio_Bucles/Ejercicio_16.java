package Ejercicio_Bucles;

import java.util.Scanner;

public class Ejercicio_16 {
    public static boolean esprimo(int n) {

        if (n <= 1)
            return false;
        else if (n == 2)
            return true;
        else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0)
                    return false;
            }
            return true;
        }
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Dime un numero positivo y te dire si es  primo");
        System.out.println("Si introduces un 0 lo apagaremos el programa");
        int n = entrada.nextInt();
        do {

            if (esprimo(n)) {
                System.out.println("El numero " + n + " es primo.");
                System.out.println("Dime otro numero :");
                n = entrada.nextInt();
            } else {
                System.out.println("El numero " + n + " no es primo");
                System.out.println("Dime otro numero :");
                n = entrada.nextInt();
            }
        } while (n != 0);
    }
}



