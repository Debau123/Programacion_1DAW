package Ejercicios_numeros_aleatorios;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ejercicio_1 {
    public static void main(String[] args) {
        System.out.println("Te voy a mostrar la tirada de tres dados cuando estes listo escribe tira");
        Scanner Entrada = new Scanner(System.in);
        String palabra = Entrada.next();
        if(palabra.equalsIgnoreCase("tira")) {
            int valorDado1 =(int) (Math.floor(Math.random()*(1-6+1)+6));
            int valorDado2 =(int) (Math.floor(Math.random()*(1-6+1)+6));
            int valorDado3 =(int) (Math.floor(Math.random()*(1-6+1)+6));
            System.out.println( "El dado 1 a sido "+ valorDado1);
            System.out.println("El dado 2 a sido "+ valorDado2);
            System.out.println("El dado 3 a sido "+ valorDado3);
            System.out.println("La suma de todos los dados es "+(valorDado1+valorDado2+valorDado3));

        }else
            System.out.println("No has escrito tira asi que  no te lo digo");
    }
}
