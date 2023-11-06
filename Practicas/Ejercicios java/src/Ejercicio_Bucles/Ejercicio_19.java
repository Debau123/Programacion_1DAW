package Ejercicio_Bucles;

import java.util.Scanner;

public class Ejercicio_19 {
    public static void main(String[] args) {
        System.out.println("Dame un numero y te pondre * como en numero");
        Scanner Entrada = new Scanner(System.in);
        int Numero= Entrada.nextInt();
        if (Numero >0){
            for(int i=0; i< Numero; i++ ){
                System.out.print("*");
            }
        }else{
            System.out.println("$");
        }
    }
}
