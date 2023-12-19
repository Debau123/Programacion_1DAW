package Ejercicios_Classe;

import java.util.Scanner;

public class ejercicio_rellena_array_bidimensional {
    public static void main(String[] args) {
    /*Programa que crea y carga una matriz de enteros de N filas x N columnas
      N será un número entero que se pedirá al usuario
      El programa ha de rellenar la matriz con valores
      y mostrar una X para los elementos de la diagonal principal y un - para el resto
    */
        Scanner teclado = new Scanner(System.in);
        int tam; //variable para guardar el tamaño de la matriz
        int[][] matriz;

        System.out.println("Introduce un número entero mayor que 0:");
        tam = teclado.nextInt();
        matriz = new int[tam][tam];

        //Rellenar los valores
        for(int filas=0; filas < matriz.length; filas++)
        {
            for (int columnas=0; columnas < matriz[filas].length; columnas++)
            {
                if (filas == columnas)
                {
                    matriz[filas][columnas]=1; //Le asigno un 1 si pertenece a la diagonal principal
                    //Versión corta: mostrar el simbolo a la vez que relleno la matriz
                    //System.out.print(" X ");
                }
                //versión corta
                //else {
                //    System.out.print(" - ");
                //}
            }
            //System.out.println("\n"); //versión corta
        }

        //Mostrar la matriz por pantalla (versión larga)
        //Con la versión corta no haría falta, comentar
        for ( int[] fila : matriz) {
            for ( int elemento : fila ) {
                if (elemento == 1)
                    System.out.print(" X ");
                else System.out.print(" - ");
            }
            System.out.println("\n");
        }

    }
}

