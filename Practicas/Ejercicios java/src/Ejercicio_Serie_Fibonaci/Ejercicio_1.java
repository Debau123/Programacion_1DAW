package Ejercicio_Serie_Fibonaci;

import java.util.Scanner;

public class Ejercicio_1 {
    public static void main(String[] args) {
        int a = 0;
        int b =1;
        int c= 0;

        System.out.println("Cuantas numeros  de la serie Fibonacci quieres que te digamos ");
        Scanner entrada=new Scanner(System.in);

        int vueltas = entrada.nextInt()+2;
        for(int i = 2; i < vueltas; i++){
            System.out.print(a+" , ");
            c = a +b;
            a= b;
            b= c;

        }
    }
}
