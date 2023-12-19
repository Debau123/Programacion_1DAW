package Ejercicios_voluntarios_array;

import java.util.Scanner;

public class Ejercicio_13 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Dime cuanto quieres que mida el array:");
        int N = entrada.nextInt();
        int []array = new int [N];
        System.out.println("Dime el valor por el que quieres que empieze ");
        int V = entrada.nextInt();
        System.out.println("Dime por cuanto quieres que lo incrementemos ");
        int I = entrada.nextInt();

        for (int i =0; i < array.length; i++){
            array[i]=V;
            V=V+I;
        }
        for (int elemento:array){
            System.out.print(elemento+ " , ");

        }
    }

}
