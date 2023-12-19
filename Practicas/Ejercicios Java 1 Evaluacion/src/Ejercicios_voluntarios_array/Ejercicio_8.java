package Ejercicios_voluntarios_array;

import java.util.Scanner;

public class Ejercicio_8 {
    public static void main(String[] args) {
         double array[]= new double[100] ;

         for(int i = 0; i < array.length; i++){
             array[i]= Math.random();
         }
        Scanner entrada = new Scanner(System.in);
        System.out.println("Dime un numero entre 0 y 1 y te dire cuantos igual o mayores hay " );
        double numero = entrada.nextDouble();
        int cuantos = 0;
        for (int i =0; i < array.length;i ++){
            if(array[i] >= numero){
                System.out.print(array[i]+ " , ");
                cuantos++;
            }
        }
        System.out.println("Cantidad de nu numeros igual o mayores "+ cuantos);



    }
}
