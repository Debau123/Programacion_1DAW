package Ejercicios_Classe;
import java.util.*;
public class Ejercicos_classes_array {
    public static void main(String[] args) {
        String[] vector= {"lunes", "martes","miercoles" ,"jueves","viernes","sabado", "domingo"};
        Integer [] vector_2= {1 ,100, 50,65, 88,110};//Ejemplo Integer
        //ordenar acendente vector
        Arrays.sort(vector);
        System.out.println(Arrays.toString(vector));

        //mostrar  descendente

       /* for(int index = vector.length-1; index >=0;index--) {
            System.out.print("  "+vector[index]+"  ");
        }*/

        //ordenar descendente
        Arrays.sort(vector_2, Collections.reverseOrder());
        System.out.println(Arrays.toString(vector_2));

        //busqueda binaria
        int encuentraDia = Arrays.binarySearch(vector, "sabado");
        System.out.println(encuentraDia);





    }















}
