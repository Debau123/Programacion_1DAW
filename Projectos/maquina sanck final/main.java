import java.util.Scanner;

public class main {
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
            Menu.mostrarMenu();
            System.out.println("Elije una opción");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    Pedir.pedirSnack(entrada, cantidad);
                    break;
                case 2:
                    Mostrar.mostrarSnacks(cantidad, nomSnack, preu);
                    break;
                case 3:
                    rellenar.rellenarSnacks(entrada, cantidad, nomSnack);
                    break;

                case 4:
                    System.out.println("Apagando máquina");
                    break;
                default:
                    System.out.println("Número incorrecto");
            }
        } while (opcion != 4);
    }

}

