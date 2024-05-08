import java.util.Scanner;
import java.util.InputMismatchException;

public class Ejercicio2_Ejemplo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        try {
            System.out.print("Introdueix el valor enter A: ");
            int A = entrada.nextInt();
            System.out.print("Introdueix el valor enter B: ");
            int B = entrada.nextInt();
            int resultat = A / B;
            System.out.println("Resultat de la divisió A/B: " + resultat);

        } catch (InputMismatchException e) {
            System.out.println("Error: Introduce un valor valido.");

        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir por 0");

        } finally {

            entrada.close();
        }
    }
}

