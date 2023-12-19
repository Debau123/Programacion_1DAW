package Ejercicios_introducion;

import java.util.Scanner;

public class Ejericio6 {
    public static void main(String[] args) {
        Scanner entrada1 = new Scanner(System.in);
        System.out.println("Escribe el precio de venta");
        double Precio_venta = entrada1.nextDouble() ;
        Scanner entrada2 = new Scanner(System.in);
        System.out.println("\n Escribre el precio con el descuento");
        double Precio_desc = entrada2.nextDouble();
        double Descuento = (Precio_desc * 100)/ Precio_venta;
        int Descuento_final = 100 - (int)Descuento;
                System.out.println("\nEl descuento es de "+ Descuento_final+"% ");
               }//dd
}

