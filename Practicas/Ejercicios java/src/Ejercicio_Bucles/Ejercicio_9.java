package Ejercicio_Bucles;

import java.util.Scanner;

public class Ejercicio_9 {
    public static void main(String[] args) {
        int n = 1;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Dame el numero que quieres que saquemos la suma y la potencia con los primeros 10 numeros naturales ");
        int Numero = entrada.nextInt();
        for (int contador = 0; contador < 10; contador++) {
            int resultado = Numero + n;
            int resultado_1 = Numero * n;
            System.out.println("La suma de " + Numero + " con " + n + " es " + resultado + " y la multiplicacion " + Numero + " con " + n + " es " + resultado_1);
            n++;
        }
    }
}
