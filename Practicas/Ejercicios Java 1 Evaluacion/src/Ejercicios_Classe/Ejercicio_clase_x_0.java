package Ejercicios_Classe;

public class Ejercicio_clase_x_0 {
    //Crear una matriz “marco” de tamaño 8x6:
// todos sus elementos deben ser 0 salvo los de los bordes que deben ser 1.
// Mostrarla.


    public static void main(String[] args) {
        int[][] m = new int[10][10]; //Crear e inicializar la matriz (a ceros).


        //rellenar la matriz marco
        for (int fila = 0; fila < m.length; fila++) {
            for (int columna = 0; columna < m[fila].length; columna++) {

                //Comprobamos si estamos en la 1º o última fila
                if (fila == 0 || fila == m.length - 1) //fila==7
                {
                    m[fila][columna] = 1;
                }
                //Comprobamos si estamos en la 1ª o última columna
                if (columna == 0 || columna == m[fila].length - 1) //columna==5
                {
                    m[fila][columna] = 1;
                }
            }
        }

        System.out.println("*****Matriz marco*****");
        //Mostramos la matriz marco
        for (int[] f : m) {
            /*for (int c : f)                       //1ª forma
            {
                System.out.print(" "+c+" ");
            }
            System.out.println("\n");*/
            //System.out.println(Arrays.toString(f)); //2º forma
        }

        //3ª forma
        for (int f = 0; f < m.length; f++) {
            for (int c = 0; c < m[f].length; c++) {
                System.out.print(" " + m[f][c] + " ");
            }
            System.out.println(" ");
        }

    }
}

