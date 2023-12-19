package Ejercicios_voluntarios_array;

import java.util.Scanner;

public class Ejercicio_7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce el primer numero ?");
        int P = entrada.nextInt();
        System.out.println("Introduce el segundo numero ? ");
        int Q = entrada.nextInt();
        int N = (Q - P)+1;
        int suma = P;
        int[]array= new int[N];
        for(int i = 0; i < array.length; i++){
            array[i]=suma;
            suma++;
        }
        System.out.println( "El array quedaria ");
        for(int elemento: array){
            System.out.print(elemento+" , ");

        }

    }
}
