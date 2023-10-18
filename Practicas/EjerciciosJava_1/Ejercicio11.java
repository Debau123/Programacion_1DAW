import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        System.out.println("Escribe el primer numero");
        int primer_numero = Entrada.nextInt();
        System.out.println("Introduce segundo numero");
        int segunda_entrada = Entrada.nextInt();
        if (primer_numero > segunda_entrada) {
            System.out.println(primer_numero + " es mayor que  " + segunda_entrada);
        } else if (segunda_entrada > primer_numero) {
            System.out.println(segunda_entrada + " es mayor que  " + primer_numero);
        } else
            System.out.println("los numeros son iguales");
    }
}

