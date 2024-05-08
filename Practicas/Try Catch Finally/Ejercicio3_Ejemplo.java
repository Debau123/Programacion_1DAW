import java.util.InputMismatchException;
import java.util.Scanner;
public class Ejercicio3_Ejemplo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double[] vector = new double[5];
        int index = 0;

        System.out.println("Introduce 5 valores :");

        while (index < 5) {
            try {
                System.out.print("Valor " + (index + 1) + ": ");
                vector[index] = entrada.nextDouble();
                index++;

            } catch (InputMismatchException e) {
                System.out.println("Error: Introduce un valor valido .");
                entrada.nextLine();
            }
        }
        System.out.println("\nVector de valores doble introducido :");
        for (double value : vector) {
            System.out.println(value);
        }
        entrada.close();
    }
}


