package Ejercicios_array;

import java.util.Arrays;
import java.util.Collections;

public class Ejercicio_entregables_Array {
    public static void main(String[] args) {
        int[] vector = new int[10];//declaro el primer vector
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 31);//le doy valores aleatorios de 0 a 30 incluidos
        }

        for (int elemento : vector) {
            System.out.print(+elemento + " ");
        }
        int sumatorio = 0;
        int media = 0;
        for (int i = 0; i < vector.length; i++) {
            sumatorio = sumatorio + vector[i];//aqui hago el sumatorio
            media = sumatorio / vector.length;//aqui hago la media
        }
        System.out.println();

        System.out.println("La suma del array es  " + sumatorio);
        System.out.println("La media del array es  " + media);
        Arrays.sort(vector);//aqui ordeno el vector

        System.out.println(Arrays.toString(vector));

        System.out.println("El numero menor es " + vector[0] + " el numero mayor es " + vector[9]);
        Arrays.fill(vector, -10);
        System.out.println(Arrays.toString(vector));//aqui es para confirmar que todos son menos 1

        int[] vector_2 = new int[10];//aqui declaro el vector 2
        System.arraycopy(vector, 0, vector_2, 0, vector.length);//aqui copio el vector 1 en el vector 2
        System.out.println("Esta es la copia del vector anterior " + Arrays.toString(vector_2));

        Arrays.fill(vector_2, 4, 9, 3);// aqui adigno el valor 3 de 5 a 9
        System.out.println("El vector tendria con el cambio estos valores " + Arrays.toString(vector_2));


        Integer[] vector_3 = new Integer[10];//aqui creo el 3 array
        for (int i = 0; i < vector_3.length; i++) {//aqui hago el array para que pase por todos los arrays
            vector_3[i] = vector_2[i] * vector[i];//aqui le doy los valores al nuevo array multiplando los 2 primeros array
        }
        System.out.println("Los valores del nuevo array son  " + Arrays.toString(vector_3));

        Arrays.sort(vector_3, Collections.reverseOrder());//Los he ordenado de forma descendente para  haerlo diferente como antes
        System.out.println(Arrays.toString(vector_3));


    }


}
