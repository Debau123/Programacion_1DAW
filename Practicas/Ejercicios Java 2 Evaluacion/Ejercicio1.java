import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        System.out.println("Dime qué número quieres sumar");
        int a = Entrada.nextInt();
        System.out.println("Dime qué número quieres sumar");
        int b = Entrada.nextInt();
        int resultado = Sumatorio(a, b);

        System.out.println("El resultado de la suma es: " + resultado);
    }

    public static int Sumatorio(int a, int b) {
        int sumatorio = a + b;
        return sumatorio;
    }
}





