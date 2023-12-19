package Ejercicios_introducion;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner entrada1 = new Scanner(System.in);
        System.out.println("¿Cuantas millas tenemos?");
        int millas = entrada1.nextInt();
        int metro = 1852;
        int resultado = millas * metro;
        System.out.println("\n Las  "+ millas+" millas son  18"+ resultado+" metros");

//dd

    }
}
