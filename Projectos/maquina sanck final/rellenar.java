import java.util.Scanner;

public class rellenar {
    public static void rellenarSnacks(Scanner entrada, int[][] cantidad, String[][] nomSnack) {
        System.out.println("Dime la contraseña");
        String contraseña = "MaquinetaDAW";
        String pass = entrada.next();

        if (pass.equals(contraseña)) {
            System.out.println("Estos son los productos que aún quedan");
            for (int i = 0; i < cantidad.length; i++) {
                for (int j = 0; j < cantidad[i].length; j++) {
                    System.out.println(i + "" + j + "  " + nomSnack[i][j] + " nos quedan " + cantidad[i][j]);
                }
            }
            System.out.println("¿Cuál quieres rellenar?");
            String producto1 = entrada.next();
            if (producto1.matches("\\d+") && producto1.length() > 1) {
                int numero1 = Integer.parseInt(producto1.substring(0, 1));
                int numero2 = Integer.parseInt(producto1.substring(1, 2));
                System.out.println("¿Cuántos productos quieres meter?");
                int añadir = entrada.nextInt();
                cantidad[numero1][numero2] = cantidad[numero1][numero2] + añadir;
            }
        } else {
            System.out.println("Contraseña incorrecta");
        }
    }

}



