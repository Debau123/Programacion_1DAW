package Ejercicios_voluntarios_array;

import java.util.Scanner;

public class Ejercicio_12 {
    public static void main(String[] args) {


        Scanner entrada = new Scanner(System.in);
        int[] array = new int[10];
        System.out.println("a. Mostrar valors.\n" +
                "b. Introduir valor.\n" +
                "c. Eixir.");
        String clave = entrada.next();

        while (!clave.equalsIgnoreCase("c")) {

            if (clave.equalsIgnoreCase("a")) {
                for (int elemento : array) {
                    System.out.print(elemento + " ,");
                }
            } else if (clave.equalsIgnoreCase("b")) {
                System.out.println("Dime que posicion del array quierres modificar");
                int P = entrada.nextInt();
                System.out.println("Dime que valor quieres darle a " + array[P]);
                int V = entrada.nextInt();
                array[P] = V;
            } else {
                System.out.println("No has introducido un valor valido");
            }
            System.out.println();
            System.out.println("Que quieres hacer ahora: (a , b ,c)");
            clave = entrada.next();
        }


    }
}

