package Practicas.EjerciciosJava_1;

import java.util.Scanner;

public class Ejercicioclasseternario {
    public static void main(String[] args) {
        int socio;
        System.out.println("¿Eres socio?");
        Scanner teclado = new Scanner(System.in);
        socio = teclado.nextInt();
        int dto = (socio==1) ? 10 : 0;
        System.out.println("El cliente tendra un " + dto + " de descuento.");

    }
}
