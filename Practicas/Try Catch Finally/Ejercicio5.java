import java.util.Scanner;

public class Ejercicio5 {

    public static void imprimeixPositiu(int p) throws Exception {
        if (p < 0) {
            throw new Exception("El " + p + " numero es negativo");
        }
        System.out.println("El numero positivo es " + p);
    }

    public static void imprimeixNegatiu(int p) throws Exception {
        if (p >= 0) {
            throw new Exception("El " + p +" numero es positivo");
        }
        System.out.println("El numero negativo es " + p);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];


        System.out.println("Introduce 5 números:");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = scanner.nextInt();
        }

        System.out.println("Imprimiendo números positivos:");
        for (int i = 0; i < numeros.length; i++) {
            try {
                imprimeixPositiu(numeros[i]);
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }
        System.out.println();
        System.out.println();
        System.out.println("Imprimiendo números negativos:");
        for (int i = 0; i < numeros.length; i++) {
            try {
                imprimeixNegatiu(numeros[i]);
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }
    }
}

