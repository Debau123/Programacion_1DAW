package Ejercicios_condicionales_Java;

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        System.out.println("Dime el primer numero: ");
        int Primer_numero = Entrada.nextInt();
        System.out.println("Dime el segundo numero: ");
        int Segundo_numero = Entrada.nextInt();
        System.out.println("Dime el tecer numero: ");
        int Tercero_numero = Entrada.nextInt();
        if (Primer_numero > Segundo_numero && Primer_numero > Tercero_numero) {
            System.out.println(Primer_numero + " es el mayor numero.");
        } else if (Segundo_numero > Primer_numero && Segundo_numero > Tercero_numero) {
            System.out.println(Segundo_numero + "  es el mayor numero");
        } else {
            System.out.println(Tercero_numero + "  es el mayoR numero");
        }
    }

}