import java.util.Scanner;
public class snacks_funciones {



        public static void main(String[] args) {
            String[][] nomSnack = {
                    {"KitKat", "Chicles de fresa", "Lacasitos", "Palotes"},
                    {"Kinder Bueno", "Bolsa variada Haribo", "Chetoos", "Twix"},
                    {"Kinder Bueno", "M&M'S", "Papa Delta", "Chicles de menta"},
                    {"Lacasitos", "Crunch", "Milkybar", "KitKat"}
            };
            double[][] preu = {
                    {1.1, 0.8, 1.5, 0.9},
                    {1.8, 1, 1.2, 1},
                    {1.8, 1.3, 1.2, 0.8},
                    {1.5, 1.1, 1.1, 1.1}
            };

            int columnas = nomSnack[0].length;
            int[][] cantidad = new int[nomSnack.length][columnas];
            for (int i = 0; i < cantidad.length; i++) {
                for (int j = 0; j < cantidad[i].length; j++) {
                    cantidad[i][j] = 5;
                }
            }

            int opcion = -1;
            Scanner entrada = new Scanner(System.in);

            do {
                mostrarMenu();
                System.out.println("Elije una opción");
                opcion = entrada.nextInt();

                switch (opcion) {
                    case 1:
                        pedirSnack(entrada, cantidad);
                        break;
                    case 2:
                        mostrarSnacks(cantidad, nomSnack, preu);
                        break;
                    case 3:
                        rellenarSnacks(entrada, cantidad, nomSnack);
                        break;

                    case 4:
                        System.out.println("Apagando máquina");
                        break;
                    default:
                        System.out.println("Número incorrecto");
                }
            } while (opcion != 4);
        }

        private static void mostrarMenu() {
            System.out.println("1) Pedir snack.");
            System.out.println("2) Mostrar snacks.");
            System.out.println("3) Rellenar snacks.");
            System.out.println("4) Apagar máquina.");
        }

        private static void pedirSnack(Scanner entrada, int[][] cantidad) {
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

        private static void mostrarSnacks(int[][] cantidad, String[][] nomSnack, double[][] preu) {
            for (int i = 0; i < nomSnack.length; i++) {
                for (int j = 0; j < nomSnack[i].length; j++) {
                    if (cantidad[i][j] > 0) {
                        System.out.println(i + "" + j + " " + nomSnack[i][j] + " a un precio de " + preu[i][j]);
                    } else {
                        System.out.println("El producto " + nomSnack[i][j] + " está agotado");
                    }
                }
            }
        }

    private static void rellenarSnacks(Scanner entrada, int[][] cantidad, String[][] nomSnack) {
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


















