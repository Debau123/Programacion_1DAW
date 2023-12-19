package Ejercicios_numeros_aleatorios;

import java.util.Random;

public class Ejercicio_4 {
    public static void main(String[] args) {
        Random aleatorios = new Random();
        int Sumatorio = 0;
        int numeropar;
        Random numero = new Random();
        do {
            int numeroaleatorio = numero.nextInt(50) + 1;
            numeropar = numeroaleatorio * 2;
            System.out.println(numeropar);
            Sumatorio++;
        } while (numeropar != 24);
        System.out.println("Se han mostrado " + Sumatorio + " numeros");
    }
}
