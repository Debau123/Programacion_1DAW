package Ejercicios_voluntarios_array;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ejercicio_6 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Dime la medidia del array");
        int N = entrada.nextInt();
        int  [] array =new int[N];
        System.out.println("Dime el numero con el que rellenaremos el array ?");
        int M = entrada.nextInt();
        for(int i = 0; i< array.length; i++ ){
            array[i]= M;
        }
        System.out.println("El array es : ^[ ");
        for (int elemento :array){
            System.out.print(" , "+ elemento);
        }
        System.out.print(" ] " );
    }



}
