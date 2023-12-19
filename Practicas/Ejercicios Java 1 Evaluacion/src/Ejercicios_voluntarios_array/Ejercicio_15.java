package Ejercicios_voluntarios_array;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio_15 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Dime el valor de la longitud del array");
        int N = entrada.nextInt();
        System.out.println("Dime con que valor quieres que rellenemos todo el array");
        int M = entrada.nextInt();
        int []array= new int[N];
        Arrays.fill(array,0,array.length,M);
        for (int elemento:array){
            System.out.print(elemento);

        }
    }
}
