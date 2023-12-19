public class Mostrar {
    public static void mostrarSnacks(int[][] cantidad, String[][] nomSnack, double[][] preu) {
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
}
