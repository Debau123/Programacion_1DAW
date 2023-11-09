package Ejercicios_Classe;

import java.util.Scanner;

public class vector_numeros {
    public static void main(String[] args) {
        int[] array = new int[15];
        Scanner Entrada = new Scanner(System.in);
        for (int indice = 0; indice < array.length; indice++) {
            System.out.println("Introduce un valor entero positivo");
            array[indice] = Entrada.nextInt();
        }
        for (int indice = 0; indice < array.length; indice++) {
            System.out.print
                    ("[" + array[indice] + "]");


        }
    }
}
