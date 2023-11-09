package Ejercicios_numeros_aleatorios;

import javax.management.MBeanAttributeInfo;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio_3 {
    public static void main(String[] args) {

        System.out.println("El programa te va a dar 50 numeros y te va a decir el mas grande el mas pequeño y te dara la media de los 50");
        Random aleatorios = new Random();
        Scanner scanner = new Scanner(System.in);
        int suma = 0;
        int minimo = 200;
        int maximo = 99;
        System.out.print("Escribe 'empieza' para que el programa comience: ");
        String PALABRA = scanner.nextLine();
        if ("empieza".equals(PALABRA)) {
            for (int i = 0; i < 50; i++) {
                int numero = aleatorios.nextInt(100) + 100;
                suma += numero;
                if (numero < minimo) {
                    minimo = numero;
                }
                if (numero > maximo) {
                    maximo = numero;
                }
                System.out.print(numero + " ");
            }

            System.out.println();
            System.out.println("Mínimo: " + minimo);
            System.out.println("Máximo: " + maximo);
            double media = (double) suma / 50;
            System.out.println("Media: " + media);
        } else {
            System.out.println("No empezamos sino escribes 'empieza'");
        }

    }
}





















