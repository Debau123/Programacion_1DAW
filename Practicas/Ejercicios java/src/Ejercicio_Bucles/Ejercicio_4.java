package Ejercicio_Bucles;

import java.util.Scanner;

public class Ejercicio_4 {
    public static void main(String[] args) {
        Scanner Entrada=new Scanner(System.in);
        System.out.println("Hasta que numero quieres que contemos");
        int Numero= Entrada.nextInt();
        int i =1;
        while (i <= Numero ) {
            System.out.println(i);
            ++i;}
    }
}
