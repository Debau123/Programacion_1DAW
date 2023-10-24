package Ejercicios_condicionales_Java;

import java.util.Scanner;

public class Ejercicio_9 {
    public static void main(String[] args) {
        Scanner Entrada1 = new Scanner(System.in);
        int edad;
        System.out.println("Escribe un numero");
        edad = Entrada1.nextInt();
           if (edad >= 18){
               System.out.println("Eres mayor de edad");
        } else  {
               System.out.println("Eres menor de edad");
        }
    }
}

