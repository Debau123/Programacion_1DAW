package Ejercicio_Bucles;

import java.util.Scanner;

public class Ejercicio_10 {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        int diez = 0;
        System.out.println("Dime las notas y te dire cuantos 10 hay.(Se terminara introduciendo un negativo)");
        while (true) {
            int nota = Entrada.nextInt();
            if (nota == 10) {
                diez++;
            } else if (nota < 0) {
                break;
            }
        }
        System.out.println("Has sacado " + diez + " 10 enhorabuena");
    }


}
