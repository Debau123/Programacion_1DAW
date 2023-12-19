package Ejercicios_array;

import java.util.Arrays;

import java.util.Arrays;
import java.util.Collections;

public class Ejercicio_entregable_array2 {
    public static void main(String[] args) {
        int[] vector = new int[10];//declaro el primer vector
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 31);//le doy valores aleatorios de 0 a 30 incluidos
        }
        System.out.print("a) ");
        for (int elemento : vector) {

            System.out.print(elemento + " ");
        }
        int sumatorio = 0;
        int media = 0;
        for (int i = 0; i < vector.length; i++) {
            sumatorio = sumatorio + vector[i];//aqui hago el sumatorio
            media = sumatorio / vector.length;//aqui hago la media
        }
        System.out.println();
        System.out.print("b) ");
        System.out.println("La suma del array es  " + sumatorio + " .La media del array es  " + media);
        Arrays.sort(vector);//aqui ordeno el vector
        System.out.print("c) ");
        System.out.println(Arrays.toString(vector));
        System.out.print("d) ");
        System.out.println("El numero menor es " + vector[0] + " el numero mayor es " + vector[9]);//como esta ordenado solo imprimo el vector 0 y vector 10
        int[] vector_2 = new int[10];
        Arrays.fill(vector_2, -10);
        System.out.println("e) Vector omplert amb -10: " + Arrays.toString(vector_2));
        int[] vector_3 = new int[10];//aqui declaro el nuevo vector
        System.arraycopy(vector_2, 0, vector_3, 0, vector.length);//aqui copio el vector 3 en el nuevo vector
        System.out.println("f) Vector copiar amb el vector 3 : " + Arrays.toString(vector_3));
        Arrays.fill(vector_3, 4, 9, 3);// aqui adigno el valor 3 de 5 a 9
        System.out.println("g) El vector tendria con el cambio estos valores " + Arrays.toString(vector_3));
        Integer[] vector_4 = new Integer[10];//aqui creo el 3 array
        for (int i = 0; i < vector_3.length; i++) {//aqui hago el array para que pase por todos los arrays
            vector_4[i] = vector_3[i] * vector[i];//aqui le doy los valores al nuevo array multiplando los 2 primeros array
        }
        System.out.println("h) Los valores del nuevo array son  " + Arrays.toString(vector_4));
        Arrays.sort( vector_4, Collections.reverseOrder());//Los he ordenado de forma descendente para  haerlo diferente como antes
        System.out.println("i) "+Arrays.toString(vector_4));



    }


}

