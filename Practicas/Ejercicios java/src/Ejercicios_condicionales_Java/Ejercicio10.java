package Ejercicios_condicionales_Java;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner Entrada1 = new Scanner(System.in);
        int numero1;
        System.out.println("Escribe un numero");
        numero1 = Entrada1.nextInt();
        Scanner Entrada2 = new Scanner(System.in);
        int numero2;
        System.out.println("Escribe otro numero");
        numero2 = Entrada2.nextInt();
        int suma = numero1 + numero2;
        int resta = numero1 - numero2;
        int multi = numero1 * numero2;
        if (numero1 == 0) {
            System.out.println("No se puede dividir por 0");
        } else if (numero2 == 0) {
            System.out.println("No se puede dividir por 0");
        } else {
            int division = numero1 / numero2;
            System.out.println("La division es" + division);
        }
        System.out.println("La suma es " + suma);
        System.out.println("La resta es " + resta);
        System.out.println("La multiplicación es " + multi);

    }

}


