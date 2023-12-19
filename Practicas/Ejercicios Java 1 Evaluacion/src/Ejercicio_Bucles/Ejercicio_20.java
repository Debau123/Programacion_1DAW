package Ejercicio_Bucles;

import java.util.Scanner;

public class Ejercicio_20 {

    public static void main(String[] args) {
        Scanner Entradra = new Scanner(System.in);


            System.out.println("Dame el numero que quieres que pongamos en la piramide");
            int n = Entradra.nextInt();
            if (n > 0) {
                System.out.println("Correcto");
                for (int i = 1; i <= n; i++) {
                    System.out.println();
                    for (int j = 1; j <= i; j++)
                        System.out.print(i + " ");
                }


                }else {
                System.out.println("Numero incorecto");

        }
    }
}




