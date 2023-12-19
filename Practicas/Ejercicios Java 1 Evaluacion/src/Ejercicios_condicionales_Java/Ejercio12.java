package Ejercicios_condicionales_Java;

import javax.swing.*;
import java.util.Scanner;

public class Ejercio12 {
    public static void main(String[] args) {
        Scanner Entrada=new Scanner(System.in);
        System.out.println("Dime el primer numero");
        int Primer_numero = Entrada.nextInt();
        System.out.println("Dime lo del segundo numero");
        int Segundo_numero = Entrada.nextInt();
        if (Primer_numero > Segundo_numero){
            System.out.println(Primer_numero + " ,"+ Segundo_numero);}
        else if (Segundo_numero >Primer_numero){
            System.out.println(Segundo_numero + " ,  "+ Primer_numero ); }
            else{
            System.out.println("los numeros son iguales");}
    }
}
