package Ejercicios_voluntarios_array;

import java.util.Scanner;

public class Ejercicio_9 {
    public static void main(String[] args) {
        int array[]= new int[100] ;

        for(int i = 0; i < array.length; i++){
            array[i]=(int)(1+ Math.random()*10);
        }
        Scanner entrada = new Scanner(System.in);
        System.out.println("Dime el numero que quieres que busque en el array");
         int N= entrada.nextInt();
        for (int i= 0; i < array.length;i++){
            if(N == array[i]){
                System.out.print(" "+ i);
            }
        }
        System.out.println();




    }


}
