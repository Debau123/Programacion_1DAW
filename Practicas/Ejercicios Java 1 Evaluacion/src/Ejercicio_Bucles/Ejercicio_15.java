package Ejercicio_Bucles;

import java.util.Scanner;

public class Ejercicio_15 {
    public static void main(String[] args) {
        int numero = 1;
        Scanner entrada = new Scanner(System.in);
        System.out.println("El numero hasta el cual quieres que te digamos los multiplos de 3.");
        int limite = entrada.nextInt();
        int contador = 0;

        while (numero <= limite) {
            if (numero % 3 == 0) {
                contador++;
            }numero++;
        }
        System.out.println("Los numeros multiplos de 3 que hay hasta "+limite+" son "+contador);

    }
}
