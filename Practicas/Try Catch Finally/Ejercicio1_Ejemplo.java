import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio1_Ejemplo {
    public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);

            System.out.print("Introdueix un valor enter: ");

            try {
                int valor = entrada.nextInt();
                System.out.println("Valor introduït: " + valor);
            } catch (InputMismatchException e) {
                System.out.println("Valor introduït incorrecte" + e);
                e.printStackTrace();

            }

        }


    }












