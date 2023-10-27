package Ejercicio_Bucles;

public class Ejercicio_11 {

    public static void main(String[] args) {
        int numero = 100;
        int numero_par = 0;
        int numero_impar = 0;
        for (int n = 0; n <=100; n++) {
            if (numero % 2 == 0) {
                numero_par = numero + numero_par;
            } else {
                numero_impar = numero + numero_impar;
            }numero++;
        }
        System.out.println("La suma de los numeros pares entre 100 y 200 " + numero_par + " y la suma de los impares " + numero_impar);
    }
}
