package Ejercicio_Bucles;

import java.util.Scanner;

public class Ejercicio_5 {
    public static void main(String[] args) {
        Scanner Numero = new Scanner(System.in);
        System.out.println("Dame un numero positivo");
        int N = Numero.nextInt();
        int factorial =1;
        for (int contador = 1; contador <= N; contador++){
            factorial = contador * factorial;
        }
        System.out.println("El factorial de "+ N+" es "+ factorial);


    }
}







