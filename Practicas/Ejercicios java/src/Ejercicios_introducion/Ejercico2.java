package Ejercicios_introducion;

import java.util.Scanner;

public class Ejercico2 {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        int Lado;
          System.out.println("Cual es lado del cuadrado?");
          Lado = Entrada.nextInt();

          int Area = Lado * Lado;
           System.out.println("El area es "+ Area);
    }//dd
}