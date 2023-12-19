package Ejercicios_arrays_bidemensionales;

import java.util.Scanner;

public class Ejercicio_Programa_array {


    public static void main(String[] args) {
        int[][] array = new int[4][4];//Declaro y inicio el array bidemensional que sera 4 x4 el programa esta echo para que solo cambiemos aqui el tamaño y seguira guncionando
        System.out.println(" 1.   Omplir TOTA la matriu de números.\n" +//aqui el primer menu con las opciones
                " 2.   Suma d'una fila. \n" +
                " 3.   Suma d'una columna \n" +
                " 4.   Sumar la diagonal principal \n" +
                " 5.   Sumar la diagonal inversa \n" +
                " 6.   La mitjana de tots els valors de la matriu");
        Scanner entrada = new Scanner(System.in);
        int opcion = entrada.nextInt();//la variable que eliga


        while (opcion != 1) { //aunque como dice el ejercicio solo vaya con el 1 para rellenar el array
            System.out.println("La primera opción que hay que utilizar es la 1, sino no podemos seguir ");
            System.out.println("¿Qué opción quieres?");
            opcion = entrada.nextInt();
        }


        System.out.println("Vamos a rellenar el array ");

        for (int i = 0; i < array.length; i++) {//el for con otro far para ir rellenando el array
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("Que valor quieres darle a el array columna " + i + " fila " + j + " :");//aqui escribimos la linea y coolumna que se rellena
                array[i][j] = entrada.nextInt();//aqui se rellena
            }
        }
        System.out.println("Matriz completada:");
        for (int[] fila : array) {//aqui mostamos la matriz para que la vea el usuario con un  buvle for each
            for (int elemento : fila) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }
        do { //aqui iniciamos un buclo so while para que el usuario tenga las opciones y vaya trabanjando hasta que  marque el 7
            System.out.println(" 1.   Omplir TOTA la matriu de números.\n" +//Hemos vuelto a poner el 1 por si no le gusta el array o sea equivocado
                    " 2.   Suma d'una fila. \n" +
                    " 3.   Suma d'una columna \n" +
                    " 4.   Sumar la diagonal principal \n" +
                    " 5.   Sumar la diagonal inversa \n" +
                    " 6.   La mitjana de tots els valors de la matriu\n" +
                    " 7.   Salir");


            opcion = entrada.nextInt();

            switch (opcion) {//un buqle switch para als diferentes opciones

                case 1://es el rellando
                    for (int i = 0; i < array.length; i++) {
                        for (int j = 0; j < array[i].length; j++) {
                            System.out.println("Que valor quieres darle a el array columna " + i + " fila " + j + " :");
                            array[i][j] = entrada.nextInt();
                        }
                    }
                    System.out.println("Matriz completada:");
                    for (int[] fila : array) {
                        for (int elemento : fila) {
                            System.out.print(elemento + " ");
                        }
                        System.out.println();
                    }
                    System.out.println();
                    break;
                case 2://este suma una fila
                    System.out.println("Que fila quieres sumar");
                    int fila = entrada.nextInt();
                    while (fila < 0 || fila >= array.length) {//este while es por si al elegir fila pone una fila que no hay en el arraid menor de 0 y mayor  que las filas que tiene
                        System.out.println("Esa fila no es válida. Introduce una fila válida:");
                        fila = entrada.nextInt();
                    }
                    int suma_fila = 0;
                    for (int i = 0; i < array[fila].length; i++) {//bucle for que suma toda la fila en la variable fila
                        suma_fila += array[fila][i];
                    }
                    System.out.println("La suma de los elementos de la fila " + fila + " es: " + suma_fila);//muestra el resultado
                    System.out.println();
                    break;

                case 3: //caso de sumar la columna
                    System.out.println("Que columna quieres sumar");
                    int columna = entrada.nextInt();
                    while (columna < 0 || columna >= array[columna].length) { //Lo mismo que en case 2 para comprobar que sea una columna valida
                        System.out.println("Esa columna no es válida. Introduce una fila válida:");
                        fila = entrada.nextInt();
                    }
                    int suma_columna = 0; // sumatorio de la columna
                    for (int i = 0; i < array[columna].length; i++) {//el ciclo for que cambia de fila con la misma columna para sumar todos los valores que hay en una misma columna
                        suma_columna += array[i][columna];
                    }
                    System.out.println("La suma de los elementos de la fila " + columna + " es: " + suma_columna);
                    System.out.println("Que programa quieres hacer ahora");
                    System.out.println();
                    break;

                case 4://para sumar la diagonal

                    int suma_diagonal = 0;// declaracion del contador de la suma de la diagonal
                    for (int i = 0; i < array.length; i++) { // ciclo for para recorer el array
                        for (int j = 0; j < array[i].length; j++) {
                            if (j == i) {// y como solo queremos saber la diagonal nos emos dado cuenta que siempre seran igual  0,0 1,1 2,2 y este if para sumar solo los valores que esten en esta posicion
                                suma_diagonal += array[i][j];
                            }
                        }
                    }
                    System.out.println("La suma de la diagonal es " + suma_diagonal);// mostramos por consola el resultado

                    System.out.println();
                    break;
                case 5://caso para sumar los valores de la diagonal inversa
                    int suma_invdiagonal = 0; //iniciamos eel sumatorio
                    int n = array.length; // iniciamos una variable con el valor de la longitud de la matriz

                    for (int i = 0; i < n; i++) { //bucle for para recorer el array
                        suma_invdiagonal += array[i][n - 1 - i]; //aqui hara el sumatorio de la ultima posicion de la fila pero al suamrle 1 ira cada vez una posicion hasta el centro en la prime seria 4-1 3 es decir array [0][3] pero la sigiente sera array [1][2] por que i sera 1 y n 2 y asi hasta llegar a [3][]0
                    }
                    System.out.println("La suma de la diagonal inversa es: " + suma_invdiagonal);
                    System.out.println();
                    break;

                case 6://sumatorio
                    double sumatorio = 0; //variable donde iremos almacenar el sumatorio
                    double media =0;// variable para calcular la media
                    for (int i = 0; i < array.length; i++) {//for para recorrer el array
                        for (int j = 0; j < array[i].length; j++) {
                            sumatorio += array[i][j];//el sumatorio de todos los valores del array
                            media ++; //se suma 1 por cada valor que tengamos en el array para calcular la media
                        }
                    }
                    System.out.println("La suma de todos los valores  es " + sumatorio);
                    double media_final = sumatorio / media;
                    System.out.println("La media del array es  "+ media_final);

                    System.out.println();
                    break;
                default://default si introducimos un valor no valido
                    System.out.println("Introduce un numero valido");

            }


        } while (opcion != 7);//si apretamos 7 y se apaga el programa
        System.out.println("Hasta luego");
    }


}
















