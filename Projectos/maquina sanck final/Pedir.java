import java.util.Scanner;

public class Pedir {
    public static void pedirSnack(Scanner entrada, int[][] cantidad) {
        System.out.println("¿Qué producto quieres?");
        entrada.nextLine();
        String producto = entrada.nextLine();

        if (producto.matches("\\d+") && producto.length() > 1) {
            int numero1 = Integer.parseInt(producto.substring(0, 1));
            int numero2 = Integer.parseInt(producto.substring(1, 2));
            cantidad[numero1][numero2]--;
        } else {
            System.out.println("Producto seleccionado: " + producto);
        }
    }


}






