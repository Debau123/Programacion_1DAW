package Ejercicio_Bucles;

public class Ejercicio_18 {
    public static void main(String[] args) {
       int potencia=0;
        for (int i=1;i <6; i ++){
            potencia = (i*i)+ potencia;
        }
        System.out.println("La suma de las potencias de los primeris 5 numeros naturales es  "+ potencia);
    }

}
