package Ejercicio_Bucles;

import java.util.Scanner;

public class Ejercicio_8 {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        int negativo = 0;
        int positivo = 0;

        while (true) {
            System.out.println("Dime un numero contaremos los negativos y los positivos: (Si me das un 0 se terminara) ");
            int numero = Entrada.nextInt();

            if (numero < 0) {
                negativo++;
            } else if (numero >0)  {
                positivo++;
            } else {
                break;
            }
        }
        System.out.println("He leido " + negativo + "  numeros negativos. Y "+positivo+" numeros positivos.");








    }



}
