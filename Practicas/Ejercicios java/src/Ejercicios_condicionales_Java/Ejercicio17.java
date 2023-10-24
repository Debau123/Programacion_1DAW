package Ejercicios_condicionales_Java;

import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        System.out.println("Dime la hora");
        int Hora = Entrada.nextInt();
        System.out.println("Dime los los minutos");
        int minutos = Entrada.nextInt();
        System.out.println("Dime los segundos");
        int segundos = Entrada.nextInt();
        segundos++;
        if (segundos >= 60) {
            segundos = 0;
            minutos++;
        }
        if (minutos >= 60) {
            minutos = 0;
            Hora++;
        }
        if (Hora >= 24) {
            Hora = 0;
        }
        System.out.println("Cuando pase un segundo, sera: " + Hora + ":" + minutos + ":" + segundos);
    }
}
